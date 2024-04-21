package ex13_ChatGPT.ProgramPractice.Library;//package ex13_ChatGPT.ProgramPractice.Library;
//
//
//import java.util.*;
//
//public class BookSystem1<T extends Enum<T>> { // List<Map<T, Book>> 가진것. 관리자가 책타입-책 형식으로 입력하는 것.
//   // private Map<T, Book> map;
//    private List<Map<T, Book>> lists;
//    private BookUser bookUser;
//
//    BookSystem1(){
//       // map=new HashMap<>();
//        lists=new ArrayList<>();
//        bookUser=new BookUser<>("park", 5, new Book("Cosmos", 7));
//    }
//
//    public void searchBooks(){ // BookType 키로 검색.
//
//    }
//
////    public void searchGenre(BookType bookType, BookSystem bookSystem){
////        List<Map<T, Book>> bookLists = bookSystem.show();
////        for( Map<T, Book> bookMap : bookLists){
////            Book book=bookMap.get(bookType); // Book객체 가져옴.
////            book.setIsGenreHave(true);
////            if(book.getIsGenreHave()){
////                System.out.println(sortGenreToKorean(bookType)+" 장르 책이 있습니다. ");
////            }else {
////                System.out.println(sortGenreToKorean(bookType)+"장르는 없습니다.");
////            }
////        }//-- for
////    }
//
//    public boolean isCheckedOut(Book book1, BookType bookType){
//        boolean isCheckedOut=false;
//        for(Map<T, Book> bookMap : lists){
//            //book.setBookType(bookType);
//            Book book=bookMap.get(bookType);
//
//            if(book.getName() == bookUser.getBook().getName()){
//                isCheckedOut=true;
//                book.setIsRented(true);
//                System.out.println((book.getName()+"은 현재 대출중입니다."));
//            }else {
//                throw new IllegalArgumentException("책을 찾을 수 없습니다.!");
//            }
//        }
//        return isCheckedOut;
//    }
//
//    public void searchGenre(BookType bookType){
//        for(Map<T, Book> bookMap : lists){
//            Book book=bookMap.get(bookType);
//            book.setIsGenreHave(true);
//            if(book.getIsGenreHave()){
//                System.out.println(sortGenreToKorean(bookType)+" 장르 책이 있습니다. ");
//            }else {
//                System.out.println(sortGenreToKorean(bookType)+"장르는 없습니다.");
//            }
//        }
//    }
//
//    public String sortGenreToKorean(BookType bookType){
//
//        switch (bookType){ // switch문에 default없으면 에러남.
//            case NOVEL :
//                return "소설분야";
//            case SOCIAL:
//                return "사회분야";
//            case SCIENCE:
//                return "과학분야";
//            default:
//                throw new IllegalArgumentException();
//        }
//    }
//
//    public void addList(Map<T, Book> bookMap){
//        lists.add(bookMap);
//    }
//
//    public List<Map<T, Book>> show(){
//        for(int i=0; i<lists.size(); i++){
//            System.out.println(lists.get(i));
//        }
//        return lists;
//    }
//
//    public void remove(Map<T, Book> bookMap){
//        lists.remove(bookMap);
//    }
//
//    public Set getKey(){
//        Set set=new HashSet();
//        for(int i=0; i<lists.size();i++){
//           set= lists.get(i).keySet();
//        }
//        return set; // [NOVEL, SCIENCE]
//    }
//
//
//
//}
