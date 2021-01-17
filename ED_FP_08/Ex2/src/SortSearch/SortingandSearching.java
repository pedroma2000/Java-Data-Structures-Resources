package SortSearch;

import List.LinearNode;
import List.LinkedList;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class SortingandSearching {

    /**
     *
     * @param data
     * @param target
     * @param <T>
     * @return
     */
    public static <T extends Comparable<? super T>> boolean
    linearSearch(LinkedList<T> data, T target) {

        LinearNode<T> current = data.getHead();

        while (current != null) {
            if (current.getData().compareTo(target) == 0) {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

}
