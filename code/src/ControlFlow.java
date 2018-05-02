public class ControlFlow {
    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            System.out.println("A " + i);
            i++;
        }

        do {
            System.out.println("A " + i);
            i++;
        } while (i < 20);

        System.out.println("The end...");

        long j = 1;

        while (j % 7 != 0) {
            System.out.println(j);
            j = Math.round(Math.random() * 100);
        }

        System.out.println("Gestopt bij: " + j);

        // i++ = verhoog i met 1 en retourneer de waarde van i VOOR het verhogen
        // ++i = verhoog i met 1 en retourneer de waarde van i NA het verhogen
        int k = 0;      // k = 0 , l = X , m = X
        System.out.println("k: " + k);
        System.out.println("-");
        int l = k++;    // k = 1 , l = 0 , m = X
        System.out.println("k: " + k);
        System.out.println("l: " + l);
        System.out.println("-");
        int m = ++k;    // k = 2 , l = 0 , m = 2
        System.out.println("k: " + k);
        System.out.println("l: " + l);
        System.out.println("m: " + m);
        System.out.println("-");

        // for (variabele declaratie ; lus conditie ; doe dit aan het einde van elke lus)
        for (int n = 0; n < 10; n++) {
            System.out.println(n);
        }
    }
}