package com.erzhiqianyi.leecode.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyQueueTest {
    @Test
    public void MyQueue(){
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        if (q.isEmpty() == false) {
            System.out.println(q.front());
            assertEquals(5,q.front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            assertEquals(3,q.front());
            System.out.println(q.front());
        }
        q.deQueue();
        assertTrue(q.isEmpty());

    }

}