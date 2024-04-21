package ex12_ReFactorying_YukiHirosi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDatabase {
    private Map<String, String> _map=new HashMap<>();
    public SimpleDatabase(Reader r) throws IOException{
        BufferedReader reader=new BufferedReader(r);
        String line;
        while(true){
           line= reader.readLine();
           if( line ==null) break;
           int idx=line.indexOf("=");
           if( idx > 0){
               String key=line.substring(0, idx);
               String value=line.substring(idx+1, line.length());
               _map.put(key,value);
           }
        }

//        boolean reading=false;
//        System.out.println("reading>>"+!reading);
//        String line;
//        while (!reading){ //!reading가 true이면
//            line=reader.readLine();
//               // System.out.println("line>>"+line.length());
//            if(line == null){// line이 null인 경우 입력의 끝에 도달한 것이므로 reading 변수를 true로 설정하여 루프를 종료합니다
//                reading=true; //여깃 true이면, 위 !reading는 false됨.
//            }else {
//                boolean scanningKey=true;
//                StringBuffer keyBuffer=new StringBuffer();
//                StringBuffer valueBuffer=new StringBuffer();
//                for(int i=0; i<line.length(); i++){
//                    char c=line.charAt(i);
//                    if(scanningKey){ //scanningKey가 false되면, 그 후로 읽는 것은 valueBuffer에 넘.
//                        if(c == '='){
//                            scanningKey = false; //여기서 false되면, if(scanningKey)이걸 멈추는 것.
//                        }else {
//                            keyBuffer.append(c);
//                        }
//                    }else{
//                        valueBuffer.append(c);
//                    }
//                }// -for
//                String key=keyBuffer.toString();
//                String value=valueBuffer.toString();
//                _map.put(key,value);
//            }
//        }// -while



    }

    public void putValue(String key, String value){
        _map.put(key, value);
    }

    public String getValue(String key){
        return _map.get(key);
    }

    public String toString(String key, String value){
        return "Key:"+key+" , "+"value : "+value;
    }
    public Iterator<String> iterator(){
        return _map.keySet().iterator();
    }

}
