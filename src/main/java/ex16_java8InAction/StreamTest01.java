//package ex16_java8InAction;
//
//import com.sun.org.apache.xpath.internal.operations.String;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//import java.awt.*;
//import java.util.*;
//import java.util.List;
//import java.util.function.*;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import static ex16_java8InAction.Dish.Type.*;
//import static java.util.stream.Collectors.*;
//
//public class StreamTest01 {
//    public static void main(String[] args) {
//        Dish dishPork= new Dish("pork", false, 800, MEAT);
//        Dish dishRice=new Dish("rice",  true, 200, OTHER);
//        Dish dishPrawns=new Dish("prawns", false, 300, FISH);
//        Dish dishPizza= new Dish("pizza", true, 120, OTHER);
//        List<Dish>  menu = Arrays.asList(dishPork, dishRice, dishPrawns, dishPizza);
//
//        Map<String, List<Dish>> mapList=new HashMap<>(); // pizza=객체
//        List<Dish> newList=new ArrayList<>();
//
//        Map<String, Dish> map=new HashMap<>();
//        map.put("pork", dishPork );
//        map.put("rice", dishRice);
//        map.put("prawns", dishPrawns);
//        map.put("pizza", dishPizza);
//        Set<String> keySet=map.keySet();
//        System.out.println("keySet: "+keySet);
//
////        for(int i=0; i<menu.size(); i++){
////            if(menu.get(i).getName().equals(keySet.contains("pork"))){
////                String key=keySet.toString();
////                newList.add(menu.get(i));
////                mapList.put(key, newList);
////            }
////        }
//        for(String s : map.keySet()){
//            if(s.equals("pork")){
//                List<Dish> list = new ArrayList<>();
//                list.add(map.get(s));
//                mapList.put(s, list);
//            }
//        }
//        System.out.println(mapList);
//
//        System.out.println(
//                menu.stream()
//                        .collect(summarizingInt(Dish::getCalories))
//        );
//
//        String concatenatedNames =
//                menu.stream()
//                        //.map(Dish::getName)
//                        .collect(reducing(
//                                "",
//                                Dish::getName,
//                                (a, b)->a+", "+b
//                        )
//                );
//               // .map(Dish::getName)
//               // .orElse("");
//
//        System.out.println(concatenatedNames);
//
//        List<String> dishNames =
//                menu.stream()
//                        .map(Dish::getName)
//                        .collect(Collectors.reducing(
//                                new ArrayList<>(),
//                                Collections::singletonList,
//                                (list1, list2) -> {
//                                    List<String> combinedList = new ArrayList<>(list1);
//                                    combinedList.addAll(list2);
//                                    return combinedList;
//                                }
//                        ));
//
//        System.out.println(dishNames);
//
//        List<String> singleItemList = Collections.singletonList("Hello");
//        System.out.println(singleItemList);
//
//        String s1="Hello";
//        String s2="Trump";
//
//        System.out.println(
//            concentate.apply(s1,s2)
//        );
//
//
//        Comparator<String> integerComparator=Comparator.comparing(s -> s.length());
//
//        String [] strings={"hello","gem","possible"};
//        //String [] strings={""};
//        String result = Arrays.stream(strings)
//                //.map(String::length)
//                .max(Comparator.comparing(s -> s.length()))
//                .orElseThrow(()->new IllegalArgumentException("aa"));
//        System.out.println(result);
//
//        String aa="hello";
//        System.out.println(aa.length());
//
//        String[] strings1=aa.split("");
//        for(String s : strings1){
//            System.out.print(s+" ");
//        }
//        System.out.println("\n");
//
//
//        List<Integer> strs = Arrays.stream(strings)
//                //.map(m->m.split(","))
//                .map(String::length)
//                .collect(toList());
//        System.out.println(strs);
//
//        String [] strings2={"hello","gem","possible"};
//        Map<String, Integer> map1=new HashMap<>();
//        List<Integer> numbers=new ArrayList<>();
//        for(String s : strings2){
//            int intLength=s.length();
//            map1.put(s,intLength);
//            numbers.add(intLength);
//        }
//        System.out.println(
//                numbers.stream()
//                        .sorted()
//                        .collect(toList())
//        );
//        System.out.println(map1);
//        System.out.println("-----------");
//
//        String[] strings3={"hello","gem","possible"};
////        System.out.println(
////                Arrays.stream(strings3)
////                        .collect(Collectors.toMap(String::new, String::length)) //Fuc, Fuc
////        );
//
////        System.out.println(
////                Arrays.stream(strings3)
////                        .collect(reducing(
////                                new HashMap<>(),
////                                (a,b)->new String()
////
////                        ))
////        );
//
//         String bb="president";
//         int cc=bb.length();
//        System.out.println(makingMap.apply(bb,cc));
//
//
//    }// main
//    public static BiFunction<String, Integer, Map<String, Integer>> makingMap=(a,b)->{
//        return (Map<String, Integer>) new HashMap<>().put(a,b);
//    };
//
//
//    public static BiFunction<String,String,String> concentate=(a,b)->a+b;
//
//
//
//}// public class
//
//
//class ToList<T> implements Collector<T, List<T>, List<T>>{
//
//    @Override
//    public Supplier<List<T>> supplier() {
//        return ArrayList::new;
//    }
//
//    @Override
//    public BiConsumer<List<T>, T> accumulator() {
//        return List::add;
//    }
//
//    @Override
//    public BinaryOperator<List<T>> combiner() {
//        return (list1, list2) -> {
//            list1.addAll(list2);
//            return list1;
//        };
//    }
//
//    @Override
//    public Function<List<T>, List<T>> finisher() {
//        return Function.identity();
//    }
//
//    @Override
//    public Set<Characteristics> characteristics() {
//        return null;
//    }
//}// class ToList
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
