//package E2;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//
//public class TestMain {
//
//    public static void main(String[] args) {
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee(1, "Hai", "Nguyen", 10000));
//        employees.add(new Employee(2, "Vinh", "Le", 2000));
//        employees.add(new Employee(3, "Phi", "Hieu", 1000));
//
//        // Hiển thị thông tin của từng nhân viên
//        employees.forEach(System.out::println);
//
//        // Tìm nhân viên có lương hàng năm cao nhất
//        Employee highestPaid = employees.stream()
//                .max(Comparator.comparing(Employee::getAnnualSalary))
//                .orElse(null);
//
//        System.out.println("Nhân viên có lương hàng năm cao nhất: " + highestPaid);
//    }
//}
