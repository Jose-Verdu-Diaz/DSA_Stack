package main;

public interface Stack<E> {
    E pop() throws EmptyStackException;
    void stack(E e) throws FullStackException;
    int len();
}
