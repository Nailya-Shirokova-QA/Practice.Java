public class PairSwapperTest {
    public static void main(String[] args) {
        testEvenSize();
        testOddSizeException();
    }

    private static void testEvenSize() {
        PairSwapper swapper = new PairSwapper(4);
        System.out.println("Test 1 - Size 4:");
        swapper.printList();
        swapper.swapPairs();
        swapper.printList();
    }

    private static void testOddSizeException() {
        try {
            PairSwapper swapper = new PairSwapper(5);
        } catch (IllegalArgumentException e) {
            System.out.println("Test 2 - Exception caught: " + e.getMessage());
        }
    }
}
