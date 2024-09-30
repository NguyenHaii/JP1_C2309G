import Entity.Point;
import Entity.Triangle;

public class Main {
    public static void main(String[] args) {
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(2, 3);

        Triangle triangle = new Triangle(A, B, C);

        if (triangle.isTriangle()) {
            System.out.println("Cac diem tao thanh mot tam giac");
            System.out.println("Chu vi la: " + triangle.chuvi());
            System.out.println("Dien tich la: " + triangle.dientich());

            Point P = new Point(2, 1);
            if (triangle.checkPointInTriangle(P)) {
                System.out.println("Diem P nam trong tam giac.");
            } else {
                System.out.println("Diem P nam ngoai tam giac.");
            }
        } else {
            System.out.println("Cac diem khong tao thanh mot tam giac.");
        }
    }
}
