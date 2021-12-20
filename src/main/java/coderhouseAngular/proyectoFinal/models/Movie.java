package coderhouseAngular.proyectoFinal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Movie {
    private String id;
    private String name;
    private String rating;
    private String distributor;
    private String description;
    private String duration;
    private String category;

    @JsonProperty("URLPoster")
    private String urlPoster;

    @JsonProperty("URLTrailerYoutube")
    private String urlTrailerYoutube;

    private List<MoviePerson> personList;

    public Movie() {
    }

    public Movie(String name) {
        this.name = name;
    }
}
