public class DierenVoorbeeld {
    public static void main(String[] args) {

        Dier specifiekDier = new Dier();
        specifiekDier.setCarnivoor(true);

        System.out.println("Dier: " + specifiekDier);
        System.out.println("Carnivoor: " + specifiekDier.isCarnivoor());

        System.out.println();

        Dier nieuwDier = new Dier();
        System.out.println(nieuwDier);
        System.out.println(nieuwDier.toString());

        System.out.println(nieuwDier.hashCode());

        Object voorbeeld = new Object();
    }
}
