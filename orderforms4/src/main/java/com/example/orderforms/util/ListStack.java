package com.example.orderforms.util;

public class ListStack<E> implements StackSkeleton<E> {
    //public static constants

    //private static vars
    //private instance vars

    //public functions

    //private utilities call by public functions
    private Node<E> top;

    public ListStack() {
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
    @Override
    public void push(E data) {
        top = new Node<E>(data, top);
    }
    @Override
    public E pop() throws Exception {
        if(isEmpty()) throw new Exception("Stack is empty");
        E data = top.data;
        top = top.next;

        return data;
    }
    @Override
    public E peek() throws Exception {
        if(isEmpty())  throw new Exception("Stack is empty");

        return top.data;
    }
    public void clear() {
        top = null;
    }
    public String toString() {
        if(isEmpty()) return "[ ]";

        StringBuffer out = new StringBuffer("[");
        Node<E> tmp = top;
        while(tmp != null) {
            out.append(tmp.data + "  ");
            tmp = tmp.next;
        }

        out.append("]");
        return out.toString();
    }
    
    private static class Node<E> {
        public E data;
        public Node<E> next;

        public Node(E data) {
            this(data, null );
        }

        public Node(E data, Node<E> n) {
            this.data = data; next = n;
        }
    }
}
