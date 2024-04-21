package ex13_JavaCodingInterview.OnlieLibray;

public class TestLibrary {
    public static void main(String[] args) {
        Library library=new Library();
        library.addBook(new Book("kim","Prince", "1000"));
        library.addBook(new Book("Lee", "King", "1001"));

        Book bookFind=library.find("1000");
        System.out.println(bookFind);


    }
}
