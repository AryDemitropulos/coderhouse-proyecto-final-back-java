package coderhouseAngular.proyectoFinal.controllers;

import coderhouseAngular.proyectoFinal.models.AuthRequest;
import coderhouseAngular.proyectoFinal.models.AuthResponse;
import coderhouseAngular.proyectoFinal.models.OrderRequest;
import coderhouseAngular.proyectoFinal.models.RegisterRequest;
import coderhouseAngular.proyectoFinal.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private AuthService authService;

    @PutMapping("/new")
    public ResponseEntity newOrder(@RequestBody OrderRequest request){
        return ResponseEntity.ok(request.getTotal());
    }

}
