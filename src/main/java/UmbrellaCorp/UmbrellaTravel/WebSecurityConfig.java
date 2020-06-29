package UmbrellaCorp.UmbrellaTravel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import UmbrellaCorp.UmbrellaTravel.repository.BenutzerRepository;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter 
{
	@Autowired
	BenutzerRepository repoUser;

	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		http.authorizeRequests().antMatchers("**").permitAll().anyRequest().authenticated();
		http.formLogin().loginPage("/login.html").permitAll();
		http.logout().permitAll();
	}

	@Bean
	@Override
	@SuppressWarnings("deprecation")
	public UserDetailsService userDetailsService() 
	{
		// CLUDGE
		repoUser.save(new UmbrellaCorp.UmbrellaTravel.User("Default", "User", "user", "password"));
		repoUser.save(new UmbrellaCorp.UmbrellaTravel.User("Umbrella", "Travel", "umbrella", "tours"));

		// CLUDGE
		repoUser.save(new UmbrellaCorp.UmbrellaTravel.User("Felix", "S", "felix@umbrella.tours", "felix"));
		repoUser.save(new UmbrellaCorp.UmbrellaTravel.User("Jannik", "S", "jannik@umbrella.tours", "jannik"));
		repoUser.save(new UmbrellaCorp.UmbrellaTravel.User("Jendrik", "S", "jendrik@umbrella.tours", "jendrik"));
		repoUser.save(new UmbrellaCorp.UmbrellaTravel.User("Niklas", "H", "niklas@umbrella.tours", "niklas"));

		// CLUDGE
		UserDetails admin = User.withDefaultPasswordEncoder().username("admin").password("MORE_POWER!").roles("ADMIN").build();

		InMemoryUserDetailsManager idm = new InMemoryUserDetailsManager(admin);

		for(UmbrellaCorp.UmbrellaTravel.User u : repoUser.findAll())
		{
			idm.createUser(User.withDefaultPasswordEncoder().username(u.getEmail()).password(u.getPasswort()).roles("USER").build());
		}

		return idm;
	}
}