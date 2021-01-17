package ArrayUnorderedListPkg;

import Exceptions.ElementNotFoundException;
import Exceptions.EmptyListException;
import Interfaces.ListADT;
import java.util.Iterator;


/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public abstract class ArrayList<T> implements ListADT<T> {

    private int DEFAULT_SIZE = 5;
    protected T[] array;
    protected int rear;
    protected int modCount = 0;

    /**
     * Default / Empty ArrayList Constructor
     */
    public ArrayList() {
        array = (T[]) (new Comparable[DEFAULT_SIZE]);
        this.rear = 0;
    }

    /**
     * ArrayList Constructor that recieves a default capacity
     *
     * @param defaultcapacity
     */
    public ArrayList(int defaultcapacity) {
        array = (T[]) (new Comparable[defaultcapacity]);
        this.rear = 0;
    }

    @Override
    public T removeFirst() throws EmptyListException{
        if (isEmpty()) {
            throw new EmptyListException("Lista Vazia");
        }

        T tmp = array[0];

        for (int i = 0; i < size(); i++) {
            array[i] = array[i + 1];
        }

        this.rear--;
        this.modCount++;
        return tmp;
    }

    @Override
    public T removeLast() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("Lista vazia");
        }

        T tmp = array[rear - 1];
        array[rear - 1] = null;
        rear--;

        modCount++;
        return tmp;
    }

    @Override
    public T remove(T element) throws EmptyListException, ElementNotFoundException {

        int pos = search(element);

        if (pos == -1) {
            throw new ElementNotFoundException("Elemento Não encontrado");
        }

        T tmp = array[pos];

        if (pos == 0) {
            tmp = removeFirst();
        } else if (pos == rear - 1) {
            tmp = removeLast();
        } else {

            for (int i = pos; i < size() - 1; i++) {
                array[i] = array[i + 1];
            }

            this.rear--;
            this.modCount++;
        }

        return tmp;
    }

    @Override
    public T first() throws EmptyListException{
        if (isEmpty()) {
            throw new EmptyListException("Lista Vazia");
        }
        return array[0];
    }

    @Override
    public T last() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("Lista Vazia");
        }

        return array[rear - 1];
    }

    @Override
    public boolean contains(T target) {
        return (search(target) != -1);
    }

    @Override
    public boolean isEmpty() {
        return (size() == 0);
    }

    @Override
    public int size() {
        return this.rear;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator<T>();
    }

    @Override
    public String toString() {
        String text = "";
        Iterator it = iterator();

        while (it.hasNext()) {
            text += "\n" + it.next().toString();
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
        if (isEmpty()) {
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
