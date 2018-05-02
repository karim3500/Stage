public class Main {
    public static void main(String[] args) {

        Eye karimEye = new Eye("rood");

        Person karim = new Person();

        System.out.println( karim.getAge() );
        System.out.println( karim.getName() );
        System.out.println( karim.getEye() );

        System.out.println();

        karim.setAge(28);
        karim.setName("Karim");
        karim.setEye(karimEye);

        System.out.println( karim.getAge() );
        System.out.println( karim.getName() );
        System.out.println( karim.getEye().getColor() );
    }
}