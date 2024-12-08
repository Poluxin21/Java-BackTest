package org.atlas.app.Services.Users;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.atlas.app.models.Users.User;
import org.atlas.app.models.Users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UserRepository _userRepository;

    private static final String SECRET_KEY = "secret";

    public String register(User user) {
        Optional<User> existingUser = _userRepository.findByUsername(user.getUsername());
        Optional<User> existingUserByMail = _userRepository.findByEmail((user.getEmail()));
        if(existingUser.isPresent())
        {
            return "O usuario ja está cadastrado";
        } else if (existingUserByMail.isPresent())
        {
            return "Ja existe um usuario cadastrado com esse email";
        } else
        {
            _userRepository.save(user);
            return "Usuario salvo com sucesso";
        }
    }

    public String authenticate(User user) {
        Optional<User> existingUser = _userRepository.findByUsername(user.getUsername());

        if (existingUser.isPresent()) {
            User dbUser = existingUser.get();
                if (dbUser.getPassword().equals(user.getPassword())) {
                return generateToken(dbUser.getUsername());
            }
        }
        throw new RuntimeException("Credenciais inválidas!");
    }

    public Optional<User> findUser(String username) {
        if (username != null)
        {
            return _userRepository.findByUsername(username);
        } else {
            return Optional.empty();
        }
     }

    private String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();
    }
}
