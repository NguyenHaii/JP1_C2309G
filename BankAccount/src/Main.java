import Entity.CurrentAccount;
import Entity.SavingAccount;

public class Main {
    public static void main(String[] args) {
        double ibal,damt,wamt;
        ibal=1000.00;
        SavingAccount savingAccount = new SavingAccount("SA001",ibal) {
            @Override
            public void deposit(double amount) {
                super.deposit(amount);
            }

            @Override
            public void withdraw(double amount) {
                super.withdraw(amount);
            }
        };
        System.out.println("Saving A/c : Intial Balance : $"+ibal);
        damt =500.00;
        savingAccount.deposit(damt);
        wamt=250.00;
        savingAccount.withdraw(wamt);
        wamt=1600.00;
        System.out.println("\nTry to withdraw : $ "+ wamt);
        savingAccount.withdraw(wamt);
        System.out.println();
        ibal=5000.00;
        CurrentAccount currentAccount= new CurrentAccount("CA001",ibal);
        System.out.println("Current A/c : Intial Balance : $"+wamt);
        savingAccount.withdraw((wamt));



        }
    }
