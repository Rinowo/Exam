package exercise1;

public class Bank {
    double balance;
    double rate;
    double interest;


    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double calculateInterest() {
        return interest = balance * (rate / 1200);
    }
}
