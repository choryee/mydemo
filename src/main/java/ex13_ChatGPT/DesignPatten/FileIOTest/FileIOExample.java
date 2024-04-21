package ex13_ChatGPT.DesignPatten.FileIOTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) {
        // 파일 경로 C:\Users\L-JE01\Desktop\filereadtest.txt
        String filePath = "C:\\Users\\L-JE01\\Desktop\\filereadtest.txt";

        // 파일 쓰기 예시
       // writeToFile(filePath, "Hello, World!");

        // 파일 읽기 예시
        String content = readFromFile(filePath);
        System.out.println("File Content>> \n " + content);
    }

    // 파일 읽기 메소드
    public static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder(); //StringBuilder는 StringBuffer와 유사한 것.

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toString();
    }

    // 파일 쓰기 메소드
    public static void writeToFile(String filePath, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
