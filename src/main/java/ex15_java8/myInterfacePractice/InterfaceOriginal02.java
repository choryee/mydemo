package ex15_java8.myInterfacePractice;

public class InterfaceOriginal02 {
    public static void main(String[] args) {
        Calculation calculation = new add();
        int result = calculation.addition(3,4);
        System.out.println(result);
    }

}

class add implements  Calculation{

    @Override
    public int addition(int a, int b) {
        return a+b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a-b;
    }
}

interface Calculation{
    int addition(int a, int b);
    int subtraction(int a, int b);
}
