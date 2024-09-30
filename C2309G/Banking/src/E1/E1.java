package E1;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        final int MENH_GIA_500K = 500000;
        final int MENH_GIA_200K = 200000;
        final int MENH_GIA_100K = 100000;
        final int MENH_GIA_50K = 50000;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền cần rút (bội của 50.000 VND): ");
        int soTienCanRut = scanner.nextInt();

        // Kiểm tra số tiền cần rút có phải là bội của 50.000 không
        if (soTienCanRut % MENH_GIA_50K != 0) {
            System.out.println("Số tiền cần rút phải là bội của 50.000 VND.");
        } else {
            // Tính toán số lượng các mệnh giá cần thiết
            int soTo500K = soTienCanRut / MENH_GIA_500K;
            soTienCanRut %= MENH_GIA_500K;

            int soTo200K = soTienCanRut / MENH_GIA_200K;
            soTienCanRut %= MENH_GIA_200K;

            int soTo100K = soTienCanRut / MENH_GIA_100K;
            soTienCanRut %= MENH_GIA_100K;

            int soTo50K = soTienCanRut / MENH_GIA_50K;
            soTienCanRut %= MENH_GIA_50K;

            int tongSoTo = soTo500K + soTo200K + soTo100K + soTo50K;

            // Hiển thị kết quả trong dạng bảng
            System.out.println("Số tiền rút được: " + (soTo500K * MENH_GIA_500K + soTo200K * MENH_GIA_200K + soTo100K * MENH_GIA_100K + soTo50K * MENH_GIA_50K));
            System.out.println("+----------------------+---------+---------+---------+---------+-------------+");
            System.out.println("|      Mệnh giá         |  500K   |  200K   |  100K   |   50K   | Tổng số tờ  |");
            System.out.println("+----------------------+---------+---------+---------+---------+-------------+");
            System.out.printf("| Số tờ                |   %4d  |   %4d  |   %4d  |   %4d  |     %4d     |\n",
                    soTo500K, soTo200K, soTo100K, soTo50K, tongSoTo);
            System.out.println("+----------------------+---------+---------+---------+---------+-------------+");
        }

        scanner.close();
    }
}
