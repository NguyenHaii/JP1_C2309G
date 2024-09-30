import Controller.StaffController;
import Controller.StudentController;
import Entity.Gender;
import Entity.Staff;
import Entity.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();
        students.add(new Student("C2309G5953","Hai",
                LocalDate.of(2005,05,24),
                Gender.M,"Ha Noi"));
        students.add(new Student("C31827813781","c",
                LocalDate.of(2012,12,15),
                Gender.F,"Ha Noi2"));
        students.add(new Student("C231819","Haiso2",
                LocalDate.of(2002,6,12),
                Gender.F,"Ha Noi1"));

        StudentController sc = new StudentController(students);
        Optional<Student> minStudent = sc.minStudent();
        System.out.println("Day la hoc sinh nho nhat :");
        System.out.println(minStudent);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap :");
        StudentController.getByName((scanner.nextLine())).
                forEach(System.out::println);
    }
}