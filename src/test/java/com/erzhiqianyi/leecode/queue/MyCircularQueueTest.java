package com.erzhiqianyi.leecode.queue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {
    @Test
    public void MyCircularQueue() {
        MyCircularQueue circularQueue = new MyCircularQueue(5); // 设置长度为 3
        boolean result = false;
        circularQueue.enQueue(5);  // 返回 true
        circularQueue.enQueue(13);  // 返回 true
        circularQueue.enQueue(8);  // 返回 true
        circularQueue.enQueue(2);  // 返回 true
        circularQueue.enQueue(10);  // 返回 true
        assertTrue(circularQueue.isFull());
        assertEquals(circularQueue.Front(),5);
        circularQueue.deQueue();

        assertEquals(circularQueue.Front(),13);
        circularQueue.deQueue();
        assertEquals(circularQueue.Front(),8);
        circularQueue.enQueue(23);  // 返回 true
        circularQueue.enQueue(6);  // 返回 true
        assertTrue(circularQueue.isFull());
        circularQueue.deQueue();
        assertEquals(circularQueue.Front(),2);
        circularQueue.deQueue();
        assertEquals(circularQueue.Front(),10);

        circularQueue.deQueue();
        assertEquals(circularQueue.Front(),23);
        circularQueue.deQueue();
        assertEquals(circularQueue.Front(),6);
        circularQueue.deQueue();
        assertTrue(circularQueue.isEmpty());

        circularQueue.enQueue(5);  // 返回 true
        circularQueue.enQueue(13);  // 返回 true
        circularQueue.enQueue(8);  // 返回 true
        circularQueue.enQueue(2);  // 返回 true
        circularQueue.enQueue(10);  // 返回 true
        assertTrue(circularQueue.isFull());

    }

    @Test
    public void queueTest(){
        // 1. Initialize a queue.
        Queue<Integer> q = new LinkedList();
        // 2. Get the first element - return null if queue is empty.
        System.out.println("The first element is: " + q.peek());
        // 3. Push new element.
        q.offer(5);
        q.offer(13);
        q.offer(8);
        q.offer(6);
        // 4. Pop an element.
        q.poll();
        // 5. Get the first element.
        System.out.println("The first element is: " + q.peek());
        // 7. Get the size of the queue.
        System.out.println("The size is: " + q.size());
    }

}