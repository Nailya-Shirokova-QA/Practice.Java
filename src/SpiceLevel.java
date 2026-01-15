public enum SpiceLevel {
    VERY_SPICY("very spicy"),
    SPICY("spicy"),
    NOT_SPICY("not spicy");

    private final String description;

    SpiceLevel(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
