package ex13_ChatGPT.CollectionPractice.map1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Book{
    private String title;
    private String author;

    Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
public class map11 {
    public static void main(String[] args) {
        Map<String, List<Book>> maps=new HashMap<>();
        List<Book> list=new ArrayList<>();
        list.add(new Book("weapons", "Harari"));
        list.add(new Book("cosmos","Spence"));
        maps.put("science", list);

        System.out.println(maps.get("science"));
        System.out.println(maps.keySet());



    }
}
