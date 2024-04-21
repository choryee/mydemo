//package ex10_Refactorying_Java.movie01;
//
//import ex13_JavaCodingInterview.OnlieLibray.Reader;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//@Data
//@AllArgsConstructor
//public class Customer {
//    private List<Rental> list;
//    private String statement;
//
//    Customer(Rental rental){
//        list=new ArrayList<>();
//        list.add(rental);
//    }
//
//    public String getStatement(Movie movie){
//
////        for(Rental rental : list){
////            //for(int i=0; i<list.size(); i++){
////                System.out.println("rented : "+ rental.getList().toString());
////            //}
////        }
//        List<Rental> rentalList =
//                list.stream()
//                .collect(Collectors.toList());
//
//        System.out.println(rentalList.toString());
//        System.out.println("---------------");
//        System.out.println(
//         rentalList.stream()
//                .map(Rental::getList)
//                .collect(Collectors.toList())
//        );
//
//        System.out.println("---------------");
//        String multiplyPrice = rentalList.stream()
//                .map(Rental::getList)
//                .flatMap(List::stream)
//                .map(a -> {
//                    if (a.getMovieTypeEnum() == MovieType.NEW_RELEASE) {
//                        return String.valueOf(a.getPriceCode() * 2);
//                    } else if (a.getMovieTypeEnum() == MovieType.CHILDREN) {
//                        return String.valueOf(a.getPriceCode() * 3);
//                    } else {
//                        return String.valueOf(a.getPriceCode());
//                    }
//                })
//                .collect(Collectors.joining(", "));
//        System.out.println(multiplyPrice );
//
//        System.out.println("---------------");
//        Map<String, String> multiplyPriceMap
//                = rentalList.stream()
//                .map(Rental::getList)
//                .flatMap(List::stream)
//                .collect(Collectors.toMap(
//                        Movie::getTitle,
//                        i -> {
//                            if (i.getMovieTypeEnum() == MovieType.NEW_RELEASE) {
//                                return String.valueOf(i.getPriceCode() * 2);
//                            } else if (i.getMovieTypeEnum() == MovieType.CHILDREN) {
//                                return String.valueOf(i.getPriceCode() * 3);
//                            } else {
//                                return String.valueOf(i.getPriceCode());
//                            }
//                        }
//                ));
//        System.out.println(multiplyPriceMap);
//
//
//        StringBuffer sb = new StringBuffer("Rented book is "+movie.getTitle());
//        //sb.append(movie.getTitle());
//        sb.append(" and mount is "+multiplyPriceMap.get("Little Prince"));
//        String result = sb.toString();
//
//        return result;
//    }
//}
