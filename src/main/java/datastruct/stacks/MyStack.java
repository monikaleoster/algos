package datastruct.stacks;

import java.util.NoSuchElementException;

public class MyStack {

    int[] arr;
    int size;
    int top=-1;
    MyStack(int capacity){
        arr= new int[capacity];
    }

    void push(int elem){
        if(size>=arr.length)
            throw new RuntimeException("Stack is full");
        arr[++top] = elem;
        size++;
    }

    int pop(){
        if(top==-1)
            throw  new NoSuchElementException("Stack is empty");
        int elem = arr[top];
        arr[top] =0;
        top --;
        size --;
        return  elem;
    }

    int peek(){
        if(size==0)
            throw  new NoSuchElementException("Stack is empty");
        int elem = arr[top];
        top--;
        return  elem;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return !(size>0);
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);
        myStack.push(5);
        myStack.push(15);
        myStack.push(25);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        myStack.push(   35);
        System.out.println(myStack.size());
        System.out.println(myStack.isEmpty());



    }
}
