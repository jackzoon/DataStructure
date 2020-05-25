package com.halen.circle;


/**
 * Created By Halen 2020/5/24 14:04
 */
public class CircleQueue<E> {

    private int size;
    private E[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int front;


    public CircleQueue() {
        this.elements = (E[]) new Object[DEFAULT_CAPACITY];
    }


    public int size() {
        return size;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[index(i)] = null;
        }
        size = 0;
        front = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enQueue(E element) {
        ensureCapacity(size + 1);
        elements[index(size)] = element;
        size++;
    }

    public E deQueue() {
        E val = elements[front];
        elements[front] = null;
        front = index(1);
        size--;
        return val;
    }

    public E front() {
        return elements[front];
    }

    private int index(int index) {
        index += front;
        return index - (index >= elements.length ? elements.length : 0);
    }

    private void ensureCapacity(int capacity) {
        int oldCapacity = elements.length;
        if (oldCapacity >= capacity) {
            return;
        }
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        E[] newElements = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[index(i)];
        }
        front = 0;
        elements = newElements;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("capacity=").append(elements.length).append("size=").append(size).append(", [");
        for (int i = 0; i < elements.length; i++) {
            if (i != 0) {
                string.append(", ");
            }
            string.append(elements[i]);
        }
        string.append("]");
        return string.toString();
    }
}
