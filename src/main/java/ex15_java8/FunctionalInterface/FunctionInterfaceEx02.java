package ex15_java8.FunctionalInterface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterfaceEx02 {
    public static void main(String[] args) {
        //07강 실전예제와.. 23'00
        Product productA = new Product(1L, "A", new BigDecimal("10.00"));
        Product productB = new Product(2L, "B", new BigDecimal("25.00"));
        Product productC = new Product(3L, "C", new BigDecimal("96.00"));
        Product productD = new Product(4L, "d", new BigDecimal("125.00"));

        List<Product> products= Arrays.asList(
                productA,
                productB,
                productC,
                productD
        );
        System.out.println(products);
        List<Product> lists=new ArrayList<>();
        for(Product product : products){
            if(product.getPrice().compareTo(new BigDecimal("30"))>0){
                lists.add(product);
            }
        }
        System.out.println(lists);
        BigDecimal twenty=new BigDecimal("20");

        System.out.println("--------------------");
        List<Product> result = filter(products, product->product.getPrice().compareTo(twenty)>0);
        System.out.println(result);

        System.out.println("----주문 출력하기.----------------");
        Order order = new Order(1L, "on-1234", Arrays.asList(
                new OrderedItem(1L, productA, 3),
                new OrderedItem(2L, productB,  5),
                new OrderedItem(3L, productC, 8)
        ) );

        //01'17'51
        System.out.println("order.totalPrice()>> "+order.totalPrice());
    }// main

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> result=new ArrayList<>();
        for(T t : list){
            if(predicate.test(t)){
                result.add(t);
            }
        }
        return result;
    }

    //01'06'00
    public static <T> BigDecimal total( List<T> list, Function<T, BigDecimal> mapper ){
        BigDecimal total=BigDecimal.ZERO;
        for(T t : list){
           total = total.add(mapper.apply(t)); //add는 BigDecimal의 덧셈하는 매소드임.
        }
        return total;
    }

    @Data
    @AllArgsConstructor
    public static class Product{ //Product이 알고 있어야 할것을 쓴다.
        public Long id;
        public String name;
        public BigDecimal price;
    }


    @ToString(callSuper = true)
    public static  class DiscountedProduct extends Product{
        public DiscountedProduct(Long id, String name, BigDecimal price){
            super(id, name, price);
        }
    }

    //7강 01'12'00
    @AllArgsConstructor
    @Data
    public static class OrderedItem{ //OrderedItem가 알고 있어야 할 것을 쓴다.
        public Long id;
        public Product product;
        public int quantity;

        //multiply는 BigDecimal 클래스에서 제공되는 메서드로, 두 BigDecimal 값을 곱하는 연산을 수행합니다.
        //여기서 multiplicand는 현재 BigDecimal 객체와 곱해질 다른 BigDecimal 객체입니다. 메서드는 두 BigDecimal 값을 곱한 결과를 새로운 BigDecimal 객체로 반환합니다.
        // 기존의 BigDecimal 객체는 변경되지 않습니다.
        //
        //예를 들어, 주어진 코드에서 product.getPrice()는 BigDecimal 값을 반환하고, new BigDecimal(quantity)는 quantity라는 정수 값을 BigDecimal로 변환합니다.
        // 그 후에 multiply 메서드를 호출하여 두 BigDecimal 값을 곱한 결과를 반환합니다.
        public BigDecimal getItemTotal(){
            return   product.getPrice().multiply(new BigDecimal(quantity));
        }
    }

    //7강 01'12'00
    @AllArgsConstructor
    @Data
    public static class Order{
        public Long id;
        public String orderNumber;
        public List<OrderedItem> items;

        public BigDecimal totalPrice(){
          return   total(items, item->item.getItemTotal());
        }
    }// Order

}



