package de.weyrich.example.springsecurity;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        System.out.println("CustomAuthenticationProvider called");
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        // accepts all authentication objects
        return true;
    }
}
