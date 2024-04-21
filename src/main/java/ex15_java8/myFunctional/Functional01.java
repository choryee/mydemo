package ex15_java8.myFunctional;

public class Functional01 {
    public static void main(String[] args) {
        /*
         * 1. (함수형 인터페이스 사용하지 않고, 내가 만들 경우) 내가 인터페이스 정의=> 안에 추상매소드만 선언
		 1-1. (함수형 인터페이스 사용시) 따로 선언 필요없이, 바로 밑에 2번으로.
         * 2. "인터페이스명 = new 인터페이스명" 으로, 위 추상매소드를 구체화함.
         * 3. "인터페이스명.매소드명" 형태로 사용함.
         * */


        //인터페이스 사용 방법 2가지.

        //1. implement한후, 그것을 인터페이스형으로 담기
        Calculation add = new CalEvenNumber();
        int result1
                = add.calculate(2,3);
        System.out.println(result1);

        //2. 인터페이스를 바로 new해서 익명클래스로 만들어서 하는 방법.
        int result2
                = subtraction.calculate(2,3);
        System.out.println(result2);

        //3. 람다식을 이용
        int result3
                = multiPly.calculate(4,5);
        System.out.println(result3);

    }//main

    //인터페이스의 new부분이, 람다식으로 바뀌는 것이다.
    private static Calculation multiPly = ((num1, num2) -> num1*num2);

    private static Calculation subtraction = new Calculation() {
        @Override
        public int calculate(int num1, int num2) {
            return num1-num2;
        }
    };
}

interface Calculation{
    int calculate(int num1, int num2);
}

class CalEvenNumber implements Calculation{
    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }
}

class CalculationService{

}
