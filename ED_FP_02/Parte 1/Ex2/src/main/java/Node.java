
/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Node<T> {

    private T data;
    private Node<T> next;

    public Node() {
    }

    public Node(T data) {
        this.data = data;
    }

    /**
     * @return
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * @param next
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString(){
        return data.toString();
    }
}
