import PrintDoubleLink.UnorderedDoubleLinkedList;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {

    public static void main(String[] args) {
        UnorderedDoubleLinkedList<Integer> list = new UnorderedDoubleLinkedList<>();

        list.addToFront(1);
        list.addAfter(2,1);
        list.addAfter(3,2);
        list.addAfter(4,3);
        list.addToRear(5);

        System.out.println(list.toString());

        System.out.println("Reverse");
        System.out.println(list.toStringReverse());
    }
}
