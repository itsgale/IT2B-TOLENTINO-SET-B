
package tolentino.it2b;



public class PersonDisplay {
    
    public void displayInfo(Person person) {
        System.out.println("ID: " + person.getId());
        System.out.println("Name: " + person.getName());
        System.out.println("Monthly Income: $" + person.getMonthlyIncome());
        System.out.println("Credit Score: " + person.getCreditScore());
        System.out.println("Existing Loans: " + person.getExistingLoans());
    }
}
