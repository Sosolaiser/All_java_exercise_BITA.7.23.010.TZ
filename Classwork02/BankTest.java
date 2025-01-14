
public class Account {
    protected double balance;


    public Account(double initialBalance) {
        if (initialBalance >= 0.0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
            System.out.println("Error: Initial balance invalid, set to 0.0.");
        }
    }

    public void credit(double amount) {
        balance += amount;
    }

    public boolean debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }


    public double calculateInterest() {
        return balance * interestRate;
    }
}

class CheckingAccount extends Account {
    private double transactionFee;

    public CheckingAccount(double initialBalance, double transactionFee) {
        super(initialBalance);
        this.transactionFee = transactionFee;
    }


    @Override
    public void credit(double amount) {
        super.credit(amount);
        balance -= transactionFee; 
    }

    @Override
    public boolean debit(double amount) {
        if (super.debit(amount)) { 
            balance -= transactionFee; 
            return true;
        }
        return false;
    }
}


public class BankTest {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(1000.0, 0.05);
        System.out.println("Savings Account Balance: $" + savings.getBalance());
        double interest = savings.calculateInterest();
        System.out.println("Interest earned: $" + interest);
        savings.credit(interest);
        System.out.println("Balance after adding interest: $" + savings.getBalance());

        CheckingAccount checking = new CheckingAccount(500.0, 2.0);
        System.out.println("\nChecking Account Balance: $" + checking.getBalance());
        checking.credit(100.0);
        System.out.println("Balance after credit of $100: $" + checking.getBalance());
        checking.debit(50.0);
        System.out.println("Balance after debit of $50: $" + checking.getBalance());
        checking.debit(600.0); 
    }
}
