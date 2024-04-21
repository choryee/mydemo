import java.util.*;
import java.util.stream.Collectors;

public class StreamTest03 {
    public static void main(String[] args) {
        String[] strings = {"hello", "gem", "possible"};

        Map<String, Integer> result = Arrays.stream(strings)
                .collect(
                        Collectors.reducing(
                                new HashMap<>(),
                                str -> {
                                    Map<String, Integer> map = new HashMap<>();
                                    map.put(str, str.length());
                                    return map;
                                },
                                (map1, map2) -> {
                                    map1.putAll(map2);
                                    return map1;
                                }
                        )
                );
        System.out.println(result);

        //Counting the number of words longer than 5 characters in a list:
        List<String> words1 = Arrays.asList("apple", "banana", "orange", "strawberry", "kiwi", "cup");
        List<Integer> wordLength = words1.stream()
                .map(String::length)
                .filter(m->m>5)
                .collect(Collectors.toList());
        System.out.println(wordLength);

        Map<String, Integer> map =
                words1.stream()
                        .sorted(Comparator.comparing(String::length))
                        .collect(Collectors.reducing(
                                new HashMap<>(),
                                str->{
                                    Map<String, Integer> map11=new HashMap<>();
                                    map11.put(str, str.length());
                                return map11;
                                },
                                (map1, map2)->{
                                    map2.putAll(map1);
                                    return map2;
                                }

                        ));
        System.out.println(map);




    }//main
}
