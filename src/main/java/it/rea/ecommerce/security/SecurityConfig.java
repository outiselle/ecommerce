package it.rea.ecommerce.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(final HttpSecurity http) throws Exception {
	    http
	      .csrf().disable()
	      .authorizeRequests()
//	      .antMatchers("/admin/**").hasRole("ADMIN")
//	      .antMatchers("/anonymous*").anonymous()
//	      .antMatchers("/login*").permitAll()
	      .antMatchers("/user/signin").permitAll()
	      .anyRequest().authenticated();
	}

}
