public class Cow extends Mammal {
    public Cow() {
        this.amountOfLegs = 4;
    }

    public void move() {
        System.out.println("The cow walks on " + amountOfLegs + " legs");
    }

    public void eat() {
        System.out.println("The cow eats grass");
    }
}
