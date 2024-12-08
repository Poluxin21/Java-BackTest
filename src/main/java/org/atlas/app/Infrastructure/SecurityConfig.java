package org.atlas.app.Infrastructure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) {
        try {
            http.csrf().disable()
                    .authorizeRequests()
                    .requestMatchers("/api/auth/login").permitAll()
                    .anyRequest().authenticated()
                    .and()
                    .formLogin().disable()
                    .httpBasic().disable();

            return http.build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
