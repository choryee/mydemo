package ex04_MyungPum;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashMap1 {

    public static void main(String[] args) {
        HashMap<String, String> h=new HashMap<>();
        h.put("1", "apple");
        h.put("2", "orange");
        h.put("3", "pie");

        Set<String> keys=h.keySet();
        Iterator<String> it= keys.iterator();

        System.out.println("isEmpty: "+h.isEmpty());

    }
}
