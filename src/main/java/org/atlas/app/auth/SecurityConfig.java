package org.atlas.app.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@SuppressWarnings("deprecation")
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()  // Desabilita a proteção CSRF para API REST.
                .authorizeRequests()
                .requestMatchers("/api/auth/login").permitAll()  // Permite acesso livre ao login.
                .anyRequest().authenticated()  // Exige autenticação para qualquer outra requisição.
                .and()
                .formLogin().disable()  // Desabilita o login padrão do Spring Security (caso esteja usando autenticação via formulário).
                .httpBasic().disable();  // Desabilita a autenticação básica HTTP (caso queira usar JWT ou outro método).

        return http.build();
    }
}
