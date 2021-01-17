package Exceptions;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class EmptyCollectionException extends Exception {
    public EmptyCollectionException() {
    }

    public EmptyCollectionException(String message) {
        super(message);
    }
}
