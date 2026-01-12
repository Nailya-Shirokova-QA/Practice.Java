import java.util.ArrayList;
import java.util.List;

class City {
    private String name;
    private List<Path> paths;

    private static class Path {
        City city;
        int cost;

        Path(City city, int cost) {
            this.city = city;
            this.cost = cost;
        }
    }

    public City(String name) {
        this.name = name;
        this.paths = new ArrayList<>();
    }

    public void addPathFirst(City city, int cost) {
        paths.add(0, new Path(city, cost));
    }

    public void addPath(City city, int cost) {
        paths.add(new Path(city, cost));
    }

    public City travelBy(int n) {
        if (n == 0) return this;
        if (paths.isEmpty()) return null;

        City current = this;
        for (int i = 0; i < n; i++) {
            if (current.paths.isEmpty()) return null;
            current = current.paths.get(0).city;
        }
        return current;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        B.addPathFirst(A, 1);
        B.addPath(C, 2);
        B.addPath(D, 3);
        B.addPath(F, 7);

        A.addPathFirst(B, 5);
        A.addPath(C, 10);

        C.addPathFirst(D, 2);

        D.addPathFirst(F, 4);

        F.addPathFirst(A, 8);

        System.out.println("Testing ALL requirements:");

        City result1 = B.travelBy(1);
        System.out.println("1. B.travelBy(1) = " + result1 +
                " (should be A or C: " + (result1 == A || result1 == C) + ")");

        City result2 = B.travelBy(2);
        System.out.println("2. B.travelBy(2) = " + result2 +
                " (should be B, D or F: " + (result2 == B || result2 == D || result2 == F) + ")");

        City result3 = B.travelBy(3);
        System.out.println("3. B.travelBy(3) = " + result3 +
                " (should be A: " + (result3 == A) + ")");

        System.out.println("\n=== EXPLANATION ===");
        System.out.println("Path B -> A -> B -> A");
        System.out.println("Step 1: B -> A (first path from B)");
        System.out.println("Step 2: A -> B (first path from A)");
        System.out.println("Step 3: B -> A (first path from B)");

        boolean allValid = (result1 == A || result1 == C) &&
                (result2 == B || result2 == D || result2 == F) &&
                (result3 == A);

        System.out.println("\nALL CONDITIONS MET: " + allValid);
    }
}