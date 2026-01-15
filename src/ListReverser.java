import java.util.ArrayList;
import java.util.List;

public class ListReverser {
    private List<Integer> numberList;

    public ListReverser() {
        this.numberList = new ArrayList<>();
    }

    public void addNumber(int number) {
        numberList.add(number);
    }

    public void reverseList() {
        int n = numberList.size() - 1;
        for (int i = 0; i < numberList.size() / 2; i++) {
            int temp = numberList.get(i);
            numberList.set(i, numberList.get(n - i));
            numberList.set(n - i, temp);
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

    public void setNumberList(List<Integer> newList) {
        this.numberList = new ArrayList<>(newList);
    }
}
