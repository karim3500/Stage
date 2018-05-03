public class Human extends Mammal {

    public Human() {
        this.amountOfLegs = 2;
    }

    public void move() {
        System.out.println("The human walks on " + amountOfLegs + " legs");
    }

    public void eat() {
        System.out.println("The human eats soup");
    }
}
