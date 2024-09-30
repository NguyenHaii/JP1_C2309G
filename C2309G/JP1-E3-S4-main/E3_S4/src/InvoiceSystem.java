import java.util.ArrayList;
import java.util.List;

public class InvoiceSystem {
    private List<Customer> khachHangs = new ArrayList<>();
    private List<Invoice> hoaDons = new ArrayList<>();

    // Thêm khách hàng và hóa đơn vào hệ thống
    public void themKhachHang(Customer khachHang) {
        khachHangs.add(khachHang);
    }

    public void themHoaDon(Invoice hoaDon) {
        hoaDons.add(hoaDon);
    }

    // Nhiệm vụ 1: Hiển thị thông tin hóa đơn theo ID khách hàng
    public void hienThiHoaDonTheoIDKhachHang(int khachHangID) {
        for (Invoice hoaDon : hoaDons) {
            if (hoaDon.getKhachHangID() == khachHangID) {
                System.out.println(hoaDon.toString());
            }
        }
    }

    // Nhiệm vụ 2: Lấy thông tin khách hàng có hóa đơn lớn nhất
    public Customer getKhachHangCoHoaDonLonNhat() {
        Invoice maxHoaDon = null;
        for (Invoice hoaDon : hoaDons) {
            if (maxHoaDon == null || hoaDon.getSoTien() > maxHoaDon.getSoTien()) {
                maxHoaDon = hoaDon;
            }
        }
        return maxHoaDon != null ? maxHoaDon.getKhachHang() : null;
    }

    // Nhiệm vụ 3: Lấy thông tin khách hàng có chiết khấu nhỏ nhất
    public Customer getKhachHangCoChietKhauNhoNhat() {
        Customer khachHangNhoNhat = null;
        for (Customer khachHang : khachHangs) {
            if (khachHangNhoNhat == null || khachHang.getChietKhau() < khachHangNhoNhat.getChietKhau()) {
                khachHangNhoNhat = khachHang;
            }
        }
        return khachHangNhoNhat;
    }

    // Nhiệm vụ 4: Tìm và hiển thị khách hàng qua ID hóa đơn hoặc tên khách hàng
    public void timKiemKhachHangTheoHoaDonHoacTen(int hoaDonID, String tenKhachHang) {
        // Tìm theo ID hóa đơn
        for (Invoice hoaDon : hoaDons) {
            if (hoaDon.getID() == hoaDonID) {
                System.out.println(hoaDon.getKhachHang().toString());
                return;
            }
        }

        // Tìm theo tên khách hàng
        for (Customer khachHang : khachHangs) {
            if (khachHang.getTen().equalsIgnoreCase(tenKhachHang)) {
                System.out.println(khachHang.toString());
                return;
            }
        }

        System.out.println("Không tìm thấy khách hàng phù hợp.");
    }
}
