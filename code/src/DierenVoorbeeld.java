public class DierenVoorbeeld {
    public static void main(String[] args) {

        Dier specifiekDier = new Dier();
        specifiekDier.setCarnivoor(true);

        System.out.println("Dier: " + specifiekDier);
        System.out.println("Carnivoor: " + specifiekDier.isCarnivoor());
    }
}
