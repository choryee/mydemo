package ex09_JavaCoding_Quiz.melon;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
