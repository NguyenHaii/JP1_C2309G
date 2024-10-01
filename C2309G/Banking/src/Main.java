import Controller.AccountController;
import Entity.Account;
import Entity.Customer;
import Entity.Gender;
import Service.ValidationService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,"ga"));
        customers.add(new Customer(2,"lon"));
        customers.add(new Customer(3,"vit"));

        Account acc = new Account("001",customers.get(0),10000);
        AccountController accountController = new AccountController(acc);

        Scanner scanner = new Scanner(System.in);

        double amount = ValidationService.getValid(scanner);

        if (ValidationService.isValid(amount, acc.getBalance())) {
                accountController.withdraw(amount);
                System.out.println("So du con lai la :" + acc.getBalance());
            } else {
                System.out.println("Khong du tien de rut");
            }
            accountController.deposit(amount);
            System.out.println("So du sau khi nap : " + acc.getBalance());

    }

}