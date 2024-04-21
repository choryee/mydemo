package ex13_ChatGPT.ProgramPractice.Library;

public class Book {
    private String name;
    private int rentAvailableDay;
    private BookType bookType; // 이것, BookSystem에서 키로 넣음.

    private int quantity;
    private boolean isRented;
    private boolean isGenreHave;


    Book(String bookName, int rentAvailableDay, int quantity, BookType bookType){
        this.name=name;
        this.rentAvailableDay=rentAvailableDay;
        this.quantity=quantity;
        this.bookType=bookType;
        isRented=false;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public int getrentAvailableDay(){
        return rentAvailableDay;
    }

    public boolean getIsRented(){
        return isRented;
    }

    public void setIsRented(boolean isRented){
        this.isRented=isRented;
    }

   public void setIsGenreHave(boolean isGenreHave){
        this.isGenreHave=isGenreHave;
   }

   public boolean getIsGenreHave(){
        return isGenreHave;
   }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", rentAvailableDay=" + rentAvailableDay +
                '}';
    }
}
