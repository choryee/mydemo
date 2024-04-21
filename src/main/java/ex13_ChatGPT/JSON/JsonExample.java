package ex13_ChatGPT.JSON;

import org.json.JSONObject;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

public class JsonExample {
    public void jsonTest9(){
    }

    public static void main(String[] args) {
        // 예시 JSON 문자열
        String jsonString = "{\"name\": \"John\", \"age\": 30, \"city\": \"New York\"}";

        // JSON 문자을 --> JSONObject로 변환
        JSONObject jsonObject = new JSONObject(jsonString);
        System.out.println("jsonObject>> "+ jsonObject); // {"city":"New York","name":"John","age":30}

        String aa= String.valueOf(jsonObject.getJSONObject("name"));
        String callUrl="localhost:8080"+aa;

        HttpPost httpPost=new HttpPost(callUrl);


        // JSONObject에서 데이터 읽기
        String name = jsonObject.getString("name");
        int age = jsonObject.getInt("age");
        String city = jsonObject.getString("city");

        // 데이터 출력
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}
