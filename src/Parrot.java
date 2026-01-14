import java.util.Random;

public class Parrot extends Bird {
    private String songText;
    private Random random;

    public Parrot(String songText) {
        super("Parrot");
        if (songText == null || songText.trim().isEmpty()) {
            throw new IllegalArgumentException("Song text cannot be empty");
        }
        this.songText = songText;
        this.random = new Random();
    }

    public String getSongText() {
        return songText;
    }

    public void setSongText(String songText) {
        if (songText == null || songText.trim().isEmpty()) {
            throw new IllegalArgumentException("Song text cannot be empty");
        }
        this.songText = songText;
    }

    @Override
    public void sing() {
        if (songText.length() == 1) {
            System.out.println(songText);
            return;
        }

        int n = random.nextInt(songText.length()) + 1;
        String partialText = songText.substring(0, n);
        System.out.println(partialText);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Song text: \"" + songText + "\"");
    }
}