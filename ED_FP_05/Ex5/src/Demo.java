import DoubleLinkedUnordered.UnorderedDoubleLinkedList;
import Interfaces.UnorderedDoublyLinkedListADT;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {
    public static void test(int test) {

        UnorderedDoublyLinkedListADT<Integer> tmp = new UnorderedDoubleLinkedList<>();

        switch (test) {
            case 1: //add to front
                tmp.addToFront(1);
                tmp.addToFront(2);
                tmp.addToFront(3);
                System.out.println(tmp.toString());
                break;
            case 2://add to rear
                tmp.addToFront(1);
                tmp.addToFront(2);
                tmp.addToRear(3);
                System.out.println(tmp.toString());
                break;
            case 3://add after
                tmp.addToFront(2);
                tmp.addAfter(3,2);
                tmp.addToRear(4);
                System.out.println(tmp.toString());
                break;
            case 4: //remve first
                tmp.addToFront(2);
                tmp.addAfter(3,2);
                tmp.addToRear(4);
                System.out.println(tmp.toString());
                tmp.removeFirst();
                System.out.println(tmp.toString());
                break;
            default:
                break;
        }

    }

    public static void main (String[]args){
        for (int i = 1; i <= 4; i++) {
            test(i);
        }
    }
}