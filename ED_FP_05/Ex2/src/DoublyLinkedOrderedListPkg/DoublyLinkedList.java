package DoublyLinkedOrderedListPkg;

import Interfaces.ListADT;

import java.util.Iterator;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class DoublyLinkedList<T> implements ListADT<T> {

    private class DoublyLinkedListIterator<T> implements Iterator<T> {
        private int expectedModCount = modCount;

        private DoubleNode<T> current = (DoubleNode<T>) head;

        @Override
        public boolean hasNext() {
            if (current != null) {
                return true;
            }

            return false;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T tmp = current.getElement();
                current = current.getNext();
                return tmp;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    protected DoubleNode<T> head, tail;
    protected int size = 0;
    protected int modCount = 0;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public T removeFirst() {

        if(isEmpty()){
            return null;
        } else if(size() == 1){
            T tmp = (T) this.head;
            this.head = null;
            this.tail = null;
            size--;
            return tmp;
        } else {
            T tmp = (T) this.head;
            this.head = this.head.getNext();
            this.head.setPrevious(null);
            size--;
            return tmp;
        }

    }

    @Override
    public T removeLast() {
        if(isEmpty()){
            return null;
        } else if(size() == 1){
            T tmp = (T) this.tail;
            this.tail = null;
            this.head = this.tail;
            size--;
            return tmp;
        } else {
            T tmp = (T) this.tail;
            this.tail = tail.getPrevious();
            tail.setNext(null);
            size--;
            return tmp;
        }

    }

    @Override
    public T remove(T element) {

        if (isEmpty() == true) {
            return null;
        }

        DoubleNode<T> tmp = search(element);

        if(tmp != null) {
            if (this.head == tmp || size() == 1) {
                return removeFirst();
            } else if (this.tail == tmp) {
                return removeLast();
            } else {
                tmp.getNext().setPrevious(tmp.getPrevious());
                tmp.getNext().getPrevious().setNext(tmp.getNext());

            }

            size--;
            return tmp.getElement();
        }

        return null;
    }


    @Override
    public T first() {
        if(isEmpty()){
            return null;
        }
        return head.getElement();
    }

    @Override
    public T last() {
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }

    @Override
    public boolean contains(T target) {
        return (search(target) == target);
    }

    @Override
    public boolean isEmpty() {
        return (size() == 0);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> itr = new DoublyLinkedListIterator<T>();
        return itr;
    }


    private DoubleNode<T> search(T target) {

        DoubleNode<T> current = this.head;
        if (isEmpty() == true) {
            return null;
        }

        while (current != null) {

            if (current.getElement() == target) {
                return current;
            } else {
                current = current.getNext();
            }

        }

        return null;
    }

    @Override
    public String toString() {

        String text = "";
        Iterator<T> it = new DoublyLinkedListIterator<T>();


        if (isEmpty()) {
            return null;
        }

        while (it.hasNext()) {
            text += it.next().toString() + "\n";
        }

        return text;
    }

}
