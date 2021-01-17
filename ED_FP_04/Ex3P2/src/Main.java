import Queue.Merger;
import Queue.SortedLinkedQueue;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Main {

    public static void tests(int test){

        SortedLinkedQueue<Integer> lqueue = new SortedLinkedQueue<>();

        switch (test) {
            case 1: //add elements
                lqueue.enqueue(3);
                lqueue.enqueue(4);
                lqueue.enqueue(1);
                lqueue.enqueue(2);
                System.out.println(lqueue.toString());
                break;
            case 2: //test empty queue
                System.out.println(lqueue.isEmpty());
                break;
            case 3: //test first
                System.out.println(lqueue.first());
                break;
            case 4: //test remove elements
                lqueue.enqueue(3);
                lqueue.enqueue(4);
                lqueue.enqueue(1);
                lqueue.enqueue(2);
                lqueue.dequeue();
                lqueue.dequeue();
                System.out.printf(lqueue.toString());
                break;
            case 5: //remove empty queue
                lqueue.dequeue();
                break;
            case 6://remove queue with 1 element
                lqueue.enqueue(1);
                System.out.println(lqueue.toString());
                lqueue.dequeue();
                System.out.println(lqueue.toString());
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        SortedLinkedQueue<String> queue1 = new SortedLinkedQueue<>();
        SortedLinkedQueue<String> queue2 = new SortedLinkedQueue<>();
        Merger m = new Merger(queue1, queue2);

        queue1.enqueue("a");
        queue1.enqueue("c");
        queue1.enqueue("e");

        queue2.enqueue("b");
        queue2.enqueue("d");
        queue2.enqueue("f");

        System.out.println(m.merger(queue1, queue2));
        //tests(1);

    }
}
