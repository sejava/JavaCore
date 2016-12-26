package module4;

/**
 * Created by pan on 23.12.16.
 */
public abstract class Bank {

    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployees;
    private long rating;
    private long totalCapital;

    abstract int getLimitOfWithdraw();
    abstract int getLimitOfFunding();
    abstract int getMonthlyRate();
    abstract int getCommission(int summ);

    double moneyPaidMonthlyForSalary(){
        return 0;
    }


    public Bank(long id, String bankCountry, int numberOfEmployees, double avrSalaryOfEmployees, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployees = avrSalaryOfEmployees;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvrSalaryOfEmployees() {
        return avrSalaryOfEmployees;
    }

    public void setAvrSalaryOfEmployees(double avrSalaryOfEmployees) {
        this.avrSalaryOfEmployees = avrSalaryOfEmployees;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }
}
