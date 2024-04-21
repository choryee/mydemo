package ex13_ChatGPT.Other1.EntryLevel.ForPractice;

import java.util.Scanner;

public class ForPractice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("숫자를 입력하세요"  );
       // int a=sc.nextInt();
        int a=3;
        System.out.println("숫자를 입력하세요"  );
       // int b=sc.nextInt();
        int b=4;

        for(int i=1; i<=a; i++){
            for(int j=i; j<=b; j++){
                System.out.print(j);
            }
                System.out.println();
        }
    }


}
