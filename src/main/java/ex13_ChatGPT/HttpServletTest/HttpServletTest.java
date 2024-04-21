package ex13_ChatGPT.HttpServletTest;


import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

public class HttpServletTest{

    public static void requestTest() {

    }

    public static void main(String[] args) {

        // RESTful API의 엔드포인트 URL
        //String apiUrl="http://localhost:8081";
        String apiUrl="https://randomuser.me/api?nat=au"; //이 주소 get 성공함. 누군가 개발자를 위해 만든 것.

        // RestTemplate 인스턴스 생성   <------------- api호출 해주게 하는 것.
        RestTemplate restTemplate = new RestTemplate();

        // HTTP 요청 헤더 설정
        HttpHeaders headers=new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Jon", "best");

        // HTTP요청 엔티티 생성 (헤더 설정)
        // 요청에 대한 추가 정보를 담고 있는 HttpEntity 객체
        HttpEntity<String> entity = new HttpEntity<>(headers);
        System.out.println("entity >> "+ entity); // <[Content-Type:"application/json", Jon:"best"]>

        try{
            // GET 요청 보내기 후, 받기.
            ResponseEntity<String> response = restTemplate.exchange(
                    apiUrl,
                    HttpMethod.GET,
                    entity, //요청에 대한 추가 정보를 담고 있는 HttpEntity 객체를 지정합니다. HTTP 헤더, 요청 바디 등을 설정할 수 있습니다. (생략 가능)
                    String.class //받을때 타입설정. 응답의 데이터 타입을 지정합니다. 요청의 응답을, 해당 타입으로 얻어올 수 있습니다.
            );
            // 응답 코드 확인
            //System.out.println(response.);
            HttpStatus statusCode= (HttpStatus) response.getStatusCode();
            System.out.println("responsed code>>> "+ statusCode ); // 200 OK

            if(statusCode == HttpStatus.OK){
                String responseBody = response.getBody();
                System.out.println("responsed data >>> \n"+ responseBody); // {"results":[{"gender":"male","name":{"title":"Mr","first":"Keith","last":"Armstrong"},"location":{"street":{"number":8967,"name":"Taylor St"},"city":"Australian Capital Territory","state":"Tasmania","country":"Australia","postcode":1581,"coordinates":{"latitude":"18.7073","longitude":"-114.8104"},"timezone":{"offset":"+1:00","description":"Brussels, Copenhagen, Madrid, Paris"}},"email":"keith.armstrong@example.com","login":{"uuid":"907ed1a9-92a9-443e-a1c8-96f3aee401d0","username":"smallleopard618","password":"badman","salt":"JjNIqn6j","md5":"1591cb44042742fbfae223e8566dc3d5","sha1":"763e74d09075942d48ef31eadb90878600c9ac1d","sha256":"885ae653d952b04fe784a2bdd01a2e1cabe436db33859517abe8af816ab47d66"},"dob":{"date":"1967-07-14T22:01:56.166Z","age":56},"registered":{"date":"2022-02-14T07:47:19.057Z","age":1},"phone":"06-8930-1800","cell":"0483-866-979","id":{"name":"TFN","value":"895259971"},"picture":{"large":"https://randomuser.me/api/portraits/men/19.jpg","medium":"https://randomuser.me/api/portraits/med/men/19.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/19.jpg"},"nat":"AU"}],"info":{"seed":"ac5ab92ce4758b07","results":1,"page":1,"version":"1.4"}}
            }
        }catch (Exception e){
            System.out.println("요청 실패: "+ e.getMessage());
        }

    }


}
