package MyExceptions;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class NodeNotFoundException extends Exception {
    public NodeNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
