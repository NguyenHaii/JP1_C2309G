package Entity;

public class Triangle extends Point {
    private Point A;
    private Point B;
    private Point C;


    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }


    public boolean isTriangle() {
        double a = A.distance(B);
        double b = B.distance(C);
        double c = C.distance(A);
        return (a < b + c) && (b < c + a) && (c < a + b);
    }


    public double chuvi() {
        double a = A.distance(B);
        double b = B.distance(C);
        double c = C.distance(A);
        return a + b + c;
    }


    public double dientich() {
        double a = A.distance(B);
        double b = B.distance(C);
        double c = C.distance(A);
        double s = chuvi() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


    public boolean checkPointInTriangle(Point p) {

        double areaABC = dientich();

        Triangle triangleABP = new Triangle(A, B, p);
        double areaABP = triangleABP.dientich();


        Triangle triangleACP = new Triangle(A, C, p);
        double areaACP = triangleACP.dientich();

        Triangle triangleBCP = new Triangle(B, C, p);
        double areaBCP = triangleBCP.dientich();

        return (areaABP + areaACP + areaBCP) == areaABC;

    }

}
