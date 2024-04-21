package ex13_ChatGPT.CollectionPractice.string;

public class StringTest {
    public static void main(String[] args) {
        String str="choryee@naver.com";

        String subString=str.substring(0,3); // 0부터 3'전'까지.
        //beginIndex는 포함되고 endIndex는 포함되지 않습니다.
        System.out.println("subString>> "+subString);

        String replace=str.replace("@", "-");
        System.out.println("replace>> "+replace);

        String[] split=str.split("@");
        //분할하여 문자열 배열을 반환합니다.
        for(String s : split){
            System.out.println("split>> "+ s);
        }

        String str1="takg\"123\"@naver.com";
        System.out.println(str1);

        int a=5;
        int b=3;
        int result=a/b;
        System.out.println(result);
        System.out.println(Math.ceil(result));
    }

}
