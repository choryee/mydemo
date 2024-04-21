package ex04_MyungPum;

import java.util.Vector;

public class point {

     private int x, y;

    public point(int x, int   y){
         this.x=x;
         this.y=y;
     }

     String toString(int x, int y){
         return "int x:"+x+"  "+"int y:"+y;
     }

    public static void main(String[] args) {
        Vector<point> v=new Vector<point>();
        v.add(new point(10, 20));
        v.add(new point(2,3));

        for(int i=0; i<v.size(); i++){
            System.out.println("v:"+v.get(i).x);
           // System.out.println("v:"+v.toString().);
        }

    }

}
