public class Zoo {
    public static void main(String[] args) {

        Pidgeon duif = new Pidgeon();
        duif.eat();
        duif.move();
        duif.peck();
        duif.deliverMessage();

        System.out.println();

        Ostrich struisvogel = new Ostrich();
        struisvogel.eat();
        struisvogel.move();
        struisvogel.peck();
    }
}
