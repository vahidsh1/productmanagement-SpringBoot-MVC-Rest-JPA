package com.digipay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.securityMatcher("/digital/**")
                .authorizeHttpRequests(
                authorize -> authorize
                        .anyRequest().hasAuthority("list"))
//                        .anyRequest().authenticated())
                .formLogin(withDefaults()).httpBasic(withDefaults());
//        http.authorizeHttpRequests(authorize -> authorize.anyRequest().authenticated())
//                .formLogin(withDefaults()).httpBasic(withDefaults());
//                .securityMatcher("/product/digital/**")
//                .authorizeHttpRequests(authorize -> authorize
//                        .anyRequest().hasRole("Admin"))
//                .httpBasic(withDefaults());

//                .authorizeHttpRequests(authorize -> authorize
//                .anyRequest().authenticated());
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        var userDetailService = new InMemoryUserDetailsManager();

        UserDetails user = User
                .withUsername("vahid")
                .password("vahid")
                .authorities("create")
                .build();

        userDetailService.createUser(user);
        return userDetailService;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
