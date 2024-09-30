public class Main {
    public static void main(String[] args) {
        InvoiceSystem heThong = new InvoiceSystem();

        // Khách hàng mẫu
        Customer khachHang1 = new Customer(1, "haideptri", 10);
        Customer khachHang2 = new Customer(2, "haisohai", 15);
        Customer khachHang3 = new Customer(3, "haisoba", 5);

        // Thêm khách hàng vào hệ thống
        heThong.themKhachHang(khachHang1);
        heThong.themKhachHang(khachHang2);
        heThong.themKhachHang(khachHang3);

        // Hóa đơn mẫu
        Invoice hoaDon1 = new Invoice(101, khachHang1, 500);
        Invoice hoaDon2 = new Invoice(102, khachHang2, 1000);
        Invoice hoaDon3 = new Invoice(103, khachHang3, 750);

        // Thêm hóa đơn vào hệ thống
        heThong.themHoaDon(hoaDon1);
        heThong.themHoaDon(hoaDon2);
        heThong.themHoaDon(hoaDon3);

        // Nhiệm vụ 1: Hiển thị thông tin hóa đơn theo ID khách hàng
        System.out.println("Hóa đơn cho khách hàng ID 1:");
        heThong.hienThiHoaDonTheoIDKhachHang(1);

        // Nhiệm vụ 2: Lấy thông tin khách hàng có hóa đơn lớn nhất
        Customer khachHangMax = heThong.getKhachHangCoHoaDonLonNhat();
        System.out.println("\nKhách hàng có hóa đơn lớn nhất: " + khachHangMax);

        // Nhiệm vụ 3: Lấy thông tin khách hàng có chiết khấu nhỏ nhất
        Customer khachHangMin = heThong.getKhachHangCoChietKhauNhoNhat();
        System.out.println("\nKhách hàng có chiết khấu nhỏ nhất: " + khachHangMin);

        // Nhiệm vụ 4: Tìm kiếm khách hàng qua ID hóa đơn hoặc tên
        System.out.println("\nTìm khách hàng theo ID hóa đơn 102:");
        heThong.timKiemKhachHangTheoHoaDonHoacTen(102, null);

        System.out.println("\nTìm khách hàng theo tên 'Tran Van C':");
        heThong.timKiemKhachHangTheoHoaDonHoacTen(0, "Tran Van C");
    }
}
