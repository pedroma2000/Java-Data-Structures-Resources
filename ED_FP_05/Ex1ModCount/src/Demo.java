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
            //Ordered Add Test
            case 1:
                olist.add(1);
                olist.add(4);
                olist.add(2);
                olist.add(3);
                System.out.println(olist.toString());
                break;
            //Remove First test
            case 2:
                olist.add(1);
                olist.add(4);
                olist.add(2);
                olist.add(3);
                System.out.println(olist.toString());
                System.out.println("Remove First:" + "\n");
                olist.removeFirst();
                System.out.println(olist.toString());
                break;
            //Remove last test with 1 object
            case 3:
                olist.add(1);
                System.out.println(olist.toString());
                System.out.println("Remove Last:" + "\n");
                olist.removeLast();
                System.out.println(olist.toString());
                break;
            //Remove last
            case 4:
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
            //Remove chosen element (first)
            case 5:
                olist.add(1);
                olist.add(4);
                olist.add(2);
                olist.add(3);
                olist.add(5);
                System.out.println(olist.toString());
                System.out.println("Remove Chosen(first):" + "\n");
                //element to remove!!
                olist.remove(1);
                System.out.println(olist.toString());
                break;
            //Remove chosen element (last)
            case 6:
                olist.add(1);
                olist.add(4);
                olist.add(2);
                olist.add(3);
                olist.add(5);
                System.out.println(olist.toString());
                System.out.println("Remove Chosen(last):" + "\n");
                //element to remove!!
                olist.remove(5);
                System.out.println(olist.toString());
                break;
            //Remove chosen element (Anyone in the middle)
            case 7:
                olist.add(1);
                olist.add(4);
                olist.add(2);
                olist.add(3);
                olist.add(5);
                System.out.println(olist.toString());
                System.out.println("Remove Chosen(middle):" + "\n");
                //element to remove!!
                olist.remove(3);
                System.out.println(olist.toString());
                break;
            //Remove First test (1 object only)
            case 8:
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
