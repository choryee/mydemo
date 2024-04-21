package ex13_ChatGPT.ProgramPractice.CalculatorApp;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in );
//
//        String input=sc.nextLine();
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//
//        if(input.equals("*")){
//            System.out.println(a*b);
//        }else if(input.equals("+")){
//            System.out.println(a+b);
//        }

        // split: 문자열을 특정 구분자를 기준으로 분할하여 배열로 반환합니다.
//        String test="surrender, Trump";
//        String[] arr=test.split(",");
//        for(String s : arr){
//            System.out.println(s);
//        }

//        test test=new test();
//        test.test();



        Scanner sc = new Scanner(System.in);
        while(true) {
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting..");
                break;
            }

            try {
                Cal.test(input);
            } catch (IllegalArgumentException e){
            System.out.println("Invalid expression");
             }

        }//-- while
            sc.close();
    }

}

class Cal{

    public static int test(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException();
        }

        // String input="3*2";
        String[] arr = input.split("");
//        for(String s : arr){
//            System.out.println(s);
//        }
        String operator1 = arr[0];
        int op1 = Integer.valueOf(arr[0]);
        String operand = arr[1];
        String operator2 = arr[2];
        int op2 = Integer.valueOf(arr[2]);

        switch (operand) { // switch문에 default없으면 에러남.
            case "*":
                System.out.println(op1 * op2);
                return op1 * op2;
            case "+":
                System.out.println(op1 + op2);
                return op1 + op2;
            case "-":
                System.out.println(op1 - op2);
                return op1 - op2;
            case "/":
                if (op2 == 0) {
                    throw new ArithmeticException("산술적 에러임..");
                }
                return op1 / op2;
                //System.out.println(op1 / op2);

            default:
                throw new IllegalArgumentException();
               // System.out.println("Invalid ...");
        }// -switch
    }

}

