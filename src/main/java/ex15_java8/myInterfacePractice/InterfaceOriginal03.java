package ex15_java8.myInterfacePractice;

public class InterfaceOriginal03 {
    public static void main(String[] args) {
        CalculationService calculationService=new CalculationService(new Addition());
        int result=calculationService.calculate(4,5);
        System.out.println(result);
    }
}

class Addition implements Calculation1{

    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }
}
interface Calculation1{
    int calculate(int num1, int num2);
}

class CalculationService{
    private Calculation1 calculation1; //인터페이스 Calculation1를 사용하려는 것. 즉, 이 인터페이스를 구현한 구현체를 사용하겠다는 것.

    CalculationService(Calculation1 calculation1){
        this.calculation1 = calculation1;
    }

    public int calculate(int a, int b){
        return calculation1.calculate(a,b);
    }
}
