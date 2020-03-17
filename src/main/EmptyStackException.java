package main;

public class EmptyStackException extends Exception{
    public EmptyStackException() {
        super("Empty stack.");
    }
}
