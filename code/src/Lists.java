public class Lists {
    public static void main(String[] args) {
        String[] steden = {"amsterdam", "brussel", "parijs", "rotterdam", "antwerpen"};
        System.out.println(steden[0]);
        System.out.println(steden[1]);
        System.out.println(steden[2]);
        System.out.println(steden[3]);
        System.out.println(steden[4]);

        System.out.println();

        for (int i = 0; i < steden.length; i++) {
            System.out.println(steden[i]);
        }

        System.out.println();

        // for each "stad" in list "steden"
        // print de stad
        for (String stad : steden) {
            System.out.println(stad);
        }
    }
}
