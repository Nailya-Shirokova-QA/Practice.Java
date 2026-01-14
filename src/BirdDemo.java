public class BirdDemo {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Sparrow();
        birds[1] = new Cuckoo();
        birds[2] = new Parrot("Hello, how are you?");
        birds[3] = new Parrot("Polly wants a cracker!");

        for (Bird bird : birds) {
            System.out.println("\n--- " + bird.getName() + " ---");
            bird.displayInfo();
            System.out.print("Singing: ");
            bird.sing();
        }

        System.out.println("\n\nAdditional parrot examples:");

        try {
            Parrot parrot1 = new Parrot("Java is fun!");
            System.out.println("\nParrot 1:");
            parrot1.displayInfo();
            System.out.print("Singing: ");
            parrot1.sing();

            Parrot parrot2 = new Parrot("Hi");
            System.out.println("\nParrot 2:");
            parrot2.displayInfo();
            System.out.print("Singing: ");
            parrot2.sing();

            parrot2.setSongText("Hello World!");
            System.out.print("New song: ");
            parrot2.sing();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}