import java.util.ArrayList;
import java.util.List;

public class PairSwapper {
    private List<Integer> numberList;
    private int size;

    public PairSwapper(int n) {
        if (n % 2 != 0) {
            throw new IllegalArgumentException("N must be even");
        }
        this.size = n;
        this.numberList = new ArrayList<>();
        initializeList();
    }

    private void initializeList() {
        for (int i = 1; i <= size; i++) {
            numberList.add(i);
        }
    }

    public void swapPairs() {
        for (int i = 0; i < size; i += 2) {
            if (i + 1 < size) {
                int temp = numberList.get(i);
                numberList.set(i, numberList.get(i + 1));
                numberList.set(i + 1, temp);
            }
        }
    }

    public void printList() {
        for (int num : numberList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public List<Integer> getNumberList() {
        return new ArrayList<>(numberList);
    }

    public int getSize() {
        return size;
    }
}

