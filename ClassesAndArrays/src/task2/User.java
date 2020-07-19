package task2;

public class User {

    String firstName;
    String lastName;
    int age;
    boolean isMarried;

    public User(String firstName, String lastName, int age, boolean isMarried) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMarried = isMarried;
    }

    public void isAdult() {
        if (age >= 18) {
            System.out.println("User " + firstName + " is adult.");
        }
        else {
            System.out.println("User " + firstName + " isn't adult.");
        }
    }

    public String fullInfo() {
        return firstName + " " + lastName + " " + age + " isMarried " + isMarried;
    }

}
