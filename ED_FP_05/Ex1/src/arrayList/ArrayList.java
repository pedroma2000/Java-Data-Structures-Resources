package arrayList;

import Interfaces.ListADT;

import java.util.Iterator;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class ArrayList<T> implements ListADT<T> {

    private class ArrayListIterator<T> implements Iterator<T> {
        private int counter = 0;

        @Override
        public boolean hasNext() {
            if (counter < size) {
                return true;
            }
            return false;

        }

        @Override
        public T next() {
            if (hasNext()) {
                T tmp = (T) array[counter];
                counter++;
                return tmp;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private int DEFAULT_SIZE = 5;
    protected T[] array;
    protected int size;
    protected int rear;

    /**
     * Default / Empty ArrayList Constructor
     */
    public ArrayList() {
        array = (T[]) (new Comparable[DEFAULT_SIZE]);
        this.size = 0;
        this.rear = 0;
    }

    /**
     * ArrayList Constructor that recieves a default capacity
     *
     * @param defaultcapacity
     */
    public ArrayList(int defaultcapacity) {
        array = (T[]) (new Comparable[defaultcapacity]);
        this.size = 0;
        this.rear = 0;
    }

    @Override
    public T removeFirst() {
        if (isEmpty() == true) {
            return null;
        }

        T tmp = array[0];
        size--;

        for (int i = 0; i < size(); i++) {
            array[i] = array[i + 1];
        }
        return tmp;
    }

    @Override
    public T removeLast() {
        if (isEmpty() == true) {
            return null;
        }

        T tmp = array[rear - 1];
        array[rear - 1] = null;
        rear--;
        size--;

        return tmp;
    }

    @Override
    public T remove(T element) {

        int pos = search(element);

        if (pos == -1) {
            return null;
        } else if (pos == 0) {
            return removeFirst();
        } else if (pos == rear - 1) {
            return removeLast();
        }

        size--;
        rear--;

        T tmp = array[pos];

        for (int i = pos; i < size(); i++) {
            array[i] = array[i + 1];
        }

        return tmp;
    }

    @Override
    public T first() {
        if (isEmpty()) {
            return null;
        }
        return array[0];
    }

    @Override
    public T last() {
        return array[rear - 1];
    }

    @Override
    public boolean contains(T target) {
        return (search(target) > -1);
    }

    @Override
    public boolean isEmpty() {
        return (size() == 0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        ArrayListIterator itr = new ArrayListIterator<T>();
        return itr;
    }

    @Override
    public String toString() {
        String text = "";
        Iterator<T> it = iterator();
        if (isEmpty() == true) {
            return "Empty List!";
        }

        while (it.hasNext()) {
            text += it.next().toString() + "\n";
        }

        return text;
    }

    /**
     * Search a specific element and returns its index position from the arraylist
     *
     * @param target
     * @return i, -1
     */
    private int search(T target) {
        if (isEmpty() == true) {
            return -1;
        }

        for (int i = 0; i < size(); i++) {
            if (target.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

}
