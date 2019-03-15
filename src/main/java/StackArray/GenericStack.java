package StackArray;

import java.util.Arrays;
/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;
    private int top;
    private final static int DEFAULT_SIZE = 10;

    public GenericStack ()
    {
        this(DEFAULT_SIZE);//calls GenericStack(int initSize) constructor
    }

    public GenericStack (int initSize)
    {
        elements = (E[]) new Object [initSize];
        top = -1;
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    public E pop()
    {
        if(isEmpty()){throw new IndexOutOfBoundsException("Stack is empty");}
        return elements[top--];
    }

    public void push(E itm)
    {
        elements[++top] = itm;
    }

    public int size()
    {
        return (top + 1);
    }
}
