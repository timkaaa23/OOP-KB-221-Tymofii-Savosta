public class Triangle {
    private Point A, B, C;

    public Triangle(Point A, Point B, Point C){
        this.A = A;
        this.B = B;
        this.C = C;
        double square = area();
        if (square <= 0) {
            System.out.print("Error: Invalid input");
            System.exit(1);
        }
    }
    public double area(){
        double AB = Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
        double BC = Math.sqrt(Math.pow(C.getX() - B.getX(), 2) + Math.pow(C.getY() - B.getY(), 2));
        double AC = Math.sqrt(Math.pow(C.getX() - A.getX(), 2) + Math.pow(C.getY() - A.getY(), 2));

        double p = (AB + BC + AC) / 2;
        double S = Math.sqrt(p * (p - AB) * (p - BC) * (p - AC));

        return S;
    }

    public Point centroid(){
        double x = (A.getX() + B.getX() + C.getX()) / 3;
        double y = (A.getY() + B.getY() + C.getY()) / 3;
        return new Point(x, y);
    }
}
