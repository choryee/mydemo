package ex13_ChatGPT.ProgramPractice.Library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestLibrary {
    public static void main(String[] args) {
//        Book book1=new Book("Gone with wind", 5, BookType.NOVEL);
//        Book book2=new Book("Cosmos", 7, BookType.SCIENCE);
          Book book3=new Book("빅뱅", 5, 8, BookType.SCIENCE );

        BookSystem bookSystem=BookSystem.getInstance();
        bookSystem.addBookToList(new Book("Gone with wind",7,2, BookType.NOVEL));
        bookSystem.addBookToList(new Book("Cosmos", 2, 2, BookType.SCIENCE));
        bookSystem.addBookToList(new Book("빅뱅", 5, 2, BookType.SCIENCE));


        bookSystem.put(BookType.SCIENCE, bookSystem.getList());
      //  bookSystem.showLists(BookType.SCIENCE);
        //bookSystem.isCheckedOut(book3);


       // bookSystem.searchGenre(BookType.NOVEL);

        BookUser bookUser=new BookUser();
        bookUser.userCheckoutBook(new Book("cosmos", 4, 2, BookType.SOCIAL), 2);
        //bookUser1.notifyReturnDay();





    }
}
