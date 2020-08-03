package com.example.orderforms.util;

public interface StackSkeleton<E> { //LIFO
    public boolean isEmpty();
    public E pop() throws Exception;
    public E peek() throws Exception;
    public void push(E e);

}
