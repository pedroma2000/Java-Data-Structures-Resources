package MainPkg;

import Exceptions.EmptyCollectionException;
import Exceptions.EmptyListException;
import Tree.ArrayHeap;

import java.util.Iterator;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Main {

    public static void test(int i) throws EmptyListException, EmptyCollectionException {

        ArrayHeap<Integer> heap1 = new ArrayHeap();
        Iterator<Integer> itr;

        switch (i) {
            case 1:
                heap1.addElement(3);
                heap1.addElement(5);
                heap1.addElement(4);
                heap1.addElement(8);
                heap1.addElement(7);
                heap1.addElement(9);
                heap1.addElement(2);

                itr = heap1.iteratorLevelOrder();
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
                break;
            case 2:
                heap1.addElement(3);
                heap1.addElement(5);
                heap1.addElement(4);
                heap1.addElement(8);
                heap1.addElement(7);
                heap1.addElement(9);

                heap1.removeMin();

                itr = heap1.iteratorLevelOrder();
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
                break;
            case 3:
                heap1.addElement(3);
                heap1.addElement(5);
                heap1.addElement(4);
                heap1.addElement(8);
                heap1.addElement(7);
                heap1.addElement(9);
                System.out.println(heap1.findMin());
            default:
                break;
        }
    }

    public static void main(String[] args) throws EmptyListException, EmptyCollectionException {
        test(3);
    }
}
