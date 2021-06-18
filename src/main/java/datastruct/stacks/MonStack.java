package datastruct.stacks;

import java.util.NoSuchElementException;

public class MonStack<T> {

    Object[] arr;
    int size;
    int top=-1;
    MonStack(int capacity){
        arr= new Object[capacity];
    }

    void push(T elem){
        if(size>=arr.length)
            throw new RuntimeException("Stack is full");
        arr[++top] = elem;
        size++;
    }

    T pop(){
        if(top==-1)
            throw  new NoSuchElementException("Stack is empty");
        Object elem = arr[top];
        arr[top] =0;
        top --;
        size --;
        return (T) elem;
    }

    T peek(){
        if(top==-1)
            return null;
        Object elem = arr[top];
        return (T) elem;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return !(size>0);
    }

    void print(){
        while (!isEmpty()){
            System.out.println(pop());
        }
    }
}
