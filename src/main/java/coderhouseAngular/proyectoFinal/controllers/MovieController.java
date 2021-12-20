package coderhouseAngular.proyectoFinal.controllers;

import coderhouseAngular.proyectoFinal.models.Movie;
import coderhouseAngular.proyectoFinal.services.MovieService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("")
    public ResponseEntity<List<Movie>> getMovies(){
        return ResponseEntity.ok(movieService.list());
    }
}
