public class CheckingAccount extends BankAccount {
    private static final double FEE = 0.15; // Static constant fee

    // Constructor
    public CheckingAccount(String name, double initialAmount) {
        super(name, initialAmount); // Call superclass constructor
        // Modify accountNumber through mutator method
        setAccountNumber(getAccountNumber() + "-10");
    }

    // Override withdraw method
    @Override
    public boolean withdraw(double amount) {
        return super.withdraw(amount + FEE); // Include fee in withdrawal
    }
}
