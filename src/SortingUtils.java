public class SortingUtils {

    private SortingUtils() {
    }

    public static void bubbleSort(int[] intArray) {
        if (intArray == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        int n = intArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        if (array == null) {
            return;
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
