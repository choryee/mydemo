package ex0311;

import java.util.ArrayList;
import java.util.List;

public class FoodTest {

    public static void main(String[] args) {
        Food fd1 = new Food("치킨", "18000원");
        Food fd2 = new Food("피자", "28000원");
        Food fd3 = new Food("초밥", "22000원");

        List<Food> li = new ArrayList<>();
        li.add(fd1);
        li.add(fd2);
        li.add(fd3);

        // for (Food list : li) {
        // System.out.println("Food { name :" + list.getName() + " , " + " price : " +
        // list.getPrice() + "}");
        // }

        for (int i = 0; i < li.size(); i++) {
            System.out
                    .println("Food { name :" + li.get(i).getName() + " , " + " price : " + li.get(i).getPrice() + "}");
        }

    }
}
