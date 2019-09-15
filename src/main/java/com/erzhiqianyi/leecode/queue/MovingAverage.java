package com.erzhiqianyi.leecode.queue;

public class MovingAverage {

    private int[] data;
    private int head;
    private int sum;
    private int size;
    private int count;

    /**
     * Initialize your data structure here.
     */
    public MovingAverage(int size) {
        this.size = size;
        this.data = new int[size];

    }

    public double next(int val) {
        int original = data[head];
        data[head] = val;
        if (count < size) {
            count++;
        }
        sum = sum + val - original;
        if (head + 1 == size) {
            head = 0;
        } else {
            head++;
        }
        return 1.0 * sum / count;
    }

}
