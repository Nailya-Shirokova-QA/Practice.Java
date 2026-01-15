import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListReverserTest {
    public static void main(String[] args) {
        testListReverser();
        testStaticReverse();
    }

    private static void testListReverser() {
        ListReverser reverser = new ListReverser();
        reverser.addNumber(7);
        reverser.addNumber(14);
        reverser.addNumber(21);
        reverser.addNumber(28);

        System.out.println("Test 1 - Original:");
        reverser.printList();

        reverser.reverseList();

        System.out.println("Test 1 - Reversed:");
        reverser.printList();
    }

    private static void testStaticReverse() {
        List<Integer> testList = new ArrayList<>(Arrays.asList(100, 200, 300, 400, 500));

        System.out.println("Test 2 - Static method - Original:");
        System.out.println(testList);

        ArrayListUtils.reverse(testList);

        System.out.println("Test 2 - Static method - Reversed:");
        System.out.println(testList);

        List<Integer> original = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        List<Integer> reversedCopy = ArrayListUtils.createReversedCopy(original);

        System.out.println("Test 3 - Create reversed copy:");
        System.out.println("Original: " + original);
        System.out.println("Reversed copy: " + reversedCopy);
    }
}
