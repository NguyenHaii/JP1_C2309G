package Controller;

import Entity.Staff;

import java.util.List;
import java.util.Optional;

public class StaffController {
    private static List<Staff> staffs;

    public StaffController(List<Staff> staffs) {
        StaffController.staffs = staffs;
    }

//Cau1:
//    public List<Staff> getMaxPayFemales() {
//        Optional<Staff> maxPay = staffs.stream()
//                .filter(staff -> staff.getGender() == Gender.F)
//                .max(Comparator.comparing(Staff::getPay));
//        return staffs.stream()
//                .filter(staff -> staff.getGender() == Gender.F && staff.getPay() == maxPay)
//                .toList();
//    } Em chua lam duoc phan nay , java bao la toan tu == khong ap dung len double duoc a


    //Cau2:
    public static Optional<Staff> getById(String keyword) {
        return staffs.stream()
                .filter(staff -> staff.getId().contains(keyword))
                .findFirst();
    }
    public static List<Staff> getByName(String keyword) {
        return staffs.stream()
                .filter(staff -> staff.getName().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }

    //    Cau3:
    public static boolean ChangeName(String currentName, String newName) {
        Optional<Staff> staffMembers = getByName(currentName).stream().findFirst();
        staffMembers.ifPresent(staffMember -> staffMember.changeName(newName));
        return staffMembers.isPresent();
    }


}

