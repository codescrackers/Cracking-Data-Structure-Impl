package com.edsoft.stackqueue;

/**
 * Created by yusuf on 05.10.2016.
 */
public class MyQueueWithStack<T> {
    private MyStack<T> first;
    private MyStack<T> last;

    public MyQueueWithStack() {
        first = new MyStack<>();
        last = new MyStack<>();
    }

    public void enqueue(T item) {
        first.push(item);
    }

    public T dequeue() {
        while (!first.isEmpty()) {
            last.push(first.pop());
        }
        return last.pop();
    }

    public T peek() {
        while (!first.isEmpty()) {
            last.push(first.pop());
        }
        return last.peek();
    }

}
