package ex11_DesignPatten_YukiHirosi.Iterator;

public class TestBookShelf {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("King!!"));
        bookShelf.appendBook(new Book("Prince"));
        bookShelf.appendBook(new Book("party"));

        BookShelfIterator it = new BookShelfIterator(bookShelf);

    }

}
