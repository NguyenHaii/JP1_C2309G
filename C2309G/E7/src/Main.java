import Controller.ManagerController;
import Controller.TechnicianController;
import Entity.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Staff> staffList = new ArrayList<>();


        staffList.add(new ManagerController("Ga", 1, 1111));
        staffList.add(new TechnicianController("Lon", 2, 2222));
        staffList.add(new ManagerController("Vit", 3, 3333));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua staff ban muon hien thi : ");
        String staffName = scanner.nextLine();

        Stream<Staff> staffStream = staffList.stream();
        staffStream.filter(staff -> staff.getName().equalsIgnoreCase(staffName))
                .forEach(staff -> System.out.println(staff.toString()));

        scanner.close();
    }
}
