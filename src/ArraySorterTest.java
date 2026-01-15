public class ArraySorterTest {
    public static void main(String[] args) {
        testBubbleSort();
        testStaticBubbleSort();
    }

    private static void testBubbleSort() {
        int[] testArray = {3, 1, 4, 1, 5, 9, 2, 6};
        ArraySorter sorter = new ArraySorter(testArray);

        System.out.println("Test 1 - Original:");
        sorter.printArray();

        sorter.bubbleSort();

        System.out.println("Test 1 - Sorted:");
        sorter.printArray();
    }

    private static void testStaticBubbleSort() {
        int[] testArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Test 2 - Static method - Original:");
        SortingUtils.printArray(testArray);

        SortingUtils.bubbleSort(testArray);

        System.out.println("Test 2 - Static method - Sorted:");
        SortingUtils.printArray(testArray);
    }
}
