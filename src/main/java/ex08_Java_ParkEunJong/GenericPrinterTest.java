package ex08_Java_ParkEunJong;

public class GenericPrinterTest {

    public static void main(String[] args) {
        genericPrinter<Plastic> plasticPrinter=new genericPrinter<Plastic>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic=plasticPrinter.getMaterial();
        System.out.println(plastic);


    }


}
