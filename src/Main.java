public class Main {
    public static void main(String[] args) {
        ListReverser reverser = new ListReverser();

        reverser.addNumber(1);
        reverser.addNumber(2);
        reverser.addNumber(3);
        reverser.addNumber(4);
        reverser.addNumber(5);

        System.out.println("Original list:");
        reverser.printList();

        reverser.reverseList();

        System.out.println("Reversed list:");
        reverser.printList();

        ListReverser anotherReverser = new ListReverser();
        anotherReverser.addNumber(10);
        anotherReverser.addNumber(20);
        anotherReverser.addNumber(30);

        System.out.println("Another original list:");
        anotherReverser.printList();

        anotherReverser.reverseList();

        System.out.println("Another reversed list:");
        anotherReverser.printList();
    }
}
