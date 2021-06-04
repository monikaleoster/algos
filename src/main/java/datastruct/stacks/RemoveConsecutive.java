package datastruct.stacks;

import java.util.ArrayList;
import java.util.NoSuchElementException;

class MyStackL
{

    char[] arr;
    int size;
    int top=-1;
    MyStackL(int capacity){
        arr= new char[capacity];
    }

    void push(char elem){
        if(size>=arr.length)
            throw new RuntimeException("Stack is full");
        arr[++top] = elem;
        size++;
    }

    char pop(){
        if(top==-1)
            throw  new NoSuchElementException("Stack is empty");
        char elem = arr[top];
        arr[top] =0;
        top --;
        size --;
        return  elem;
    }

    char peek(){
        if(top==-1)
           return Character.MIN_HIGH_SURROGATE;
        char elem = arr[top];
        return  elem;
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

class RemoveConsecutive
{



   //Function to remove consecutive duplicates from given string using Stack.
    public static String removeConsecutiveDuplicates(String str)
    {
        String ret = "";
        // Your code here
        char[] chars = str.toCharArray();
        MyStackL stack = new MyStackL(chars.length);
        for(int i =0;i<chars.length;i++){
            if(stack.isEmpty() || stack.peek()!=chars[i])
            {
                stack.push(chars[i]);
                ret = ret+chars[i];
            }

        }


        return ret;

    }

    public static void main(String[] args) {

    RemoveConsecutive removeConsecutive = new RemoveConsecutive();
        System.out.println(RemoveConsecutive.removeConsecutiveDuplicates("aabbc"));
    }
}