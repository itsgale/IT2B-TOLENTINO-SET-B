package tolentino.it2b;

public class Person {
     public String id;
    public String name;
    public double monthlyIncome;
    public int creditScore;
    public int existingLoans;

    public Person(String id, String name, double monthlyIncome, int creditScore, int existingLoans) {
        this.id = id;
        this.name = name;
        this.monthlyIncome = monthlyIncome;
        this.creditScore = creditScore;
        this.existingLoans = existingLoans;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public int getExistingLoans() {
        return existingLoans;
    }

    public void setExistingLoans(int existingLoans) {
        this.existingLoans = existingLoans;
    }
}