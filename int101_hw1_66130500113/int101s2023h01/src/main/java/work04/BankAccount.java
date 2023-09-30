package work04;

public class BankAccount {
    
    //4.2
    private int number;
    private Person owner;
    private double balance;

    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount){
        balance=amount+balance;
        return balance;
    }
    public double withdraw(double amount){
        balance=balance-amount;
        return balance;
    }
     public void transfer(double amount, BankAccount account ){
        withdraw(amount);
        account.deposit(amount);
    }

    @Override
    public String toString() {
        return "BankAccount{" + "owner=" + owner + '}';
    }

     
}
