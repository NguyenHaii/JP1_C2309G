package com.aptech.aprotrain;

import java.util.Scanner;

public class Student implements IStudent {
    private int id;
    private String fullname;
    private String email;
    private float mark;

    public Student() {}

    public Student(int id, String fullname, String email, float mark) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.mark = mark;
    }

    public static void add(Student student) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter student ID: ");
            this.id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter full name: ");
            this.fullname = scanner.nextLine();

            System.out.print("Enter email: ");
            this.email = scanner.nextLine();

            System.out.print("Enter mark: ");
            this.mark = scanner.nextFloat();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values for ID and mark.");
        }
    }

    @Override
    public void display() {
        System.out.println("+------------------------------------------------------------------+");
        System.out.printf("| %-5d| %-15s | %-30s | %-5.4f |\n",id,fullname,email,mark);

    }
}
