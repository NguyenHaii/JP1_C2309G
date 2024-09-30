package Entity;

public abstract  class SavingAccount extends BankAccount{
    public SavingAccount(String accountNumber,double balance){
        super(accountNumber,balance);
    }
    @Override
    public void deposit(double amount){
        setBalance(getBalance()+amount);
        System.out.println("Deposit of $"+amount+"Successful . Current balance : $"+getBalance());
    }

    @Override
    public void withdraw(double amount){
        if (getBalance() >= amount){
            setBalance(getBalance()-amount);
            System.out.println("Withdraw of $"+ amount+"Succesfull. Current balance : $"+getBalance());
        } else {
            System.out.println("Insuffcient funds . Withdrawal falled");
        }
    }

}
