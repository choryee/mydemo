package ex13_JavaCodingInterview.OnlieLibray;

import java.util.HashMap;
import java.util.Map;

public class Library { // 필드로 books만 있음.
    // books를 그냥 List로 할 수도 있는데, Map를 쓰는 이유는?
    // 넣은 키로 각 객체book를 찾을려는 다른 시도임.
    //필드가 하나일때는 생성자 만들 필요 없는듯.
    private Map<String, Book> books=new HashMap<>(); // [key:isbn, value:Book]


    protected void addBook(Book book) {
        books.putIfAbsent(book.getIsbn(), book);
    }

    protected boolean remove(Book book){
        return books.remove(book.getIsbn(), book);
    }

    protected Book find(String isbn){
        return books.get(isbn);
    }



}
