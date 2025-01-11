package com.example.mvc_jpa_crud_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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

        http.authorizeHttpRequests(request ->
                request.requestMatchers("/", "/auth/**", "/css/**", "/js/**").permitAll()
                        .anyRequest().authenticated()
                ).formLogin( form ->
                        form.loginPage("/auth/login")
                                .loginProcessingUrl("/authenticateUser")
                                .permitAll()
                ).logout( logout -> logout.permitAll());

        http.httpBasic(Customizer.withDefaults());

//        http.csrf(csrf -> csrf.disable());

        return http.build();
    }
}
