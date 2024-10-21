package com.aptech.system;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Add New");
            System.out.println("2. Show All");
            System.out.println("3. Sort");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");

            try {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        StudentManagement.addStudent();
                        break;
                    case 2:
                        System.out.println("+------------------------------------------------------------------+");
                        StudentManagement.showStudent();
                        System.out.println("+------------------------------------------------------------------+");
                    break;

                    case 3:
                        System.out.println("+------------------------------------------------------------------+");
                        StudentManagement.displaySortedStudents();
                        System.out.println("+------------------------------------------------------------------+");
                        break;
                    case 4:
                        System.out.println("Exiting the program...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please select again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
        } while (choice != 4);

        scanner.close();
    }
}
