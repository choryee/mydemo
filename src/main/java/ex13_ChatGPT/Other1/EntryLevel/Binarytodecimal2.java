package ex13_ChatGPT.Other1.EntryLevel;

public class Binarytodecimal2 {

    public static void main(String[] args) {
        test test=new test();
        System.out.println( test.binaryToDecimal() );
    }
}

class test{
    public  int binaryToDecimal() {
        int input=101110;
        int original=101110;

        int di=1;
        int sum=0;
        int div=10;

        while(input > 0){
//            input=input%10;
//            sum=sum+input*di;
//            input=original/div;
//            div=div*10;
//            di=di*2;
            int bit=input%10;
            sum=sum+bit*di;
            input=input/10; // 줄여나갈때는, 원본을 위 주석처럼 먼저 수정하게 하면 안 된다. 230826
            di=di*2;

        }
       //  System.out.println(" 테스트.. ");
        return sum;
    }
}

//package ex13_ChatGPT.Other1.EntryLevel;
//
//public class Binarytodecimal2 {
//
//    public static void main(String[] args) {
//        System.out.println(test.binaryToDecimal());
//    }
//}
//
//class test {
//    public static int binaryToDecimal() {
//        int input = 101110;
//        int original = input; // 원본 값을 저장해야 합니다.
//
//        int di = 1;
//        int sum = 0;
//
//        while (input > 0) { // 더이상 남은 이진수가 없을 때까지 계산합니다.
//            int bit = input % 10;
//            sum = sum + bit * di;
//            input = input / 10;
//            di = di * 2;
//        }
//
//        return sum;
//    }
//}
