package ex13_ChatGPT.ProgramPractice.Library;//package ex13_ChatGPT.ProgramPractice.Library;
//
//import java.time.DayOfWeek;
//import java.time.LocalDate;
//import java.time.temporal.ChronoUnit;
//
//public class BookUser1 {
//    private String name;
//    private Book book;
//    private int rentDay;
//
//
//    BookUser1(String name, int rentDay, Book book){
//        this.name=name;
//        this.book=book;
//        this.rentDay=rentDay;
//    }
//
//    public void rented(Book book){
////        if( book.getIsRented() ){
////            book.getIsRented()=true;
////        }
//
//
//
//    }
//
//    public void notifyReturnDay(){
//        if(book.getrentAvailableDay() < rentDay ){
//            throw new IllegalArgumentException("예약 가능일보다 더 대출은 불가능합니다. !!");
//        }
//
//        LocalDate today=LocalDate.now();
//        int todayInt=  today.getDayOfWeek().getValue(); //27
//
//        int year=2023;
//        int month=8;
//        int day=rentDay;
//
//
//        // System.out.println(today);
//        LocalDate deadline=today.plusDays(day);
//
//        int returnYear=deadline.getYear();
//        int returnMonth=deadline.getMonth().getValue();
//        int returnDay=deadline.getDayOfMonth();
//        DayOfWeek dayofweek=deadline.getDayOfWeek();
//
//        long daysUntilReturn=daysUntilReturn = ChronoUnit.DAYS.between(today, deadline);
//
//        if(daysUntilReturn >= 0L){
//            System.out.println(name+"님의 반납일은 "+returnYear+"년 "+returnMonth+"월 "+returnDay+"일, " +dayofweek+"요일 입니다.");
//            if(daysUntilReturn == 0L)
//            System.out.println("반납일은 오늘입니다.");
//        }else {
//            System.out.println("현재 대출중이라 대출 불가입니다.!!");
//            return;
//        }
//
//
//
//    }
//}
