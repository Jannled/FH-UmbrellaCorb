package UmbrellaCorp.UmbrellaTravel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import UmbrellaCorp.UmbrellaTravel.entity.User;
import UmbrellaCorp.UmbrellaTravel.repository.BenutzerRepository;

@Configuration
@EnableWebSecurity
@ComponentScan(basePackageClasses = AuthenticatedUserService.class)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter 
{
	@Autowired
	BenutzerRepository benutzerRepository;

	//@Autowired
	//private UserDetailsService userDetailsService;

	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		http.csrf().disable(); //Prevent POST 403 
		http.authorizeRequests().antMatchers("**").permitAll().anyRequest().authenticated().and();
		http.formLogin().loginPage("/login.html").permitAll();
		http.logout().logoutSuccessUrl("/").permitAll();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		auth.authenticationProvider(authenticationProvider());
	}

	@Bean
	public PasswordEncoder passwordEncoder() 
	{
		return new BCryptPasswordEncoder();
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() 
	{
		PasswordEncoder pswdenc = passwordEncoder();
		User.setPasswordEncoder(pswdenc);
		final DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(pswdenc);
		return authProvider;
	}

	@Bean
	public UserDetailsService userDetailsService() 
	{
		return new AuthenticatedUserService();
	};
}