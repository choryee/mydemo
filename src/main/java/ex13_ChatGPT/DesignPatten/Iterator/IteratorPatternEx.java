package ex13_ChatGPT.DesignPatten.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MyList<T> implements Iterable<T>{
    private List<T> items=new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>();
    }
}

class MyIterator<T> implements Iterator<T>{

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
public class IteratorPatternEx {
}
