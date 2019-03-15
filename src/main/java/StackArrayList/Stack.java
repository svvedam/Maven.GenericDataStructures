package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> extends java.util.Stack<E>{
    private ArrayList elements;


    public Stack(){
        elements = new ArrayList<>();
    }
    public E push(E nextElement){
        elements.add(nextElement);

        return nextElement;
    }
    public E pop(){
        if(isEmpty()){throw new IndexOutOfBoundsException("Stack is empty");}
        return (E) elements.remove(elements.size()-1);
    }
    public boolean isEmpty(){
        return elements.isEmpty();
    }
}

