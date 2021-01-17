package SortSearch;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class SortingandSearching {

    /**
     *
     * @param data
     * @param min
     * @param max
     * @param target
     * @param <T>
     * @return
     */
    public static <T extends Comparable<? super T>> boolean
    linearSearch(T[] data, int min, int max, T target) {

        for (int i = 0; i <= max; ++i) {
            if (data[i].compareTo(target) == 0) {
                return true;
            }
        }

        return false;
    }

    /**
     *
     * @param data
     * @param min
     * @param max
     * @param target
     * @param <T>
     * @return
     */
    public static <T extends Comparable<? super T>> boolean
    binarySearch(T[] data, int min, int max, T target) {

        boolean found = false;

        // determine the midpoint
        int midpoint = (min + max) / 2;

        if (data[midpoint].compareTo(target) == 0) {
            found = true;
        } else if( data[midpoint].compareTo(target) > 0){
            if(min < midpoint - 1){
                found = binarySearch(data, min, midpoint - 1, target);
            }
        } else {
            if(midpoint + 1 <= max){
                found = binarySearch(data, midpoint + 1, max, target);
            }
        }

        return found;
    }
}
