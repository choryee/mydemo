package ex13_ChatGPT.DesignPatten;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("hello");
        sb.append(", ");
        sb.append(" world");
        //sb.insert(3, "awesome");

        System.out.println(sb);


    }
}
