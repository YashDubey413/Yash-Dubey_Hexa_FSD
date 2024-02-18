package com.hexaware.springoauth2.config;

import org.springframework.cglib.proxy.NoOp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
public class SecurityConfig {

//	@Bean
//	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		
//		return http.
//				authorizeHttpRequests(auth->{
//					auth.requestMatchers("/").permitAll();
//					auth.anyRequest().authenticated();
//				}).oauth2Login(Customizer.withDefaults())
//				.formLogin(Customizer.withDefaults())
//				.build();
//	}
	
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http.authorizeHttpRequests(auth -> {
			auth.requestMatchers("/").permitAll();
			auth.anyRequest().authenticated();
		}).oauth2Login(Customizer.withDefaults()).formLogin(Customizer.withDefaults())
		        .authenticationProvider(authenticationProvider())
				.build();
		}
	
	@Bean
	UserDetailsService userDetailsService() {
		UserDetails admin=User.withUsername("Yash")
				.password("Yash123").roles("ADMIN")
				.build();
		
		UserDetails user=User.withUsername("Kumar")
				.password("Kumar123").roles("USER","HR")
				.build();
		
		return new InMemoryUserDetailsManager(admin,user);
		
	} 
	
	
	AuthenticationProvider authenticationProvider() {
		
		DaoAuthenticationProvider daoAuthenticationProvider=
				new DaoAuthenticationProvider();
		
		daoAuthenticationProvider.setUserDetailsService(userDetailsService());
		daoAuthenticationProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		
		return daoAuthenticationProvider;
			
			
		
	}
	
}
