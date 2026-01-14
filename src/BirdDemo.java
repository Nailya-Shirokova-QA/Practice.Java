public class BirdDemo {

    public static void performBirdConcert(Bird[] birds) {
        System.out.println("\n\nBird Concert:");
        System.out.println("==============");
        for (Bird bird : birds) {
            if (bird != null) {
                System.out.print(bird.getName() + " sings: ");
                bird.sing();
            }
        }
        System.out.println("==============\n");
    }

    public static void main(String[] args) {
        Bird[] birds = new Bird[6];
        birds[0] = new Sparrow();
        birds[1] = new Cuckoo();
        birds[2] = new Parrot("Hello, how are you?");
        birds[3] = new Parrot("Polly wants a cracker!");
        birds[4] = new Sparrow();
        birds[5] = new Cuckoo();

        System.out.println("Individual bird demonstrations:");
        for (Bird bird : birds) {
            System.out.println("\n--- " + bird.getName() + " ---");
            bird.displayInfo();
            System.out.print("Singing: ");
            bird.sing();
        }

        performBirdConcert(birds);
    }
}