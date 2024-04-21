package ex13_ChatGPT.ProgramPractice.Library;//package ex13_ChatGPT.ProgramPractice.Library;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class TestLibrary1 {
//    public static void main(String[] args) {
//        Book book1=new Book("Gone with wind", 5);
//        Book book2=new Book("Cosmos", 7);
//        BookSystem bookSystem=new BookSystem();
//
//        Map<BookType, Book> bookMap1=new HashMap<>();
//        bookMap1.put(BookType.NOVEL, book1);
//        bookMap1.put(BookType.SCIENCE, book2);
//
//        bookSystem.addList(bookMap1);
//        bookSystem.show();
////        System.out.println(bookMap1.get(BookType.SCIENCE));
////        System.out.println(bookSystem.getKey());
//        bookSystem.isCheckedOut(book2, BookType.SCIENCE);
//
//        bookSystem.searchGenre(BookType.NOVEL);
//
//        BookUser bookUser1=new BookUser("Lee", 4, new Book("Weapon", 7));
//        //BookUser bookUser2=new BookUser("lee", 4, BookType.SOCIAL);
//        bookUser1.notifyReturnDay();
//
//
//
//
//
//    }
//}
