package com.erzhiqianyi.leecode.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现队列，使用动态数组和指向队列头部的索引。
 */
public class MyQueue<T> {
    private List<T> queue;
    private int start;

    public MyQueue() {
        queue = new ArrayList<T>();
        start = 0;
    }

    public boolean enQueue(T x) {
        queue.add(x);
        return true;
    }

    public T deQueue() {
        if (isEmpty()) {
            return null;
        }
        T result = queue.get(start);
        queue.set(start, null);
        start++;
        return result;
    }

    public T front() {
        return queue.get(start);
    }

    public boolean isEmpty() {
        return start >= queue.size();
    }

}
