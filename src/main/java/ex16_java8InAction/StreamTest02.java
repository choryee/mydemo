//package ex16_java8InAction;
//
//import ex16_java8InAction.StreamTest01.ToList;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//import java.util.*;
//import java.util.function.BiConsumer;
//import java.util.function.BinaryOperator;
//import java.util.function.Function;
//import java.util.function.Supplier;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import static ex16_java8InAction.Dish.Type.*;
//import static java.util.stream.Collectors.*;
//
//public class StreamTest01 {
//    public static void main(String[] args) {
//        List<Dish>  menu = Arrays.asList(
//           new Dish("pork", false, 800, MEAT),
//           new Dish("rice",  true, 200, OTHER),
//           new Dish("prawns", false, 300, FISH),
//           new Dish("pizza", true, 120, OTHER)
//        );
//
//        String[] arrayOfWords={"Goodbye", "World"};
//        Stream<String> streamOfWords=Arrays.stream(arrayOfWords);
//
//        List<String> words=Arrays.asList("Java8", "Lamdas","Action");
//        System.out.println(
//        words.stream()
//                .map(m->m.split(""))
//                //.map(Arrays::stream)
//                .flatMap(Arrays::stream)
//                .distinct()
//                .collect(Collectors.toList())
//        );
//
//        menu.stream()
//                .filter(m->{
//                    return m.getCalories()>300;
//                })
//                .map(Dish::getName)
//                .forEach(System.out::println);
//
//
//        Map<Dish.Type, Integer> map = menu.stream()
//                .collect(Collectors.toMap(
//                        Dish::getType,     // Key mapper
//                        Dish::getCalories, // Value mapper
//                        (existing, replacement) -> replacement) // Merge function (in case of key collision)
//                );
//        System.out.println(map);
//
//        System.out.println(
//                menu.stream()
//                        .filter(m->m.getCalories()>100)
//                        .map(Dish::getName)
//                        .limit(1)
//                        .collect(Collectors.toList())
//        );
//
//        System.out.println(// IntSummaryStatistics{count=4, sum=1420, min=120, average=355.000000, max=800}
//            menu.stream().collect(summarizingInt(Dish::getCalories))
//        );
//
//        IntSummaryStatistics intSummaryStatistics=menu.stream().collect(summarizingInt(Dish::getCalories));
//        System.out.println(intSummaryStatistics );
//
//        String result= menu.stream().map(Dish::getName).collect(Collectors.joining(", "));
//        System.out.println(result );
//        String[] str=result.split(" ");
//        for(String s : str){
//            System.out.println("s:"+s);
//        }
//
//        System.out.println(
//                menu.stream().collect(reducing(0, Dish::getCalories, (a,b)->a+b))
//        );
//
//        System.out.println(
//                menu.stream()
//                        .map(Dish::getCalories)
//                        .collect(counting())
//        );
//
//        System.out.println("----------");
//        System.out.println(
//                menu.stream()
//                        .collect(toList())
//        );
//
//        ToList<Dish>.supplier
//    }// main
//
//    public  static Collector<Object, ?, Integer> counting() {
//        return reducing(0, a->1, Integer::sum);
//    }
//
//    static class ToList<T> implements Collector<T, List<T>, List<T>>{
//
//        @Override
//        public Supplier<List<T>> supplier() {
//            return ()->new ArrayList<>();
//        }
//
//        @Override
//        public BiConsumer<List<T>, T> accumulator() {
//            return null;
//        }
//
//        @Override
//        public BinaryOperator<List<T>> combiner() {
//            return null;
//        }
//
//        @Override
//        public Function<List<T>, List<T>> finisher() {
//            return null;
//        }
//
//        @Override
//        public Set<Characteristics> characteristics() {
//            return null;
//        }
//    }// class ToList
//
//}// public class
//
//
//
//
//
//@Data
//@AllArgsConstructor
//class Dish {
//    private String name;
//    private boolean vegetarian;
//    private int calories;
//    private Type type;
//
//    public enum Type {
//        MEAT, FISH, OTHER
//    }
//}
//
