package tolentino.it2b;


public class TOLENTINOIT2B {

   
    public static void main(String[] args) {
        Person person = new Person("P001", "John Doe", 5000.00, 750, 2);

        PersonDisplay personDisplay = new PersonDisplay();

        personDisplay.displayInfo(person);
    }
}