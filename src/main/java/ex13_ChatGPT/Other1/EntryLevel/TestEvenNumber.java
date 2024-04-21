package ex13_ChatGPT.Other1.EntryLevel;


import ex13_ChatGPT.CollectionPractice.List.List;

//import java.util.List;
import java.util.ArrayList;

public class TestEvenNumber {
    static class FindNum{
        public static boolean isEvenNum(int num){
            return num%2==0;
        }
           static java.util.List<Integer> lists= new ArrayList<Integer>();
        public static List<Integer> FindList(int[] array){
            for(int i=0; i<array.length; i++){
                if(isEvenNum(array[i])){
                    lists.add(array[i]);
                }
            }
            return (List<Integer>) lists;
        }

        static int[] newArr=new int[lists.size()];
        public static int[] FindInt(){
            for(int i=0; i<lists.size(); i++){
                newArr[i]=lists.get(i);
            }
              for(int i=0; i<lists.size(); i++){
                  System.out.println(newArr[i]);
              }
            return newArr;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //System.out.print(FindNum.FindList(numbers));
        System.out.println(FindNum.FindInt());






    }// --main()
}// -- public class TestEvenNumber {
