package tolentino.it2b;

import java.util.Scanner;

public class TOLENTINOIT2B {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Monthly Income: ");
        double monthlyIncome = scanner.nextDouble();

        System.out.print("Enter Credit Score: ");
        int creditScore = scanner.nextInt();

        System.out.print("Enter Existing Loans: ");
        int existingLoans = scanner.nextInt();
        scanner.nextLine(); 

        
        System.out.print("Enter Loan Status: ");
        String loanStatus = scanner.nextLine();

        Person person = new Person(id, name, monthlyIncome, creditScore, existingLoans, loanStatus);

        PersonDisplay personDisplay = new PersonDisplay();

        personDisplay.displayInfo(person);

        scanner.close();
    }
}