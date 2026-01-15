public class Main {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        ArraySorter sorter = new ArraySorter(array);

        System.out.println("Original array:");
        sorter.printArray();

        sorter.bubbleSort();

        System.out.println("Sorted array:");
        sorter.printArray();

        int[] anotherArray = {5, 1, 4, 2, 8};
        ArraySorter anotherSorter = new ArraySorter(anotherArray);

        System.out.println("Another array:");
        anotherSorter.printArray();

        anotherSorter.bubbleSort();

        System.out.println("Sorted another array:");
        anotherSorter.printArray();
    }
}
