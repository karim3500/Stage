public class Dier {
    // Variables
    private boolean isCarnivoor;

    // Constructor
    public Dier () {

    }

    // Methods
    public void setCarnivoor(boolean carnivoor) {
        this.isCarnivoor = carnivoor;
    }

    public boolean isCarnivoor() {
        return isCarnivoor;
    }

    @Override
    public String toString() {
        return "Dit dier is een carnivoor: " + isCarnivoor;
    }

    @Override
    public int hashCode() {
        return 123;
    }
}
