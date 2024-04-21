package ex13_ChatGPT.ProgramPractice.Library;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;

public class BookUser<T extends Enum<T>> {
    BookSystem bookSystem = BookSystem.getInstance(); //싱글톤패턴으로 만든거 가져온것.
    private String name;
    private Book book; // BookUser가 대출하는 책.
    //private BookType bookType;
   // private BookSystem bookSystem;
    private int rentDay;

    BookUser(){

    }

    public Book getBook(){
        return book;
    }
    public String getName() {
        return name;
    }
      public int getRentDay() {
        return rentDay;
    }

    public void userCheckoutBook(Book book, int num){ //num 대출할 권수.
       if(bookSystem.searchBooks(book)){
           if( book.getQuantity() >= num){
           int quan= book.getQuantity()-num;
           book.setQuantity(quan);
           System.out.println(book.getName()+"의 현재 재고는 "+book.getQuantity()+"권 입니다.!!");
           }else {
               throw new IllegalArgumentException("현재보다 초과입니다.!!");
           }

       }

    }

    public void notifyReturnDay(){
        // getDayOfWeek 요일
        // getDayOfMonth 날짜

        if(book.getrentAvailableDay() < rentDay ){
            throw new IllegalArgumentException("예약 가능일보다 더 대출은 불가능합니다. !!");
        }

        LocalDate today=LocalDate.now();
        int todayInt=  today.getDayOfWeek().getValue(); //27

        int year=2023;
        int month=8;
        int day=rentDay;

        // System.out.println(today);
        LocalDate deadline=today.plusDays(day);

        int returnYear=deadline.getYear();
        int returnMonth=deadline.getMonth().getValue();
        int returnDay=deadline.getDayOfMonth();
        DayOfWeek dayofweek=deadline.getDayOfWeek();

        long daysUntilReturn=daysUntilReturn = ChronoUnit.DAYS.between(today, deadline);

        if(daysUntilReturn >= 0L){
            System.out.println(name+"님의 반납일은 "+returnYear+"년 "+returnMonth+"월 "+returnDay+"일, " +dayofweek+"요일 입니다.");
            if(daysUntilReturn == 0L)
            System.out.println("반납일은 오늘입니다.");
        }else {
            System.out.println("현재 대출중이라 대출 불가입니다.!!");
            return;
        }
    }
}
