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

@Service
public class MovieService {

    private ObjectMapper mapper = new ObjectMapper();

    public List<Movie> list(){
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List<Movie> response = new ArrayList<Movie>();
        try{
            response = Arrays.asList(mapper.readValue(new URL("file:src/main/java/data/movies.json"), Movie[].class));
        }catch (Exception e){
            System.out.println("******ERROR " + e.getMessage());
        }
        return response;
    }
}
