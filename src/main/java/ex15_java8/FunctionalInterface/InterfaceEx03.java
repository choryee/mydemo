package ex15_java8.FunctionalInterface;

public class InterfaceEx03 {
    public static void main(String[] args) {
        ShapeService shapeService=new ShapeService(new Square());
        System.out.println(shapeService.calculate(3.12, 4));


    }

   static interface Shape{
    double area(double a, double b);
   }

    static class Square implements Shape{

    @Override
    public double area(double a, double b) {
        return a*b;
    }
}

    static class ShapeService{
        private Shape shape;

        ShapeService(Shape shape){
            this.shape=shape;
        }

        public double calculate(double a, double b){
            return shape.area(a, b);
        }


}

}
