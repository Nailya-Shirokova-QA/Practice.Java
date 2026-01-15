import java.util.ArrayList;

public class ArrayListPrinter {
    public static void printList(ArrayList<Integer> list) {
        list.forEach(element -> System.out.println(element));
    }
}
