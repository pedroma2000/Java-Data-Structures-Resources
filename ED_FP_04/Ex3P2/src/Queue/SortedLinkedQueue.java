package Queue;

import Interfaces.QueueADT;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class SortedLinkedQueue<T extends Comparable> implements QueueADT<T> {

    private LinearNode<T> front, rear;
    private int size = 0;

    public SortedLinkedQueue() {
        this.front = null;
        this.rear = null;
    }

    @Override
    public void enqueue(T element) {

        boolean found = false;
        LinearNode<T> current = this.front;
        LinearNode<T> p = null;

        if (size() == 0) {
            this.front = new LinearNode(element);
            this.front.setNext(null);
            this.rear = this.front;
        } else {

            while (current != null && found == false) {
                if (current.getData().compareTo(element) > 0) {
                    found = true;
                } else {
                    p = current;
                    current = current.getNext();
                }
            }


            if(found == true){

                if(current == this.front){
                    this.front = new LinearNode(element);
                    this.front.setNext(current);
                } else {
                    p.setNext(new LinearNode(element));
                    p.getNext().setNext(current);
                }

            } else {
                this.rear.setNext(new LinearNode(element));
                this.rear = this.rear.getNext();
            }

        }
        size++;

    }

    @Override
    public T dequeue() {
        T tmp = null;

        if (size() == 0) {
            return null;
        } else if (size() == 1) {
            tmp = this.front.getData();
            this.front = this.rear = null;
            size--;
            return tmp;
        } else {
            tmp = this.front.getData();
            this.front = front.getNext();
            size--;
            return tmp;
        }
    }

    @Override
    public T first() {
        if (size() == 0) {
            return null;
        } else {
            return this.front.getData();
        }
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

        if (Node != null) {
            while (Node != null) {
                text += "\n" + Node.toString();
                Node = Node.getNext();
            }
        } else {
            System.out.println("Empty QUEUE");
        }

        return text;
    }

}
