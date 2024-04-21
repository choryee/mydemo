package ex13_ChatGPT.Other1.EntryLevel.reverseNumber;

import java.util.Arrays;

public class TestString {
    public static void main(String[] args) {
        ReserveString reserveString=new ReserveString();
        System.out.println(reserveString.makeString("apple"));

        ReverseNum reverseNum=new ReverseNum();
        System.out.println(Arrays.toString(reverseNum.reverseNumber(3456)));
        int[] arr= reverseNum.reverseNumber(3456);
        //System.out.println(Arrays.toString(reverseNum.newArray((reverseNum.reverseNumber(3456)))));
        String[] strs=new String[arr.length];
        char[] chars=new char[arr.length];

            for(int i=0; i<arr.length; i++){
                String strValue= Integer.toString(arr[i]);
                strs[i]=strValue;
            }

        for(String s : strs){
            System.out.println(s);
        }

        for(int i=0; i< arr.length; i++){
            System.out.println(strs[i].charAt(0));
        }
        System.out.println("---------");
        System.out.println(reverseNum.Array(reverseNum.reverseNumber(3456)));


    }

}
