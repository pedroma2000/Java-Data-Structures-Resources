package MyExceptions;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class EmptyListException extends Exception{
    public EmptyListException(String errorMessage) {
        super(errorMessage);
    }
}