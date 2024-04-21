package ex08_Java_ParkEunJong;

public class TestMyNumber   {
    public static void main(String[] args) {
        MyNumber max=(int x, int y) -> (x>=y)?x:y;
        System.out.println(max.getMax(4,3));
    }




}
