package PrintList;

import Interfaces.LinkedListADT;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class LinkedList<T> implements LinkedListADT<T> {

    LinearNode<T> head, tail;
    private int counter = 0;

    @Override
    public void add(T element) {
        LinearNode<T> newNode = new LinearNode<>(element);

        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        counter++;
    }

    @Override
    public String toString() {
        return PrintRecursion(head);
    }

    public String PrintRecursion(LinearNode<T> current) {
        if (current.getNext() == null) {
            return "\n" + current.toString();
        }
        return "\n" + current.toString() + PrintRecursion(current.getNext());
    }
}
