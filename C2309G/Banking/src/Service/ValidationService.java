package Service;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidationService {

        public static double getValid(Scanner scanner) {
                double amount = 0;
                boolean validInput = false;

                while (!validInput) {
                        System.out.print("Nhap so tien: ");
                        String input = scanner.nextLine();

                        if (Pattern.matches("\\d+(\\.\\d+)?", input)) {
                                amount = Double.parseDouble(input);
                                validInput = true;
                        } else {
                                System.out.println("Nhap so thoi ban ei");
                        }
                }
                

                return amount;
        }
        public static boolean isValid(double amount, double balance) {
                return amount <= balance;
        }
}