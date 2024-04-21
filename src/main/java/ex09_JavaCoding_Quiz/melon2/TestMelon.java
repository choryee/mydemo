package ex09_JavaCoding_Quiz.melon2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMelon {
    public static void main(String[] args) {
       // Melon melon=new Melon("Bailan", 100, "Japan");
       // Melon melon1=new Melon("haha", 200, "New York");

        List<Melon> melons=new ArrayList<>();
        melons.add(new Melon("Bali", 100, "Japan"));
        melons.add(new Melon("haha", 200, "New York"));

        for(Melon melon : melons){
            System.out.println("toString : "+melon);
        }

        System.out.println("type: "+Filters.filterByType(melons, "haha") );

        List<Melon> gacs=Filters.filterMelons(melons, new GacMelonPredicate());
        System.out.println("gacs: "+gacs);

        List<Melon> bali=Filters.filterMelons(melons, m ->"bali".equalsIgnoreCase(m.getType()));
        System.out.println("bali : "+bali);

        List<Melon> watermelons=Filters.filter(melons, m -> "haha".equalsIgnoreCase(m.getType()));
        System.out.println("watermelons"+watermelons);

        List<Integer> numbers= Arrays.asList(1,3,45,6,7);
        List<Integer> nums=Filters.filter(numbers, m -> m<10);
        System.out.println("nums : "+ nums);

    }
}
