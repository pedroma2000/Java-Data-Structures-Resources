import Exceptions.EmptyCollectionException;

import java.util.Arrays;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class ArrayStack<T> implements StackADT<T> {

    /**
     * constant to represent the default capacity of the array
     */
    private final int DEFAULT_CAPACITY = 5;

    /**
     * int that represents both the number of elements and the next
     * available position in the array
     */
    private int top;

    /**
     * array of generic elements to represent the stack
     */
    private T[] stack;

    /**
     * Creates an empty stack using the default capacity.
     */
    public ArrayStack() {
        top = 0;
        stack = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    /**
     * Creates an empty stack using the specified capacity.
     *
     * @param initialCapacity represents the specified capacity
     */
    public ArrayStack(int initialCapacity) {
        top = 0;
        stack = (T[]) (new Object[initialCapacity]);
    }

    /**
     * If Array is full, this method copies the old array to a new array with more positions
     */

    /*
    private void expandCapacity(){
        stack = Arrays.copyOf(stack, stack.length + DEFAULT_CAPACITY);
    }
    */

    /**
     * manual resize
     */
    private void expandCapacity(){

        T[] tmp = (T[]) (new Object[stack.length + DEFAULT_CAPACITY]);
        for(int i = 0; i < stack.length; ++i) {
            tmp[i] = stack[i];
        }

        stack = tmp;

    }

    @Override
    public void push(T element) {

        if (size() == stack.length)
           expandCapacity();

        stack[top] = element;
        top++;
    }

    @Override
    public T pop() throws EmptyCollectionException {
        if(isEmpty()){
            throw new EmptyCollectionException(EmptyCollectionException.MESSAGE);
        }

        top--;
        T result = stack[top];
        stack[top] = null;
        return result;
    }

    @Override
    public T peek() throws EmptyCollectionException{
        if (isEmpty()) {
            throw new EmptyCollectionException(EmptyCollectionException.MESSAGE);
        }
        return stack[top-1];
    }

    @Override
    public boolean isEmpty() {
        if (size() == 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return top;
    }


    @Override
    public String toString() {
        String text = "";
        int last = size() - 1;
        while(last != -1){
            text += stack[last] + "\n";
            last--;
        }
        return text;
    }

}
