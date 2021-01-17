import Exceptions.EmptyCollectionException;
import Interfaces.StackADT;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class LinkedStack<T> implements StackADT<T> {

    private int size = 0;
    private LinearNode<T> top;

    public LinkedStack() {
        top = null;
    }

    @Override
    public void push(T element) {
        LinearNode<T> newnode = new LinearNode(element, null);
        if (size == 0){
            top = newnode;
        } else if (size > 0){
            newnode.setNext(top);
            top = newnode;
        }
        size++;
    }

    @Override
    public T pop() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException(EmptyCollectionException.MESSAGE);
        } else {
            LinearNode<T> currentTop = top;
            top = top.getNext();
            this.size--;
            return currentTop.getData();
        }
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException(EmptyCollectionException.MESSAGE);
        } else {
            return top.getData();
        }
    }

    @Override
    public boolean isEmpty() {
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString(){
        String text = "";
        LinearNode<T> tmp = top;
         while(tmp != null){
             text += "Hash :" +tmp.hashCode() + "-------->" + tmp.getData() + "\n";
             tmp = tmp.getNext();
         }
        return text;
    }

}
