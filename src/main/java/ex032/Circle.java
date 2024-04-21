package ex032;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Circle1 {
    // p.155

    // int[] arr=[0,1,2,3,4];
    // public static final pi=3.14;

    // // for(List list : arr){
    // // list.add(pi*pi*arr[]);
    // // }

    // for(
    // int i = 0;i<arr.size();i++)
    // {
    // List list = new ArrayList<>();
    // list.add(pi * pi * arr[i]);
    // }

    int radius;

    public void setRadius(int r) {
        this.radius = r;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}

public class Circle {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1();

        c1.setRadius(0);

    }

}
