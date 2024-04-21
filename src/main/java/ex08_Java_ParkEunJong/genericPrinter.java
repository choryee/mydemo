package ex08_Java_ParkEunJong;



    class Powder{
        public void doPrinting(){
            System.out.println("Power 재료로 출력합니다");
        }


        public String toString() {
            return "재료는 Power입니다!!";
        }
    }

    class Plastic{
        public void doPrinting(){
            System.out.println("Plastic 재료로 출력합니다");
        }
        public String toString() {
            return "재료는 Plastic";
        }
    }

    public class genericPrinter<T> {
        //박은종 책. 390

        T material;

        public void setMaterial(T material) {
            this.material = material;
        }

        public T getMaterial() {
            return material;
        }

    public static void main(String[] args) {
        genericPrinter<String>  printer=new genericPrinter<>();
        printer.setMaterial("power");
        System.out.println("printer.getMaterial():"+printer.getMaterial());
        //-------



    }

}
