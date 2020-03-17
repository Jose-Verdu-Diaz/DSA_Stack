package main;

import java.util.ArrayList;

public class StackClass<E> implements Stack<E> {
    private int max_len;
    private int len;
    private ArrayList<E> items = new ArrayList<E>();

    public StackClass(int num) {
        this.max_len = num;
        this.len = 0;
    }

    public void stack(E e) throws FullStackException {
        if (this.max_len > this.len) {
            this.items.add(e);
            this.len += 1;
        }
        else {
            throw new FullStackException();
        }
    }

    public E pop() throws EmptyStackException {
        if (this.len == 0) {
            throw new EmptyStackException();
        }
        else {
            this.len -= 1;
            E e = items.get(this.len);
            items.remove(this.len);
            return e;
        }
    }

    public int len() {
        return this.len;
    }

}
