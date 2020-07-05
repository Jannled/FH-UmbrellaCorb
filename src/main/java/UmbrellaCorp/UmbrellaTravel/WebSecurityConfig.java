package UmbrellaCorp.UmbrellaTravel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import UmbrellaCorp.UmbrellaTravel.repository.BenutzerRepository;

@Configuration
@EnableWebSecurity
@ComponentScan(basePackageClasses = AuthenticatedUserService.class)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter 
{
	@Autowired
	BenutzerRepository benutzerRepository;

	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		http.csrf().disable(); //Prevent POST 403 
		http.authorizeRequests().antMatchers("**").permitAll().anyRequest().authenticated().and();
		http.formLogin().loginPage("/login.html").permitAll();
		http.logout().permitAll();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		auth.jdbcAuthentication().dataSource(benutzerRepository);
	}

	/*@Bean
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

		InMemoryUserDetailsManager idm = new InMemoryUserDetailsManager();

		for(UmbrellaCorp.UmbrellaTravel.User u : repoUser.findAll())
		{
			idm.createUser(User.withDefaultPasswordEncoder().username(u.getEmail()).password(u.getPasswort()).roles("USER").build());
		}

		return idm;
	}*/

	/*@Autowired
	public void globalSecurityConfiguration(AuthenticationManagerBuilder auth) throws Exception 
	{
		auth.userDetailsService(userDetailsService);
	}

	@Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }*/
}