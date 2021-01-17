package Queue;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Merger<T extends Comparable> {

    private SortedLinkedQueue<T> a = new SortedLinkedQueue<>();
    private SortedLinkedQueue<T> b = new SortedLinkedQueue<>();
    private SortedLinkedQueue<T> c = new SortedLinkedQueue<>();

    public Merger(SortedLinkedQueue<T> a, SortedLinkedQueue<T> b) {
        this.a = a;
        this.b = b;
    }

    public SortedLinkedQueue merger(SortedLinkedQueue a, SortedLinkedQueue b){

        while(!a.isEmpty() || !b.isEmpty()){
            if (!a.isEmpty())
                this.c.enqueue((T) a.dequeue());
            if (!b.isEmpty())
                this.c.enqueue((T) b.dequeue());
        }

        return this.c;
    }

}
