package ex13_JavaCodingInterview.OnlieLibray;

import java.util.List;
import java.util.Map;

public class ReaderManger {
    //private List<Reader> readers;
    private Map<String ,Reader> readers;

    protected void add(Reader reader){
        readers.putIfAbsent(reader.getEmail(), reader);
    }

    protected Boolean remove(Reader reader){
        return readers.remove(reader.getEmail(),reader);
    }

    protected Reader find(String email) {
        return readers.get(email);
    }

}
