package Exceptions;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class WrongExpressionException extends Exception{
    public static String MESSAGE = "Wrong Expression format";

    public WrongExpressionException() {
    }

    public WrongExpressionException(String message) {
        super(message);
    }
}
