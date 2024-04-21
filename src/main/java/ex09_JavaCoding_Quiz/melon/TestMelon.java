package ex09_JavaCoding_Quiz.melon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMelon {
    public static void main(String[] args) {
        String[] array=new String[3];
        array= new String[]{"pen", "cup", "watch"};
        Arrays.stream(array).filter(s -> s.length()>4).forEach(m-> System.out.println("4자이상은 "+m));


        Melon melon1 = new Melon("Gac", 100, "Korea");
        Melon melon2 = new Melon("Bali", 120, "Japan");

        List<Melon> newArrary = new ArrayList<>();
        newArrary.add(melon1);
        newArrary.add(melon2);
        for(Melon melon : newArrary){
            System.out.println(melon.toString());
        }

        Arrays.stream(new List[]{newArrary}).forEach(s-> System.out.println("s>>"+s));

        //Filters.filterByType(newArrary,"Gac")
        //System.out.println("filtered>>"+Filters.filterByType(newArrary,"Gac"));
        Filters filters=new Filters();
        System.out.println(filters.filterByType(newArrary, "Gac"));

       // filters.filterMelons(newArrary, new GacMelonPredicate);
       // filters.filterMelons(newArrary, GacMelonPredicate);


    }
}
