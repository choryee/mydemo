package ex09_JavaCoding_Quiz.P169_FactoryPattern.src.modern.challenge;

@FunctionalInterface
public interface TriFunction<T, U, V, R> {

    R apply(T t, U u, V v);
}
