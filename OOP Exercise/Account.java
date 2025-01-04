public class Account {
    private int accountBalance;
    public Account(int accountBalance){
        if(accountBalance < 0){
            this.accountBalance = 0;
            System.out.println("The initial balance was invalid");
        }
        else{
            this.accountBalance = accountBalance;
        }
    }
    public void credit(int Add){
        this.accountBalance = this.accountBalance + Add;
    }
    public void debit(int draw){
        if(draw > this.accountBalance){
            System.out.println("Debit amount exceeded account balance");
        }
        else{
            this.accountBalance = this.accountBalance - draw;
        }
    }
    public int getBalance(){
        return this.accountBalance;
    }
    public static void main(String[] args) {
        Account account1 = new Account(90_000);
        account1.credit(10_000);
        account1.debit(50_000);
        System.out.printf("Account1 balance:%,d\n\n",account1.getBalance());
        
        Account account2 = new Account(-8000);
        account2.credit(5_000);
        account2.debit(9_000);
        System.out.printf("Account2 balance:%,d\n\n",account2.getBalance());

    }
}