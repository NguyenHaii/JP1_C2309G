public class Customer {
    private int id;
    private String ten;
    private int chietKhau;

    public Customer(int id, String ten, int chietKhau) {
        this.id = id;
        this.ten = ten;
        this.chietKhau = chietKhau;
    }

    public int getID() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public int getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(int chietKhau) {
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return ten + "(" + id + ")(" + chietKhau + "%)";
    }
}
