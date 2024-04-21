package ex04_MyungPum;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class search {
    public static void main(String[] args) {
        HashMap<String, String> h = new HashMap<>();
        h.put("apple", "사과");
        h.put("baby", "아기");
        h.put("love", "사랑");

        Set<String> keys = h.keySet();
        Iterator<String> it = keys.iterator();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println("it:" + it.next());
        }

        while (it.hasNext()) {
            String key = it.next();
            String value = h.get(key);
            System.out.println(key + ":" + value);
        }

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < keys.size(); i++) {
            System.out.println("찾고 싶은 단어는?");
            String input = sc.next();
            String kor = h.get(input);
            if (kor == null) System.out.println(input + "은 없는 단어입니다.");
            else System.out.println(kor);
        }
    }
}
