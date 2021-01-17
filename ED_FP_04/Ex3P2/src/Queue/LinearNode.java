package Queue;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class LinearNode<T> {

    private T data;
    private LinearNode<T> next;

    /**
     * default Constructor
     */
    public LinearNode() {
    }

    /**
     * Node constructor with data and null next
     * @param data
     */
    public LinearNode(T data, LinearNode<T> next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Node constructor with data
     * @param data
     */
    public LinearNode(T data) {
        this.data = data;
    }

    /**
     * gets reference from the next node
     * @return
     */
    public LinearNode<T> getNext() {
        return next;
    }

    /**
     * set reference to next node
     * @param next
     */
    public void setNext(LinearNode<T> next) {
        this.next = next;
    }

    /**
     * gets the data
     * @return
     */
    public T getData() {
        return data;
    }

    /**
     * set for data
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Prints data
     * @return
     */
    public String toString(){
        return data.toString();
    }
}
