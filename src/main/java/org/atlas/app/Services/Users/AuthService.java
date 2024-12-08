package org.atlas.app.Services.Users;

import org.atlas.app.models.Users.User;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private static final String SECRET_KEY = "secret";

    public String authenticate(User user) {
        if ("admin".equals(user.getUsername()) && "password123".equals(user.getPassword())) {
            return generateToken(user.getUsername());
        } else {
            throw new RuntimeException("Credenciais inválidas!");
        }
    }

    private String generateToken(String username) {
        return "token-" + username;
    }
}
