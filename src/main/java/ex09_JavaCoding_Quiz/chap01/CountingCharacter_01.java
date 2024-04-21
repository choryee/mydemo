package ex09_JavaCoding_Quiz.chap01;

import ex12_ReFactorying_YukiHirosi.Char;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class CountingCharacter_01 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,6);
        List<Integer> newList = list.stream()
                .filter(i -> i>5 )
                .collect(Collectors.toList());
        System.out.println(newList);

        String apple="apple";
        System.out.println(countChars(apple));

    }//main

    public static Map<Character, Long> countChars(String str){
        Map<Character, Long> result =
        //str.chars()는 문자열을 IntStream으로 변환합니다. 이는 각 문자를 해당하는 정수 값으로 매핑하는데, 이 정수 값은 해당 문자의 Unicode 코드 포인트입니다. 따라서 IntStream은 유니코드 코드 포인트의 스트림을 나타냅니다.
                //
                //IntStream을 사용하는 이유는 문자열의 각 문자를 효율적으로 처리하기 위해서입니다. IntStream은 정수 값을 다루기 때문에 문자열의 각 문자를 정수 값으로 변환하여 처리할 수 있습니다. 이렇게 하면 문자를 다루는데 있어서 유니코드 코드 포인트를 직접 다룰 수 있게 됩니다.
                str.chars()
                .mapToObj(c -> (char)c)
                .collect( Collectors.groupingBy( c -> c, Collectors.counting()) );

//                        str.chars()
//                        .forEach(System.out::println);
//
    return result;
    }

}


