package ex10_Refactorying_Java_2nd.chapter06.introduceParameterObject;

import java.util.List;
import java.util.stream.Collectors;

public class Before {
    Station station;

    public List<Reading> readingsOutsideRange(Station station, int min, int max) {
        return station.readings
                .stream()
                .filter(r -> r.temp < min || r.temp > max)
                .collect(Collectors.toList());
    }
}
