package Exceptions;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class EmptyListException extends Exception {
    public EmptyListException() {
    }

    public EmptyListException(String message) {
        super(message);
    }
}
