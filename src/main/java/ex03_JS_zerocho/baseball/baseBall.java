package ex03_JS_zerocho.baseball;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class baseBall {
    public static void main(String[] args) throws IOException {
        int[] arr=new int[10];
        for(int i=0; i<10; i++){
            arr[i]=i;
        }

        String[] strNumbers=new String[4];
        Set<String> set=new HashSet<>();

        int  idx = 0;
        for(int i=0; i<4; i++){
            Integer num = (int) Math.floor(Math.random()*10);
            String strNum=num.toString();
            if( !set.contains(num)){
                set.add(strNum);
                strNumbers[i] = String.valueOf(num);
                idx++;
            }
        }

        for(String a : set){
            System.out.print(a+" ");
        }

        System.out.println("\n 숫자를 입력하세요");
        Scanner sc=new Scanner(System.in);
        Integer input=sc.nextInt();
        System.out.println("input>>"+input);
        String[] stringArrNum=input.toString().split("");
//        for(String s : stringArrNum){
//            System.out.println("string s>>"+s);
//        }

        int ballCount=0;
        int strikeCount=0;
        for(int i=0; i<strNumbers.length; i++){
            if(set.contains(stringArrNum[i]) && stringArrNum[i] != strNumbers[i]){
                ballCount++;
            }
            if(stringArrNum[i].equals(strNumbers[i])){
                strikeCount++;
            }
        }
        switch (ballCount){
            case 1:
                System.out.println("one ball");
                break;
            case 2:
                System.out.println("two ball" );
                break;
            case 3:
                System.out.println("three ball");
                break;
            case 4:
                System.out.println("four ball");
                break;
        }

        switch (strikeCount){
            case 1:
                System.out.println("one strike");
                break;
            case 2:
                System.out.println("two strike");
                break;
            case 3:
                System.out.println("three strike");
                break;
            case 4:
                System.out.println("four strike");
                break;
        }

    }//main
}
