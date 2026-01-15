public class Sauce {
    private String name;
    private SpiceLevel spiceLevel;

    public Sauce(String name, SpiceLevel spiceLevel) {
        this.name = name;
        this.spiceLevel = spiceLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpiceLevel getSpiceLevel() {
        return spiceLevel;
    }

    public void setSpiceLevel(SpiceLevel spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    @Override
    public String toString() {
        return "Sauce " + name + ": " + spiceLevel.getDescription();
    }
}
