package ex11_DesignPatten_YukiHirosi.Iterator;

import java.util.Iterator;

public interface Iterable<E> {
    public abstract Iterator<E> iterator();
}
