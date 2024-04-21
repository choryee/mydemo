package ex04_MyungPum1;//package ex04_명품자바1;
//
//import java.util.Scanner;
//
////p.179 끝맛잇기.
//
//class Player {
//    private String name;
//
//    public String getWordFromUser() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("낱말을 입력하세요");
//        String input = sc.nextLine();
//        return input;
//    }
//
//    public void checkSuccess() {
//        String word = "아버지";
//        int lastWord = word.indexOf(word) - 1;
//        char lastChar = word.charAt(lastWord);
//        char firstChar = word.charAt(0);
//        if (lastChar == firstChar) {
//            System.out.println("성공!!");
//        }
//
//    }
//}
//
//class ReturnArray {
//    static int[] makeArray() {
//        int temp[] = new int[4];
//        for (int i = 0; i < temp.length; i++)
//            temp[i] = i;
//        return temp;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = makeArray();
//        for (int i = 0; i < ReturnArray.makeArray().length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//}
//
//public class WordGameApp {
//
//    public void run() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("게임에 참가하는 인원은 몇 명입니까?");
//        int input = sc.nextInt();
//
//        for (int i = 0; i < input; i++) {
//            Player[] players = new Player()[i];
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//    }
//
//}
