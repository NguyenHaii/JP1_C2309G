public class Invoice {
    private int id;
    private Customer khachHang;
    private double soTien;

    public Invoice(int id, Customer khachHang, double soTien) {
        this.id = id;
        this.khachHang = khachHang;
        this.soTien = soTien;
    }

    public int getID() {
        return id;
    }

    public Customer getKhachHang() {
        return khachHang;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public int getKhachHangID() {
        return khachHang.getID();
    }

    public String getTenKhachHang() {
        return khachHang.getTen();
    }

    public int getChietKhauKhachHang() {
        return khachHang.getChietKhau();
    }

    public double getSoTienSauChietKhau() {
        return soTien - (soTien * khachHang.getChietKhau() / 100);
    }

    @Override
    public String toString() {
        return "HoaDon[id=" + id + ", khachHang=" + khachHang.toString() + ", soTien=" + soTien + "]";
    }
}
