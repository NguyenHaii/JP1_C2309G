import java.util.Scanner;

public class E22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principalAmount, interestRate = 0, interest, totalAmount;
        int term;

        // Nhập số tiền gửi và kỳ hạn
        System.out.print("Nhập số tiền gửi (VND): ");
        principalAmount = scanner.nextDouble();
        System.out.print("Nhập kỳ hạn gửi (6, 9, 12, 24, 36 tháng): ");
        term = scanner.nextInt();

        // Sử dụng cấu trúc switch...case để chọn lãi suất dựa trên kỳ hạn
        switch (term) {
            case 6:
                interestRate = 5.1;
                break;
            case 9:
                interestRate = 5.5;
                break;
            case 12:
                interestRate = 6.4;
                break;
            case 24:
                interestRate = 6.5;
                break;
            case 36:
                interestRate = 6.5;
                break;
            default:
                System.out.println("Kỳ hạn không hợp lệ.");
                System.exit(0);
        }

        // Tính lãi và tổng tiền
        interest = principalAmount * (interestRate / 100);
        totalAmount = principalAmount + interest;

        // Hiển thị kết quả theo dạng bảng
        System.out.printf("+----------------+-----------+---------------+---------------+\n");
        System.out.printf("| %-14s | %-9s | %-13s | %-13s |\n", "Số tiền gửi", "Kỳ hạn", "Tiền lãi", "Lãi + Gốc");
        System.out.printf("+----------------+-----------+---------------+---------------+\n");
        System.out.printf("| %-14.0f | %-9d | %-13.0f | %-13.0f |\n", principalAmount, term, interest, totalAmount);
        System.out.printf("+----------------+-----------+---------------+---------------+\n");

    }
}
