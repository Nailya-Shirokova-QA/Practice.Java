public class OperationAttemptException extends Exception {

    public OperationAttemptException() {
        super();
    }

    public OperationAttemptException(String message) {
        super(message);
    }

    public OperationAttemptException(String message, Throwable cause) {
        super(message, cause);
    }

    public OperationAttemptException(Throwable cause) {
        super(cause);
    }
}

