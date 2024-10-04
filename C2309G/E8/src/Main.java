import Controller.CustomerController;
import Entity.Account;
import Entity.Customer;
import Entity.Gender;
import Service.AccountService;
import Service.CustomerService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        List<Account> accounts = new ArrayList<>();

        CustomerService cs = new CustomerService(customers);
        CustomerController customerController = new CustomerController(cs);

        customers.add(new Customer(1, "MB01", "Hai", Gender.M));
        customers.add(new Customer(2, "MB02", "Ga", Gender.M));
        customers.add(new Customer(3, "MB03", "Lon", Gender.F));

        accounts.add(new Account(1, "ACC001", 5000000, LocalDateTime.now(), customers.get(0)));
        accounts.add(new Account(2, "ACC002", 1500000, LocalDateTime.now(), customers.get(1)));
        accounts.add(new Account(3, "ACC003", 200000, LocalDateTime.now(), customers.get(2)));

        Customer cus = customerController.getById(4);
        if (cus != null) {
            System.out.println(cus);
        } else {
            System.out.println("Not Found");
        }

        AccountService accountService = new AccountService(accounts);
        List<Account> maleAccounts = accountService.getAccByCus();
        System.out.println("Tai khoan cua khach nu co so du hon > 1,000,000: " + maleAccounts);

        long femaleCount = accountService.countAccByCus();
        System.out.println("So luong khach hang nu co so du > 100,000: " + femaleCount);

        Account maxBalanceAccount = accountService.getMaxBalance();
        System.out.println("Tai khoan co so du toi da (Nu): " + maxBalanceAccount);
    }
}
