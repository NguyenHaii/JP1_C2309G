import entity.Customer;
import entity.Account;
import entity.Invoice;
import entity.Gender;
import service.BusinessOperationsImpl;
import service.DiscountOperations;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "ga", Gender.F, 10);
        Customer customer2 = new Customer(2, "lon", Gender.M, 5);
        Customer customer3 = new Customer(3, "vit", Gender.F, 20);
        Account account1 = new Account(1, customer1, 1000.0);
        Invoice invoice1 = new Invoice(1, customer1, 500.0);
        Invoice invoice2 = new Invoice(2, customer1, 500.0);

        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer3);

        List<Account> accounts = new ArrayList<>();
        accounts.add(account1);

        List<Invoice> invoices = new ArrayList<>();
        invoices.add(invoice2);


        BusinessOperationsImpl<Customer> customerOps = new BusinessOperationsImpl<>();
        customerOps.sort(customers);

        DiscountOperations discountOps = new DiscountOperations();
        discountOps.applyDiscountForFemaleCustomers(invoices);
    }
}
