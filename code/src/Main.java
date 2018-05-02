public class Main {
    public static void main(String[] args) {

        System.out.println("Hallo!");
        System.out.println( 1 + 1 + 2 );
        System.out.println();

        Person karim = new Person();
        Person nick = new Person();

        Person.setHair("bruin");
        karim.setHair("bruin");
        nick.setHair("bruin");

        karim.setAge(28);
        karim.setName("Karim");
        Eye karimEye = new Eye("rood");
        karim.setEye(karimEye);

        nick.setAge(1);
        nick.setName("Nick");
        nick.setEye( new Eye("geel") );

//        System.out.println( karim.getAge() );
        System.out.println( karim.getName() );
        System.out.println( "Adult: " + karim.isAdult() );
        System.out.println( karim.getEye().getColor() );
        System.out.println( karim.getHair() );

        System.out.println();

//        System.out.println( nick.getAge() );
        System.out.println( nick.getName() );
        System.out.println( "Adult: " + nick.isAdult() );
        System.out.println( nick.getEye().getColor() );
        System.out.println( nick.getHair() );

//        System.out.println( totalAgeLong(nick, karim) );
//        System.out.println( totalAgeShort(nick, karim) );

    }

//    public static int totalAgeLong(Person person1, Person person2) {
//        int age1 = person1.getAge();
//        int age2 = person2.getAge();
//        int total = age1 + age2;
//        return total;
//    }
//
//    public static int totalAgeShort(Person person1, Person person2) {
//        return person1.getAge() + person2.getAge();
//    }
}