import Entity.Customer;
import Entity.Gender;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Scanner scanner = new Scanner(System.in);
//        Customer customer=new Customer();
//        Customer customer1= new Customer(1,"AnhVinhancut");
//        customer1.setName("Bill Gate");
//        System.out.println("Id:"+customer1.getId()+"\nName:"+customer1.getName());
//        System.out.println(customer1);
//        System.out.println("Enter ID:");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("Enter Name");
//        String name = scanner.nextLine();
//
//        customer.setId(id);
//        customer.setName(name);
//
//        System.out.println(customer);
//
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer(1,"Mark ", Gender.M,
                "mrbean@gmail.com","US","+123456789");
        Customer customer1 = new Customer(2,"Bean ", Gender.M,
                "mrbean@gmail.com","US","+123456789");
        Customer customer2 = new Customer(3,"Alan ", Gender.M,
                "mrbean@gmail.com","US","+123456789");

        customers.add(customer);
        customers.add(customer1);
        customers.add(customer2);
        // Iterator Sequency
//        for (Customer c: customers){
//            System.out.println(c);
//        }
        //Stream API Collection
        customers.stream()
                .sorted(Comparator.comparing(Customer::getName).reversed())
                .forEach(System.out::println);


    }
}