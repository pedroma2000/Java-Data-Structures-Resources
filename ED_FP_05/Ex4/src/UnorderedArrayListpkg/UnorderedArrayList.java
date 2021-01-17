package UnorderedArrayListpkg;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class UnorderedArrayList<T> extends ArrayList<T> implements Interfaces.UnorderedArrayListADT<T> {

    @Override
    public void addToFront(T element) {

        if (isEmpty()) {
            array[0] = element;
        }

        for (int i = rear - 1; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = element;

        modCount++;
        rear++;
    }

    @Override
    public void addToRear(T element) {
        array[rear] = element;
        rear++;
        modCount++;
    }

    @Override
    public void addAfter(T element, T target) {
        boolean found = false;
        int current = 0;

        while (current < size() && found == false) {

            if (array[current].equals(target)) {

                found = true;

            } else {
                current++;
            }
        }

        if (found = true) {

            for (int i = rear - 1; i > current; i--) {
                array[i + 1] = array[i];
            }

            array[current + 1] = element;
            rear++;
            modCount++;

        } else {
            addToRear(element);
        }

    }

}
