package coderhouseAngular.proyectoFinal.services;

import coderhouseAngular.proyectoFinal.enums.Role;
import coderhouseAngular.proyectoFinal.models.AuthRequest;
import coderhouseAngular.proyectoFinal.models.AuthResponse;
import coderhouseAngular.proyectoFinal.models.Movie;
import coderhouseAngular.proyectoFinal.models.RegisterRequest;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class AuthService {

    public AuthResponse login(AuthRequest request){
        if (request.getUser().toLowerCase().equals("admin")){
            return new AuthResponse("Admin", "Admin", "admin_admin@adminmail.com",Role.ADMIN);
        }else{
            return new AuthResponse("John", "Doe", "john_doe@nobody.com",Role.USER);
        }
    }


    public AuthResponse register(RegisterRequest request) {
        return new AuthResponse(request.getName(), request.getLastname(), request.getEmail(),Role.USER);
    }
}
