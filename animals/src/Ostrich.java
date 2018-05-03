public class Ostrich extends Bird {

    public void eat() {
        System.out.println("An Ostrich uses its beak to eat");
    }

    @Override
    public void move() {
        System.out.println("An Ostrich can only walk...");
    }
}
