package datastruct.stacks;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyStackLinkedList {

    LinkedList<Integer> list = new LinkedList<>();

    void push(int elem) {
        list.push(elem);

    }

    int pop() {

    if(list.size()==0)
        throw  new NoSuchElementException("no such element");
    return list.getLast();
    }
    }
