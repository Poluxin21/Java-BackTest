package org.atlas.app.Controllers;


import org.atlas.app.Services.Users.AuthService;
import org.atlas.app.models.Users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/auth")
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService)
    {
        this.authService = authService;
    }


    @PostMapping("/login")
    public String login(@RequestBody User loginRequest)
    {
        return authService.authenticate(loginRequest);
    }

}
