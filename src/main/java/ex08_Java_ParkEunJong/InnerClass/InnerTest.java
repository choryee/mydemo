package ex08_Java_ParkEunJong.InnerClass;

// public class InnerTest {}에 대한, 외부 클래스.
class OutClass{ //박은종, 13강.
    private int num=10;
    private static int sNum=20;
    private InClass inClass;

    public OutClass(){ //이 생성자를 통해, 바로 InClass변수를 new해버려, InClass를 따로, new할 필요없이, InClass를 바로 사용가능케 함.
        inClass=new InClass();
    }

    //내부 클래스
    private class InClass{ //이렇게 private을 선언하면, 밑에 public class InnerTest {} 의 main()함수에서 사용 불가이므로,
     // 외부에서 보호를 위해, 위는 private으로 하고, 밑의    public void usingInTest(){처럼 매소드로 접근하게 허락한다. 보통.
        int inNum=200;
        void inTest(){
            System.out.println(num);
            System.out.println(sNum);
        }
    }//-- InClass

    public void usingInTest(){
        inClass.inTest();
    }

    //static 내부 클래스
    static class InStaticClass{
        int iNum=100;
        static int sInNum=200;

        void inTest(){
           // num+=num; //num은 위의 OutClass가 new한후에야 사용할 수 있는 변수(인스턴스 변수)여서, 여기서 이렇게 쓰면,
            // OutClass가 인스턴스화 안 되서, 사용될 수 있으므로, 에러 남.
            sNum+=sNum;

            System.out.println(sNum);
            System.out.println(iNum); //int iNum=100;은 static class InStaticClass{가 생성된후, 내부변수가 생성되므로, 이므로 사용 가능.
            System.out.println(sInNum);
        }

        static void sTest(){
            System.out.println(sNum);
           // System.out.println(iNum); //static void sTest()이것이, static class InStaticClass{보다 먼저 생성될수 있으므로, 사용불가. 16'43
            // int iNum=100;를 사용하려면, 이것은 인스턴화가 먼저 돼야 하는데,static void sTest() 이것은, 인스턴화없이 먼저 생길수 있으므로, iNum 사용 불가.
            System.out.println(sInNum);
        }
    }

} // --OutClass
public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass=new OutClass();
       // outClass.inClass.inTest();

        outClass.usingInTest();
        System.out.println("------");
        OutClass.InStaticClass.sTest();


    }
}
