package coderhouseAngular.proyectoFinal.models;

import lombok.Data;

import java.util.List;

@Data
public class MovieDetail {
    private String description;
    private String duration;
    private String category;
    private List<MoviePerson> personList;
    private String trailer;
}
