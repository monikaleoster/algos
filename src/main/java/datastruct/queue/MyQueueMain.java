package datastruct.queue;

public class MyQueueMain {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.deque();
        queue.deque();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.deque();
        queue.enqueue(60);




    }
}
