public class BirdMarket {

    public static void makeBirdsSing(Bird[] birds) {
        if (birds == null) {
            System.out.println("No birds to sing");
            return;
        }

        System.out.println("Bird Market Performance:");
        System.out.println("========================");

        for (int i = 0; i < birds.length; i++) {
            if (birds[i] != null) {
                System.out.print("Bird " + (i + 1) + " (" + birds[i].getName() + "): ");
                birds[i].sing();
            }
        }
        System.out.println("========================");
    }

    public static void main(String[] args) {
        Bird[] birdCollection = new Bird[8];

        birdCollection[0] = new Sparrow();
        birdCollection[1] = new Sparrow();
        birdCollection[2] = new Cuckoo();
        birdCollection[3] = new Cuckoo();
        birdCollection[4] = new Parrot("Hello World!");
        birdCollection[5] = new Parrot("Polly wants a cracker");
        birdCollection[6] = new Parrot("Good morning!");
        birdCollection[7] = new Parrot("Java programming");

        makeBirdsSing(birdCollection);

        System.out.println("\n\nAnother performance with different birds:");
        Bird[] moreBirds = {
                new Sparrow(),
                new Cuckoo(),
                new Parrot("Short song"),
                new Sparrow(),
                new Parrot("Another parrot song that is longer")
        };

        makeBirdsSing(moreBirds);
    }
}
