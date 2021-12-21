package coderhouseAngular.proyectoFinal.controllers;

import coderhouseAngular.proyectoFinal.models.AuthRequest;
import coderhouseAngular.proyectoFinal.models.AuthResponse;
import coderhouseAngular.proyectoFinal.models.Movie;
import coderhouseAngular.proyectoFinal.models.RegisterRequest;
import coderhouseAngular.proyectoFinal.services.AuthService;
import coderhouseAngular.proyectoFinal.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request){
        return ResponseEntity.ok(authService.login(request));
    }

    @PutMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(authService.register(request));
    }
}
