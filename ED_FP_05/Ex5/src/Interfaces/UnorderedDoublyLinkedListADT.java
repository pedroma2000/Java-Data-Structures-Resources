package Interfaces;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public interface UnorderedDoublyLinkedListADT<T> extends ListADT<T> {

    public void addToFront(T element);

    public void addToRear(T element);

    public void addAfter(T element, T target);

}
