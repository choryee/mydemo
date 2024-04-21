package ex10_Refactorying_Java.movie01;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    private String title;
    private int priceCode;
    private Enum<MovieType> movieTypeEnum;
}
