package pro.taskana.exceptions;

/**
 * This exception is used to communicate a not authorized user.
 */
@SuppressWarnings("serial")
public class NotAuthorizedException extends TaskanaException {

    public NotAuthorizedException(String msg) {
        super(msg);
    }
}
