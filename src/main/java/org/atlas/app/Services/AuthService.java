package org.atlas.app.Services;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.atlas.app.models.User;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private static final String SECRET_KEY = "secret";

    public String authenticate(User user) {
        if ("admin".equals(user.getUsername()) && "password".equals(user.getPassword())) {
            return generateToken(user.getUsername());
        }
        throw new RuntimeException("Invalid credentials");
    }

    private String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();
    }
}
