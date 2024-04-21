import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingCharacter_02 {
    public static void main(String[] args) {
        // 예시 리스트: Product 객체 리스트
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200),
                new Product("Smartphone", 800),
                new Product("Tablet", 500),
                new Product("Laptop", 1200),
                new Product("Smartphone", 800)
        );

        // Product 객체를 이름으로 그룹화하고 개수 세기
        Map<String, Long> result = countProductsByName(products);

        // 결과 출력
        System.out.println(result);
    }

    public static Map<String, Long> countProductsByName(List<Product> products) {
        return products.stream()
               // .collect(Collectors.groupingBy(Product::getName, Collectors.counting()));
                .collect(Collectors.groupingBy(Product::getName, Collectors.counting()));
    }
}

class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
}
