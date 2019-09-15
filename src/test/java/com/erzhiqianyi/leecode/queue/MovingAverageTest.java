package com.erzhiqianyi.leecode.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovingAverageTest {

    @Test
    public void average() {
        MovingAverage m = new MovingAverage(3);
        assertEquals(1,m.next(1));
        assertEquals(5.5,m.next(10));
        assertEquals(4.666666666666667,m.next(3));
        assertEquals(6.0,m.next(5));
    }

    @Test
    void next() {
        long current = System.currentTimeMillis();
        MovingAverageQueue movingAverage = new MovingAverageQueue(1000);
        for (int i = 0; i < 100000000; i++) {
            movingAverage.next(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - current);

    }

    @Test
    void next1() {
        long current = System.currentTimeMillis();
        MovingAverage movingAverage = new MovingAverage(1000);
        for (int i = 0; i < 100000000; i++) {
            movingAverage.next(i);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - current);
    }
}