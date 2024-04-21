package ex11_DesignPatten_YukiHirosi.Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator1 implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    BookShelfIterator1(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            //index++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        } else {
            index++;
            return bookShelf.getBookAt(index);
        }
    }
}