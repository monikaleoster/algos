package datastruct.queue;

import java.util.NoSuchElementException;

public class MyQueue {

    int size, cap, front,rear;
    int[] arr;
    MyQueue(int cap){
        size =0;
        this.cap= cap;
        arr = new int[cap];
        front = -1;
        rear = size-1;
    }

    void enqueue(int x){
        if(isFull())
            throw  new RuntimeException("queue full");
        if(size==0){
            front =0;
        }
        if(rear == cap-1){
            rear =0;
        }else {
            rear = rear + 1;
        }
        arr[rear] = x;
        size++;
    }

    void deque(){
        if(size==0)
            throw new NoSuchElementException("Empty queue");
       front = front+1;
        size--;

    }


    int getFront(){
        return front;
    }

    int getRear(){
        return rear;
    }

    boolean isFull(){
        return size==cap;
    }

    boolean isEmpty(){
        return size==0;
    }
}
