import Controller.CustomerController;
import Entity.Customer;
import Service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        CustomerService cs = new CustomerService(customers);
        CustomerController customerController = new CustomerController(customers,cs);
        customers.add(new Customer(1,"MB01","Hai"));
        customers.add(new Customer(2,"MB02","Ga"));
        customers.add(new Customer(3,"MB03","Lon"));
        Customer cus = customerController.getById(4);
        if (cus!=null){
            System.out.println(cus);
        } else {
            System.out.println("Not Found");
        }

    }
}