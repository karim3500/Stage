/*
 * Comment
 */

public class Person {

    // Variables

    private int age;
    private String name;
    private Eye eye;

    // Constructor

    public Person() { }

    // Methods

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setEye(Eye newEye) {
        this.eye = newEye;
    }

    public Eye getEye() {
        return eye;
    }

}
