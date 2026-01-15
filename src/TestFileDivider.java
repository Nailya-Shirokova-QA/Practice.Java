public class TestFileDivider {
    public static void main(String[] args) {

        System.out.println("Testing divideSafe method:");

        String testFile = "test.txt";

        int result = FileDivider.divideSafe(testFile);
        System.out.println("Result: " + result);

        System.out.println("\nTesting divide method with exception:");

        try {
            int result2 = FileDivider.divide(testFile);
            System.out.println("Result: " + result2);
        } catch (OperationAttemptException e) {
            System.out.println("Exception: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Cause: " + e.getCause().getClass().getName());
            }
        }
    }
}
