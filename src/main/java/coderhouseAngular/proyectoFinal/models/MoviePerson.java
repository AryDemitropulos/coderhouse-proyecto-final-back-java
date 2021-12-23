package coderhouseAngular.proyectoFinal.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MoviePerson {
    @JsonProperty("type")
    private String type;
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
