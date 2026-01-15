public class TestOperationException {
    public static void main(String[] args) {
        TestOperationException tester = new TestOperationException();
        tester.testException();
    }

    public void testException() {
        try {
            performOperation();
        } catch (OperationAttemptException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public void performOperation() throws OperationAttemptException {
        throw new OperationAttemptException("Test operation failed");
    }
}

