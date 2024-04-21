package ex13_ChatGPT.Stream;

import java.io.*;
import java.io.InputStream;

public class FileIOExample {

    public static void main(String[] args) throws IOException {
        String inputFilePath = "C:\\Users\\L-JE01\\Desktop\\test\\input.txt";
        String outputFilePath = "C:\\Users\\L-JE01\\Desktop\\test\\output.txt";

        // 파일에서 읽어오기 1
        StringBuffer content = readFromFile(inputFilePath); //밑 26라인 static매소드 호출한것.
        System.out.println("content>>"+content);

        // 파일에서 읽어오기 2
        StringBuffer getInputStream = readWithInputStream(inputFilePath);
        System.out.println("getInputStream>>"+getInputStream);

        // 읽어온 내용을 가공하거나 다른 작업 수행 가능

        // 파일에 쓰기
        writeToFile(outputFilePath, content.toString());
    }

    private static StringBuffer readFromFile(String filePath) {
        StringBuffer content = new StringBuffer(); //기준 문자열에 새로 문자등을 추가해주는 것.
        try{
         BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    private static StringBuffer readWithInputStream(String filePath) throws IOException {
        // InputStream는 추상클래스라 오버라이드가 필요할 수 도.
        StringBuffer sb=new StringBuffer("");
        InputStream is=new FileInputStream(filePath );
        int byteData;
        while ((byteData = is.read()) != -1) {
            sb.append((char) byteData); // Convert byte to char and append to StringBuffer
        }
        is.close(); // Don't forget to close the InputStream
        return sb;
    }

    private static void writeToFile(String filePath, String content) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}