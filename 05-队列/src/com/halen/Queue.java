package com.halen;

import com.halen.list.LinkedList;
import com.halen.list.List;

/**
 * Created By Halen 2020/5/24 11:56
 */
public class Queue<E> {

    private List<E> list = new LinkedList<>();

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enQueue(E element) {
        list.add(element);
    }

    public E deQueue(){
        return list.remove(0);
    }

    public E front() {
        return list.get(0);
    }


}
