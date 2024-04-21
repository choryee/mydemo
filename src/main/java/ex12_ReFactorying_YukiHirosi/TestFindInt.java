package ex12_ReFactorying_YukiHirosi;

public class TestFindInt {
    public static void main(String[] args) {
        int[] num={2,3,6,4,9};
       // System.out.println(FindInt.find(num, 5));
        if(FindInt.find(num, 5)) {
            System.out.println("Found!!");
        }else {
            System.out.println("no found" +
                    "");
        }


    }
}
