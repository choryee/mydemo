package ex13_ChatGPT.Crawling;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Crawling01{
    private static String URL="https://www.jobkorea.co.kr/Search/?";

    public static void main(String[] args) throws IOException {
        String KEY_WORD="jQuery";
        Document doc= Jsoup.connect(URL+getParameter(KEY_WORD, 2)).get();
//        System.out.println(""+doc.toString());
//        System.out.println("한글로 테스트...");

        Elements elements=doc.select(".list-default .clear li");
        int idx=0;
        for(Element element : elements){
            System.out.println(++idx+"  >> "+element.text());
        }
    }


    public static String getParameter(String KEY_WORD, int PAGE){
        String params="stext="+KEY_WORD
                +"&tabType=recruit"
                +"&Page_No"+PAGE;
        return params;
    }
}