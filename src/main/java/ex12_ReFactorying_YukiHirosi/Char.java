package ex12_ReFactorying_YukiHirosi;

public class Char {
    // Char[] chars=['a', 'b','c','d']
    char[] chars = {'a', 'b', 'c', 'd'};

    public static  boolean findChar(char[] chars, char target){
        boolean flag=false;
        for(int i=0; i<chars.length; i++){
            if( chars[i] == target ){
               flag=true;
            }
        }
        return flag;

    }
}
