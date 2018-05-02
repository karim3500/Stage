public class Vergelijkingen {
    public static void main(String[] args) {

        // Vergelijkingen
        // == "is gelijk aan"
        System.out.println( 6 == 6 );                       // True
        System.out.println( 6 == 10 );                      // False
        // != "is ongelijk aan"
        System.out.println( 6 != 10 );                      // True
        // || "of" > EEN HOEFT MAAR TE KLOPPEN (= true)
        System.out.println( 3 == 4 || 7 == 7 );             // True
        System.out.println( 3 == 4 || 1 == 7 );             // False
        System.out.println( 3 == 4 || 1 == 7 || true );     // True
        System.out.println( 3 == 4 || 1 == 7 || false );    // False
        // && "en" > MOET ALLEMAAL KLOPPEN (= true)
        System.out.println( 3 == 4 && 7 == 7 );             // False
        System.out.println( 1 == 1 && 7 == 7 );             // True
        System.out.println( (3 == 4 && 7 == 7) || (6 == 10 || 6 == 6) );    // True
        System.out.println( (true != false && 7 == 7) && (7 + 11 > 15) );   // True
    }
}
