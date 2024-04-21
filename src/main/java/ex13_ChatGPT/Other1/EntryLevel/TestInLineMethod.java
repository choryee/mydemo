package ex13_ChatGPT.Other1.EntryLevel;

public class TestInLineMethod {
    public static void main(String[] args) {
        int x=5;
        int y=10;

        int result=MathUtil.add(x,y);

    }
}

class MathUtil{
    public static int add(int a, int b){
        return a+b;
    }

    public static boolean isMoreThanFive(int a, int b){
        return a + b > 5;
    }
}
