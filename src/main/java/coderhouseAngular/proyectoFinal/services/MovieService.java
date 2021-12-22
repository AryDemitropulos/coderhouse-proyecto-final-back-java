package coderhouseAngular.proyectoFinal.services;

import coderhouseAngular.proyectoFinal.models.Movie;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.asm.TypeReference;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    private ObjectMapper mapper = new ObjectMapper();

    public MovieService(ObjectMapper mapper) {
        this.mapper = mapper;
        this.mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    }

    public List<Movie> getAllMovies(){
        List<Movie> response = new ArrayList<Movie>();
        try {
            response = Arrays.asList(mapper.readValue(new URL("file:src/main/java/data/movies.json"), Movie[].class));
        } catch (Exception e) {
            System.out.println("******ERROR " + e.getMessage());
        }
        return response;
    }

    public List<Movie> getFilterMovies(List<String> ids){
        List<Movie> response = new ArrayList<Movie>();
        if(ids.size() == 0) return  response;
        try {
            response = Arrays.asList(mapper.readValue(new URL("file:src/main/java/data/movies.json"), Movie[].class));
            if (ids.size() > 0) {
                response=  response.stream().filter(
                        movie -> ids.contains(movie.getId())
                ).collect(Collectors.toList());
            }
        } catch (Exception e) {
            System.out.println("******ERROR " + e.getMessage());
        }
        return response;
    }

    public Movie getMovie(String id){
        List<String> ids = new ArrayList<>();
        ids.add(id);
        return this.getFilterMovies(ids).get(0);
    }
}
