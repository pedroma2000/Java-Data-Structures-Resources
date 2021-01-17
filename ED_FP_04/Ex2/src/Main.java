import Queue.CircularArrayQueue;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Main {
    public static void main(String[] args) {

        int test = 3;
        CircularArrayQueue<String> lqueue = new CircularArrayQueue<>();

        switch (test) {
            case 1: //add elements
                lqueue.enqueue("Hello");
                lqueue.enqueue("World");
                lqueue.enqueue("GoodBye");
                lqueue.enqueue("Hearth");
                System.out.println(lqueue.toString());
                break;
            case 2: //test full array
                lqueue.enqueue("Hello");
                lqueue.enqueue("World");
                lqueue.enqueue("GoodBye");
                lqueue.enqueue("Hearth");
                lqueue.enqueue("Hello2");
                lqueue.enqueue("World2");
                lqueue.enqueue("GoodBye2");
                lqueue.enqueue("Hearth2");
                lqueue.enqueue("Hearth3");
                lqueue.enqueue("Hearth3");
                lqueue.enqueue("Hello7");
                System.out.println("");
                break;
            case 3: //test first empty
                //lqueue.enqueue("Hello");
                System.out.println(lqueue.first());
                break;
            case 4: //test remove elements
                lqueue.enqueue("Hello");
                lqueue.enqueue("World");
                lqueue.enqueue("GoodBye");
                lqueue.enqueue("Hearth");
                lqueue.dequeue();
                lqueue.dequeue();
                System.out.printf(lqueue.toString());
                break;
            case 5: //remove empty queue
                lqueue.dequeue();
                break;
            case 6://remove queue with 1 element
                lqueue.enqueue("Hello");
                System.out.println(lqueue.toString());
                lqueue.dequeue();
                System.out.println("empty : " + lqueue.toString());
                break;
            default:
                break;
        }

    }
}
