package ex032;

import java.util.Scanner;

public class Retangle {
    public int width;
    public int height;

    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Retangle ret = new Retangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("두 수를 입력하세요");

        ret.width = sc.nextInt();
        ret.height = sc.nextInt();
        System.out.println("사각형의 면적은 " + ret.getArea());
        sc.close();

    }

}
