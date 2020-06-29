package UmbrellaCorp.UmbrellaTravel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter 
{
	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		http.authorizeRequests().antMatchers("**").permitAll().anyRequest().authenticated();
		http.formLogin().loginPage("/login.html").permitAll();
		http.logout().permitAll();
	}

	@Bean
	@Override
	public UserDetailsService userDetailsService() 
	{
		UserDetails admin1 = User.withDefaultPasswordEncoder().username("admin").password("MORE_POWER!").roles("ADMIN").build();
		UserDetails user1 = User.withDefaultPasswordEncoder().username("user").password("password").roles("USER").build();
		UserDetails user3 = User.withDefaultPasswordEncoder().username("umbrella").password("tours").roles("USER").build();

		return new InMemoryUserDetailsManager(admin1, user1, user3);
	}
}