package ex13_ChatGPT.ModernJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ModernJava01 {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    public List<Integer> getEvenNumbers() {
        return list.stream()
                .filter(a -> a % 2 == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        ModernJava01 modernJava01 = new ModernJava01();
        System.out.println(modernJava01.getEvenNumbers());
    }
}
