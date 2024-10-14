import Controller.ProductController;
import Entity.Product;
import ExceptionValidation.InvalidProducCodeException;
import Service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        ProductService productService = new ProductService();
        ProductController pc = new ProductController(productService);

        Scanner sc = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            try {
                System.out.println("Enter Product Code:");
                String pCode = sc.nextLine();
                System.out.println("Enter Product Quantity:");
                int pQuantity = Integer.parseInt(sc.nextLine());
                System.out.println("Enter Product Name:");
                String pName = sc.nextLine();

                Product product = new Product();
                product.setId((products.size()+1));
                product.setCode(pCode);
                product.setQuantity(pQuantity);
                product.setName(pName);

                products.add(product);
                products.forEach(System.out::println);

                quit = true;

            } catch (InvalidProducCodeException ipce) {
                System.out.println(ipce.getMessage());
            }

        }
    }
}
