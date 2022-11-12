package com.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AndRequestMatcher;

@EnableWebSecurity(debug = true)
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

//	@Autowired
//	private PasswordEncoder passwordEncoder;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication()
		.withUser("pd@123")
		.password("$2a$10$OGejWqOOuY9dehNmexglxuCOfg/UO4eJMYzmwlT413jNbklNUPHJS").roles("admin")
		.and()
		.withUser("pd123")
		.password("$2a$10$LFNW3Ged00zLnmVKLnY52O3gF/zz1rTHHHvtMlNRtQbtPzT6W6RX2").roles("user");

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
		.authorizeRequests()
		.antMatchers("/hello").authenticated()
		.antMatchers("/hii").authenticated()
		.antMatchers("/helloworld").permitAll()
		.antMatchers("/welcome").authenticated()
		.and()
		.formLogin().loginPage("/mylogin")
		.and()
		.httpBasic()
		.and()
		.logout();
	}

}
