package List;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class LinearNode<T> {

    private T data;
    private LinearNode<T> next;

    /**
     *
     */
    public LinearNode() {
    }

    /**
     *
     * @param data
     */
    public LinearNode(T data) {
        this.data = data;
    }

    /**
     * @return
     */
    public LinearNode<T> getNext() {
        return next;
    }

    /**
     * @param next
     */
    public void setNext(LinearNode<T> next) {
        this.next = next;
    }


    /**
     *
     * @return
     */
    public T getData() {
        return data;
    }

    /**
     *
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return data.toString();
    }
}
