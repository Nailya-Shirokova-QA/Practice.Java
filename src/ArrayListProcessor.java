import java.util.ArrayList;

public class ArrayListProcessor {
    private ArrayList<Integer> list;

    public ArrayListProcessor() {
        this.list = new ArrayList<>();
    }

    public ArrayListProcessor(ArrayList<Integer> list) {
        this.list = list;
    }

    public void printList() {
        list.forEach(element -> System.out.println(element));
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }
}
