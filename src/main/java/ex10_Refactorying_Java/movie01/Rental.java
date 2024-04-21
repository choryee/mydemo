package ex10_Refactorying_Java.movie01;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Rental {
    private List<Movie> list;
    private int daysRented;

    Rental(Movie movie, int daysRented){
        list=new ArrayList<>();
        list.add(movie);
        this.daysRented=daysRented;
    }

    //여기에 lombok에 의해 getList()있음.
}
