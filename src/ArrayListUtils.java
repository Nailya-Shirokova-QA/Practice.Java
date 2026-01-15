import java.util.ArrayList;
import java.util.List;

public class ArrayListUtils {

    private ArrayListUtils() {
    }

    public static void reverse(List<Integer> intList) {
        if (intList == null) {
            throw new IllegalArgumentException("List cannot be null");
        }

        int n = intList.size() - 1;
        for (int i = 0; i < intList.size() / 2; i++) {
            int temp = intList.get(i);
            intList.set(i, intList.get(n - i));
            intList.set(n - i, temp);
        }
    }

    public static List<Integer> createReversedCopy(List<Integer> originalList) {
        if (originalList == null) {
            throw new IllegalArgumentException("List cannot be null");
        }

        List<Integer> reversed = new ArrayList<>(originalList);
        reverse(reversed);
        return reversed;
    }
}
