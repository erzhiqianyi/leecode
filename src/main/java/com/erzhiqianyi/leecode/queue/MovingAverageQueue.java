package com.erzhiqianyi.leecode.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverageQueue {
    Queue<Integer> queue;
    int length;
    double a = 0.0D;

    /** Initialize your data structure here. */
    public MovingAverageQueue(int size) {
        queue = new LinkedList<Integer>();
        length = size;
    }

    public double next(int val) {
        if(queue.size() >= length) {
            a = a - queue.poll() +val;
            queue.offer(val);
        } else {
            a += val;
            queue.offer(val);
        }
        return a / queue.size();
    }
}
