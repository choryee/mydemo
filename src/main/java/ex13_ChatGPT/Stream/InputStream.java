package ex13_ChatGPT.Stream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

public class InputStream {
    private String sendURL(String queryURL) throws IOException, KeyManagementException, NoSuchAlgorithmException {

        URL tempURL= new URL(queryURL);
       // HttpUtils.enableSSLSocket();

        java.io.InputStream tempInputStream = tempURL.openStream();
        InputStreamReader isr = new InputStreamReader(tempInputStream, "UTF-8");
        StringBuffer sb2 = new StringBuffer();
        int curByte;

        while((curByte = isr.read()) != -1){
            sb2.append((char) curByte);
        }
        isr.close();
        tempInputStream.close();
        System.out.println("sb2.toString()>> \n "+sb2.toString());

        return sb2.toString();
    }

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, KeyManagementException {
        InputStream is=new InputStream();
        String queryURL = "http://www.naver.com";
        is.sendURL(queryURL);

    }

}
