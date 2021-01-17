import Interfaces.OrderedListADT;
import arrayList.OrderedList;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {

    /**
     * Static method to test everything, by giving a test number
     *
     * @param test
     */
    public static void test(int test) {
        OrderedListADT<Integer> olist = new OrderedList();

        switch (test) {
            case 1: //Ordered Add Test
                olist.add(1);
                olist.add(4);
                olist.add(2);
                olist.add(3);
                System.out.println(olist.toString());
                break;
            case 2: //Remove First test
                olist.add(1);
                olist.add(4);
                olist.add(2);
                olist.add(3);
                System.out.println(olist.toString());
                System.out.println("Remove First:" + "\n");
                olist.removeFirst();
                System.out.println(olist.toString());
                break;
            case 3: //Remove last test with 1 object
                olist.add(1);
                System.out.println(olist.toString());
                System.out.println("Remove Last:" + "\n");
                olist.removeLast();
                System.out.println(olist.toString());
                break;
            case 4: //Remove last
                olist.add(1);
                olist.add(4);
                olist.add(2);
                olist.add(3);
                olist.add(5);
                System.out.println(olist.toString());
                System.out.println("Remove Last:" + "\n");
                olist.removeLast();
                System.out.println(olist.toString());
                break;
            case 5://Remove chosen element (first)
                olist.add(1);
                olist.add(4);
                olist.add(2);
                olist.add(3);
                olist.add(5);
                System.out.println(olist.toString());
                System.out.println("Remove Chosen(first):" + "\n");
                olist.remove(1);  //element to remove!!
                System.out.println(olist.toString());
                break;
            case 6://Remove chosen element (last)
                olist.add(1);
                olist.add(4);
                olist.add(2);
                olist.add(3);
                olist.add(5);
                System.out.println(olist.toString());
                System.out.println("Remove Chosen(last):" + "\n");
                olist.remove(5); //element to remove!!
                System.out.println(olist.toString());
                break;
            case 7://Remove chosen element (Anyone in the middle)
                olist.add(1);
                olist.add(4);
                olist.add(2);
                olist.add(3);
                olist.add(5);
                System.out.println(olist.toString());
                System.out.println("Remove Chosen(middle):" + "\n");
                olist.remove(3); //element to remove!!
                System.out.println(olist.toString());
                break;
            case 8: //Remove First test (1 object only)
                olist.add(1);
                System.out.println(olist.toString());
                System.out.println("Remove First:" + "\n");
                olist.removeFirst();
                System.out.println(olist.toString());
            default:
                break;
        }

    }

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        test(1);
    }

}
