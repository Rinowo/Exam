package exercise1;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank(1000, 10);

        System.out.println("Interest: " + bank.calculateInterest());
    }
}
