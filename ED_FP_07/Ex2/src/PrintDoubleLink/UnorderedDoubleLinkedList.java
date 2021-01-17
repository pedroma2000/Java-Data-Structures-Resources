package PrintDoubleLink;

import Interfaces.UnorderedDoublyLinkedListADT;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class UnorderedDoubleLinkedList<T> extends DoublyLinkedList<T> implements UnorderedDoublyLinkedListADT<T> {
    @Override
    public void addToFront(T element) {

        DoubleNode<T> newNode = new DoubleNode<>(element);

        if (isEmpty()) {
            head = newNode;
            tail = head;
        } else {
            DoubleNode<T> tmp = head;
            head = newNode;
            newNode.setNext(tmp);
            tmp.setPrevious(head);
        }
        size++;
        modCount++;
    }

    @Override
    public void addToRear(T element) {

        DoubleNode<T> newNode = new DoubleNode<>(element);

        if (isEmpty()) {
            addToFront(element);
        } else {

            DoubleNode<T> tmp = tail;
            tail = newNode;

            newNode.setPrevious(tmp);
            tmp.setNext(newNode);

            size++;
            modCount++;

        }


    }

    @Override
    public void addAfter(T element, T target) {
        boolean found = false;
        DoubleNode<T> current = head;


        while (current != null && found == false) {
            if (current.getElement().equals(target)) {
                found = true;
            } else {
                current = current.getNext();
            }
        }

        if (found == true) {

            if (current != tail) {
                DoubleNode<T> newNode = new DoubleNode<>(element);
                DoubleNode<T> nextTocurrent = current.getNext();

                newNode.setNext(nextTocurrent);
                newNode.setPrevious(current);
                current.setNext(newNode);
                nextTocurrent.setPrevious(newNode);

                size++;
                modCount++;
            } else {
                addToRear(element);
            }

        } else {
            System.out.println("Current é tail");
        }


    }


    public String PrintRecursionFromHead(DoubleNode<T> current) {

        if (current.getNext() == null) {
            return "\n" + current.toString();
        }
        return "\n" + current.toString() + PrintRecursionFromHead(current.getNext());

    }

    public String PrintRecursionFromTail(DoubleNode<T> current) {

        if (current.getPrevious() == null) {
            return "\n" + current.toString();
        }
        return "\n" + current.toString() + PrintRecursionFromTail(current.getPrevious());

    }

    @Override
    public String toString(){
        return PrintRecursionFromHead(head);
    }

    public String toStringReverse(){
        return PrintRecursionFromTail(tail);
    }
}
