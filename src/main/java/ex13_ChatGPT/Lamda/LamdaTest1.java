package ex13_ChatGPT.Lamda;

interface MathOperation{
    int operate(int a, int b);
}

public class LamdaTest1 {
    public static void main(String[] args) {
        MathOperation add = (a,b)->a+b;

        int result=add.operate(5,3); //계산식있는 부분 +if의 매소드
        System.out.println(result);

        MathOperation subtract = (c,d)-> c-d;
        System.out.println(subtract.operate(5,3));



    }
}
