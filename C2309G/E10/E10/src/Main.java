import Controller.OrderDetailController;
import Controller.ProductController;
import Entity.*;
import ExceptionValidation.InvalidProducCodeException;
import ExceptionValidation.InvalidProducNameException;
import ExceptionValidation.InvalidProducQuantityException;
import ExceptionValidation.ProDuctNotEnoughException;
import Service.ProductService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        List<Customer> customers = new ArrayList<>();
        List<Order> orders = new ArrayList<>();
        List<OrderDetail> orderDetails = new ArrayList<>();
        ProductService productService = new ProductService(products);
        ProductController pc = new ProductController(productService);
        products.add(new Product(1,"MS123456","Surface 10",100));
        products.add(new Product(2,"MS222222","Nokia 110",200));
        products.add(new Product(3,"MS111111","Ga m10",300));
        customers.add(new Customer(1,"Hai"));
        customers.add(new Customer(2,"lon"));
        customers.add(new Customer(3,"ga"));
        customers.add(new Customer(4,"vit"));
        orders.add(new Order(1,"ORDBM11111111",customers.get(0), LocalDateTime.now()));
        orders.add(new Order(2,"ORDBM22222222",customers.get(1), LocalDateTime.now()));
        orders.add(new Order(3,"ORDBM33333333",customers.get(2), LocalDateTime.now()));
        orderDetails.add(new OrderDetail(1,"MS123456",orders.get(0),products.get(0),50, EStatus.PENDING));
        orderDetails.add(new OrderDetail(2,"MS222222",orders.get(0),products.get(1),300, EStatus.PENDING));
        orderDetails.add(new OrderDetail(3,"MS111111",orders.get(1),products.get(2),22, EStatus.PAID));
        OrderDetailController orderDetailController = new OrderDetailController(orderDetails);
        try {
            orderDetailController.checkEnoughQuantity(orders.get(0));
        } catch (ProDuctNotEnoughException e){
            System.out.println(e.getMessage());
        }
        orderDetails.forEach(System.out::println);


//        Scanner sc = new Scanner(System.in);
//        boolean quit = false;
//
//        while (!quit) {
//            try {
//                System.out.println("Enter Product Code (or type 'exit' to quit):");
//                String pCode = sc.nextLine();
//                if (pCode.equalsIgnoreCase("exit")) {
//                    quit = true;
//                    continue;
//                }
//                System.out.println("Enter Product Quantity:");
//                int pQuantity;
//                while (true) {
//                    try {
//                        pQuantity = Integer.parseInt(sc.nextLine());
//                        break;
//                    } catch (NumberFormatException e) {
//                        System.out.println("Invalid input. Please enter a valid quantity:");
//                    }
//                }
//
//                System.out.println("Enter Product Name:");
//                String pName = sc.nextLine();
//
//                Product product = new Product();
//                product.setId(products.size() + 1);
//                product.setCode(pCode);
//                product.setQuantity(pQuantity);
//                product.setName(pName);
//
//                pc.add(product);
//
//                System.out.println("Current Products:");
//                products.forEach(System.out::println);
//            } catch (InvalidProducCodeException ipce) {
//                System.out.println(ipce.getMessage());
//            } catch (InvalidProducNameException ipce) {
//                System.out.println(ipce.getMessage());
//            } catch (InvalidProducQuantityException icpe) {
//                System.out.println(icpe.getMessage());
//            }
//        }
//        sc.close();
//        System.out.println("Exiting the program.");
    }
}
