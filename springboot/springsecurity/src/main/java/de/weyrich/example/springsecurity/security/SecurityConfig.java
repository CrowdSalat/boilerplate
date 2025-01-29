package de.weyrich.example.springsecurity.security;

import java.security.interfaces.RSAPublicKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

        @Value("${key.location}")
        private RSAPublicKey key;

        @Bean
        public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
                return httpSecurity.authorizeHttpRequests(authorize ->
                // Here we set authentication for all endpoints
                authorize.anyRequest().authenticated())
                                // Here we enable that we will accept JWTs
                                .oauth2ResourceServer(configure -> configure.jwt(Customizer.withDefaults()))
                                .build();
        }

        @Bean
        public JwtDecoder jwtDecoder() {
                return NimbusJwtDecoder.withPublicKey(this.key).build();
        }

}
