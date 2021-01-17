package DoublyLinkedOrderedListPkg;

import Interfaces.OrderedListADT;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class DoublyLinkedOrderedList<T> extends DoublyLinkedList<T>
        implements OrderedListADT<T> {

    public DoublyLinkedOrderedList() {
    }

    @Override
    public void add(T element) {
        if (element instanceof Comparable) {
            DoubleNode<T> newNode = new DoubleNode<>(element);
            DoubleNode<T> current = this.head;

            if (isEmpty()) {
                this.head = newNode;
                this.tail = this.head;

            } else {

                boolean found = false;


                while (current != null && found == false) {
                    Comparable<T> tmp = (Comparable<T>) current.getElement();
                    if (tmp.compareTo(newNode.getElement()) > 0) {
                        found = true;
                    } else {
                        current = current.getNext();
                    }

                }

                if (found == true) {
                    if (current == this.head) {

                        DoubleNode<T> olderHead = this.head;
                        this.head = newNode;
                        this.head.setNext(olderHead);
                        olderHead.setPrevious(this.head);

                    } else {
                        DoubleNode<T> previous = current.getPrevious();

                        previous.setNext(newNode);
                        current.setPrevious(newNode);

                        newNode.setPrevious(previous);
                        newNode.setNext(current);
                    }

                } else {
                    DoubleNode<T> olderTail = this.tail;
                    this.tail = newNode;
                    this.tail.setPrevious(olderTail);
                    olderTail.setNext(this.tail);
                }

            }
            size++;
        } else {
            System.out.println("Elemento não é comparable!");
        }
    }

}
