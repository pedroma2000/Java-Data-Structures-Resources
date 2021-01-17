package Queue;

import Interfaces.QueueADT;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class CircularArrayQueue<T> implements QueueADT<T> {

    private final int DEFAULT_CAPACITY = 10;
    private T[] circular;
    private int front, rear;
    private int size = 0;

    public CircularArrayQueue() {
        circular = (T[]) (new Object[DEFAULT_CAPACITY]);
        front = rear = 0;
    }

    @Override
    public void enqueue(T element) {

        if (size() == circular.length) {
            expandCapacity();
        }

        circular[rear] = element;
        rear = (rear + 1) % circular.length;
        size++;

    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }

        T tmp = circular[front];
        front = (front + 1) % circular.length;
        size--;
        return tmp;
    }

    @Override
    public T first() {
        if (isEmpty()) {
            return null;
        } else {
            return circular[front];
        }
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void expandCapacity() {

        T[] tmp = (T[]) (new Object[circular.length + DEFAULT_CAPACITY]);
        int tmpFront = front;

        for (int i = 0; i < circular.length; i++) {
            tmp[i] = circular[tmpFront];
            tmpFront = (tmpFront + 1) % circular.length;
        }
        front = 0;
        rear = size();

        circular = tmp;
    }

    @Override
    public String toString() {
        String text = "";
        int start = front;

        while (start != rear) {
            text += "\n" + circular[start].toString();
            start = (start + 1) % circular.length;
        }

        return text;
    }

}
