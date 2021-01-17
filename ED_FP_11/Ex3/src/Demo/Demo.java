package Demo;

import BinaryTree.BinaryTreeExceptions;
import BinaryTree.MinLinkedHeap;
import Lists.OrderedList;

import java.util.Iterator;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Demo {

    public static void tests(int test) throws BinaryTreeExceptions {
        MinLinkedHeap<Integer> tree = new MinLinkedHeap();
        OrderedList<Integer> olist = new OrderedList();
        Iterator<Integer> itr;

        switch (test) {
            // Teste para o add
            case 1:
                tree.addElement(3);
                tree.addElement(2);
                tree.addElement(1);
                tree.addElement(4);
                tree.addElement(5);
                tree.addElement(6);
                itr = tree.iteratorLevelOrder();
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
                System.out.println("");
                break;
            case 2:
                tree.addElement(6);
                tree.addElement(4);
                tree.addElement(5);
                tree.addElement(3);
                tree.addElement(2);
                tree.addElement(1);
                System.out.println("Excpeted 1. Result : " + tree.removeMin());
                itr = tree.iteratorLevelOrder();
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
                break;
            case 3:
                tree.addElement(6);
                tree.addElement(4);
                tree.addElement(4);
                tree.addElement(3);
                tree.addElement(2);
                tree.addElement(1);
                tree.addElement(4);
                tree.addElement(4);
                tree.addElement(4);
                tree.addElement(5);
                tree.addElement(4);
                tree.addElement(4);
                System.out.println("Excpeted 6. Result : " + tree.removeMin());
                Iterator<Integer> it = tree.iteratorLevelOrder();
                while (it.hasNext()) {
                    System.out.println(it.next());
                }
                System.out.println("Excepted : 5. Result : " + tree.findMin());

            case 4:
                olist.add(10);
                olist.add(5);
                olist.add(23);
                olist.add(56);

                Iterator<Integer> iter = olist.iterator();

                while (iter.hasNext()) {
                    System.out.println(iter.next());
                }

                break;
            default:
                break;
        }

    }

    public static void main(String[] args) throws BinaryTreeExceptions {
        Demo.tests(4);
    }
}
