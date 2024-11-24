public class SavingsAccount extends BankAccount {
    private double rate = 0.025; // Annual interest rate
    private int savingsNumber = 0; // Savings account identifier
    private String accountNumber; // Hide superclass accountNumber

    // Constructor
    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance); // Call superclass constructor
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    // Post interest method
    public void postInterest() {
        double interest = getBalance() * (rate / 12); // Monthly interest
        deposit(interest); // Add interest to account
    }

    // Override getAccountNumber
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    // Copy constructor
    public SavingsAccount(SavingsAccount original, double initialBalance) {
        super(original.getOwner(), initialBalance); // Call superclass copy constructor
        this.savingsNumber = original.savingsNumber + 1; // Increment savingsNumber
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }
}
