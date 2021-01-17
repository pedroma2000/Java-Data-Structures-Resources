package Exceptions;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class WrongKeyInputException extends Exception{
    public static String MESSAGE = "Wrong Key Input";

    public WrongKeyInputException() {
    }

    public WrongKeyInputException(String message) {
        super(message);
    }
}
