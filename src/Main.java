public class Main {
    public static void main(String[] args) {
        System.out.println(applyOperation(1, 2, 1));
        System.out.println(applyOperation(5, 3, 2));
        System.out.println(applyOperation(4, 3, 3));
        System.out.println(applyOperation(10, 2, 4));

        System.out.println("\nUsing enum directly:");
        System.out.println(Operation.ADD.apply(1, 2));
        System.out.println(Operation.SUBTRACT.apply(5, 3));
        System.out.println(Operation.MULTIPLY.apply(4, 3));
        System.out.println(Operation.DIVIDE.apply(10, 2));

        System.out.println("\nIterating through all operations:");
        for (Operation op : Operation.values()) {
            System.out.println(op + " 5 and 3: " + op.apply(5, 3));
        }
    }

    private static int applyOperation(int x, int y, int opCode) {
        return Operation.fromInt(opCode).apply(x, y);
    }
}
