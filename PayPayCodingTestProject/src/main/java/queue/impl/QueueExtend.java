package queue.impl;

import java.util.ArrayDeque;
import java.util.Deque;
import queue.Queue;

public class QueueExtend<T> implements Queue<T> {

    private Deque<T> queue = new ArrayDeque<>();

    @Override
    public Queue<T> enQueue(T t) {
        QueueExtend<T> newResult = new QueueExtend<>();
        newResult.queue = new ArrayDeque<>(this.queue);
        newResult.queue.add(t);
        return newResult;
    }

    @Override
    public Queue<T> deQueue() {
        QueueExtend<T> newResult = new QueueExtend<>();
        newResult.queue = new ArrayDeque<>(this.queue);
        newResult.queue.remove();
        return newResult;
    }

    @Override
    public T head() {
        return this.queue.peek();
    }

    @Override
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

}
