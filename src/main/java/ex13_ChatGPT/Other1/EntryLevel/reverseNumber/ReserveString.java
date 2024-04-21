package ex13_ChatGPT.Other1.EntryLevel.reverseNumber;

public class ReserveString {

    public char[] makeString(String input){
        char[] chars = new char[input.length()];
        int idx=0;
        for(int i=input.length()-1; i>=0; i--){
            chars[idx]=input.charAt(i);
            idx++;
        }
        return chars;
    }
}
