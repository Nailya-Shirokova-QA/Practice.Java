public class ArraySorter {
    private int[] intArray;

    public ArraySorter(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        this.intArray = array.clone();
    }

    public void bubbleSort() {
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

    public void printArray() {
        for (int value : intArray) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public int[] getIntArray() {
        return intArray.clone();
    }

    public void setIntArray(int[] newArray) {
        if (newArray == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        this.intArray = newArray.clone();
    }
}
