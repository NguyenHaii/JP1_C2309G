import Controller.StaffController;
import Entity.Gender;
import Entity.Staff;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMainStaff {
    public static void main(String[] args) {

        List<Staff> staffs = new ArrayList<>();
        staffs.add(new Staff("hai", "Ha Noi", "10004",
                "Aptech", 10000,
                LocalDate.of(2005, 05, 24), Gender.M));
        staffs.add(new Staff("vinhbeo", "Ha Noi", "11118",
                "Aptech", 2,
                LocalDate.of(2001, 05, 24), Gender.F));
        staffs.add(new Staff("hello", "Ha Noi", "1133182",
                "Aptech", 8,
                LocalDate.of(2003, 05, 24), Gender.M));
        staffs.add(new Staff("adsad", "Ha Noi", "88444",
                "Aptech", 5,
                LocalDate.of(2003, 05, 24), Gender.M));
        staffs.add(new Staff("dddddd", "Ha Noi", "912841",
                "Aptech", 5000,
                LocalDate.of(2003, 05, 24), Gender.F));

        StaffController staffController = new StaffController(staffs);
//        System.out.println("Day la nhan vien nu luong cao nhat:");
//        staffController.getMaxPayFemales()
//                .forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ID: ");
        StaffController.getById(scanner.nextLine())
                .ifPresent(System.out::println);

        System.out.print("Nhap Ten: ");
        StaffController.getByName(scanner.nextLine())
                .forEach(System.out::println);

        System.out.print("Nhap ten cua nguoi ban muon doi : ");
        String currentName = scanner.nextLine();
        System.out.print("Nhap ten moi : ");
        String newName = scanner.nextLine();

        StaffController.ChangeName(currentName, newName);
        System.out.println("Ten moi la :");
        System.out.println(newName);
    }
}