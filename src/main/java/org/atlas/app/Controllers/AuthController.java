package org.atlas.app.Controllers;


import org.atlas.app.Services.AuthService;
import org.atlas.app.models.Users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public String register(@RequestBody User registerRequest)
    {
        return authService.register(registerRequest);
    }

    @PostMapping("/login")
    public String login(@RequestBody User loginRequest)
    {
        return authService.authenticate(loginRequest);
    }
}
