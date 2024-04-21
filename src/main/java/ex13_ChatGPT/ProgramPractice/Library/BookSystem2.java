package ex13_ChatGPT.ProgramPractice.Library;//package ex13_ChatGPT.ProgramPractice.Library;
//
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class BookSystem2<T extends Enum<T>> { //  관리자가 책타입-책 형식으로 입력하는 것.
//
//    private static BookSystem2 bookSystem = new BookSystem2(); //싱글턴 패턴으로 바꿈(밑과 한 세트). 다른데서 new할까봐.
//    public static BookSystem2 getInstance(){
//        return bookSystem; // new BookSystem();를 가져오는 것.
//    }
//
//    // BookSystem bookSystem = BookSystem.getInstance(); //BookUser에서 이렇게 호출함.
//    private List<Book> list;
//    private Map<T, List<Book>> maps; // 한 가지 타입에, 딸린 여러 리스트 있을 경우. 230828
//   // private BookUser bookUser;
//
//   private BookSystem2(){ // 이렇게 생성자를 private로 해버리면, 다른 데서 못씀. 그래서, 위 public static BookSystem getInstance(){ public으로 만든 것.
//       // map=new HashMap<>();
//        list=new ArrayList<>();
//        maps=new HashMap<>();
//      //  bookUser=new BookUser<>("park", 5, new Book("Cosmos", 7));
//    }
//
//    public boolean searchBooks(Book book){ // BookType 키로 검색.
//       boolean isFound=false;
//        for(Book book1 : list){
//            if(book.getName().equalsIgnoreCase(book1.getName())){
//                isFound=true;
//                System.out.println(book.getName()+"책이 있습니다.");
//            }
//        }
//        return isFound;
//    }
//
//    public List<Book> addBookToList(Book book){
//        list.add(book);
//        return list;
//    }
//
//    public List<Book> getList(){
//        return list;
//    }
//
//    public void put(T key, List<Book> list){
//        maps.put(key, list );
//    }
//
//    public List<Book> showListsByBookType(BookType bookType){
//        List<Book> list1=maps.get(bookType); //map에 들어간 리스트.
//        for(Book book : list1){
//            System.out.println("showLists>>"+book);
//        }
//        return list1;
//    }
//
//    public boolean isCheckedOut(Book inputBook){ // Book외부에서 들어온 비교하려는 것.
//        // 1.  같은지 먼저 비교.
//        boolean isCheckedOut=false;
//        List<Book> list=showListsByBookType(inputBook.getBookType()); //외부 책의 북타입과 일치하는 북 리스트.
//        for(Book book : list){
//            System.out.println("isCheckedOut>>"+book);
//            if(book.getName().equalsIgnoreCase(inputBook.getName())){
//                isCheckedOut=true;
//                System.out.println(inputBook.getName()+"은 이미 대출중입니다.!!");
//            }else {
//                System.out.println(("일치하는 책이 없습니다.!!"));
//            }
//        }
//        return isCheckedOut;
//    }
//
////    public void searchGenre(BookType bookType){
////        for(Map<T, Book> bookMap : lists){
////            Book book=bookMap.get(bookType);
////            book.setIsGenreHave(true);
////            if(book.getIsGenreHave()){
////                System.out.println(sortGenreToKorean(bookType)+" 장르 책이 있습니다. ");
////            }else {
////                System.out.println(sortGenreToKorean(bookType)+"장르는 없습니다.");
////            }
////        }
////    }
//
////    public String sortGenreToKorean(BookType bookType){
////
////        switch (bookType){ // switch문에 default없으면 에러남.
////            case NOVEL :
////                return "소설분야";
////            case SOCIAL:
////                return "사회분야";
////            case SCIENCE:
////                return "과학분야";
////            default:
////                throw new IllegalArgumentException();
////        }
////    }
//
//
//    public void remove(List<Book> books){
//        maps.remove(books);
//    }
//
////    public Set getKey(T key){
////        Set set=new HashSet();
////        for(int i=0; i<maps.size();i++){
////          set= maps.get(i);
////        }
////        return set; // [NOVEL, SCIENCE]
////    }
//
//
//
//}
