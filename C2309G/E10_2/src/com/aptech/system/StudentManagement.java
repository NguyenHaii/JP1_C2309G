package com.aptech.system;

import com.aptech.aprotrain.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentManagement {
    private static List<Student> students = new ArrayList<>();

    public static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students do you want to add? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("Adding student " + (i + 1));
            Student student = new Student();
            student.input();
            students.add(student);
        }
    }

    public static void showStudent() {
        System.out.printf("| %-5s| %-15s | %-30s | %-6s |\n","ID","FULLNAME","EMAIL","MARK");
            students.forEach(Student::display);
    }

    public static List<Student> sortStudentsByMark() {
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getMark))
                .collect(Collectors.toList());
    }

    public static void displaySortedStudents() {
        List<Student> sortedStudents = sortStudentsByMark();
        if (sortedStudents.isEmpty()) {
            System.out.println("No students to sort!");
        } else {
            System.out.println("Sorted Students by Marks:");
            for (Student student : sortedStudents) {
                student.display();
            }
        }
    }
}
