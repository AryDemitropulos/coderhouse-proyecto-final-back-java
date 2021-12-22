package coderhouseAngular.proyectoFinal.models;

import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {

    private List<MovieOrder> movieOrders;

    public Long getTotal(){
        if (movieOrders == null || movieOrders.size()==0)
            return 0l;
        return movieOrders.stream().mapToLong(movie->movie.getPrice()).sum();
    }
}
