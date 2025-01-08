package com.example.jpa_rest_product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http.httpBasic(Customizer.withDefaults());
        http.csrf(csrf -> csrf.disable());

        // Allow all endpoints to access without authentication
//        http.authorizeHttpRequests(request -> request.requestMatchers("/**").permitAll());

        // Allow all endpoint with any authentication
//        http.authorizeHttpRequests(request ->request.anyRequest().authenticated());

        // ALlow all endpoints with admin role only
//        http.authorizeHttpRequests(request -> request.requestMatchers("/**").hasAnyRole("ADMIN", "USER"));

        http.authorizeHttpRequests(
                request ->
                        request
                                .requestMatchers(HttpMethod.GET,"/products", "/products/**").permitAll()
                                .requestMatchers(HttpMethod.POST, "/products").hasAnyRole("ADMIN", "USER")
                                .requestMatchers(HttpMethod.PUT, "/products/**").hasAnyRole("ADMIN", "USER")
                                .requestMatchers(HttpMethod.DELETE, "/products/**").hasRole("ADMIN")
                );

        return http.build();

    }
}
