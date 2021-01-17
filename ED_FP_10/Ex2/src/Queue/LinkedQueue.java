package Queue;

import Exceptions.EmptyListException;
import Interfaces.QueueADT;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class LinkedQueue<T> implements QueueADT<T> {

    private LinearNode<T> front, rear;
    private int size = 0;

    public LinkedQueue() {
        this.front = null;
        this.rear = null;
    }

    @Override
    public void enqueue(T element) {

        if (isEmpty()) {
            this.front = new LinearNode(element);
            this.front.setNext(null);
            this.rear = this.front;
        } else {
            this.rear.setNext(new LinearNode(element));
            this.rear = rear.getNext();
        }

        size++;
    }

    @Override
    public T dequeue() throws EmptyListException {

        if (isEmpty()) {
            throw new EmptyListException("Lista Vazia");
        }

        if (size() == 1) {
            T tmp = this.front.getData();
            this.front = this.rear = null;
            size--;
            return tmp;
        } else {
            T tmp = this.front.getData();
            this.front = front.getNext();
            size--;
            return tmp;
        }

    }

    @Override
    public T first() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("Lista Vazia");
        }

        return this.front.getData();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        String text = "";
        LinearNode Node = this.front;

        while (Node != null) {
            text += "\n" + Node.toString();
            Node = Node.getNext();
        }

        return text;
    }
}
