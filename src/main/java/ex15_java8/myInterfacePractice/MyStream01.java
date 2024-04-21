package ex15_java8.myInterfacePractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream01 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,3,4,5,6,7,8);
        numbers.stream()
                .filter(i->i>3)
                .collect(Collectors.toList());

        numbers.forEach(System.out::println);

    }
}
