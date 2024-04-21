package ex04_MyungPum;

import java.util.Iterator;
import java.util.Vector;

public class iterator {

    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(2);
        v.add(5);

        Iterator<Integer> it=v.iterator();
        for(int i=0; i<v.size(); i++){
            while( it.hasNext())
            System.out.println("it:"+it.next());
        }


    }

}
