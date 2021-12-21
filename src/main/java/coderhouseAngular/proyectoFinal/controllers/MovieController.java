package coderhouseAngular.proyectoFinal.controllers;

import coderhouseAngular.proyectoFinal.models.Movie;
import coderhouseAngular.proyectoFinal.services.MovieService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("")
    public ResponseEntity<List<Movie>> getMovies(){
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    @GetMapping("/filter")
    public ResponseEntity<List<Movie>> getFilterMovies(@RequestParam(value="ids") List<String> ids){
        return ResponseEntity.ok(movieService.getFilterMovies(ids));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable("id") String id){
        return ResponseEntity.ok(movieService.getMovie(id));
    }
}
