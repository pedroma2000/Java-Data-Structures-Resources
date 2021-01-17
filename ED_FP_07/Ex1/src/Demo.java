import PrintList.LinkedList;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.toString());
    }
}
