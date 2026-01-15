public class Main {
    public static void main(String[] args) {
        PairSwapper swapper = new PairSwapper(8);

        System.out.println("Original list:");
        swapper.printList();

        swapper.swapPairs();

        System.out.println("List after pair swapping:");
        swapper.printList();

        PairSwapper swapper2 = new PairSwapper(6);
        System.out.println("Original list:");
        swapper2.printList();

        swapper2.swapPairs();

        System.out.println("List after pair swapping:");
        swapper2.printList();
    }
}
