package coderhouseAngular.proyectoFinal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Movie {
    private String id;
    private String name;
    private String img;
    private Long price;
    private MovieDetail detail;

    public Movie() {
    }

    public Movie(String name) {
        this.name = name;
    }

}
