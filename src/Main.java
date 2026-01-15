public class Main {
    public static void main(String[] args) {
        Sauce sauce1 = new Sauce("Tabasco", SpiceLevel.VERY_SPICY);
        Sauce sauce2 = new Sauce("Ketchup", SpiceLevel.NOT_SPICY);
        Sauce sauce3 = new Sauce("Cheese", SpiceLevel.SPICY);

        System.out.println(sauce1);
        System.out.println(sauce2);
        System.out.println(sauce3);

        System.out.println("\nGetters demonstration:");
        System.out.println("Sauce 1 name: " + sauce1.getName());
        System.out.println("Sauce 1 spice level: " + sauce1.getSpiceLevel());
        System.out.println("Spice description: " + sauce1.getSpiceLevel().getDescription());

        System.out.println("\nSetters demonstration:");
        sauce2.setSpiceLevel(SpiceLevel.SPICY);
        System.out.println("After modification: " + sauce2);

        System.out.println("\nAll spice levels:");
        for (SpiceLevel level : SpiceLevel.values()) {
            System.out.println("- " + level + " (" + level.getDescription() + ")");
        }
    }
}
