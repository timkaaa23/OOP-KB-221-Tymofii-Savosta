public class Quadrilateral extends Figure{
    private Point A, B, C, D;

    public Quadrilateral(Point A, Point B, Point C, Point D){
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        double area = square();
        if (area <= 0) {
            System.out.print("Error: Invalid input");
            System.exit(1);
        }
    }
    public double square(){
        double AB = Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
        double BC = Math.sqrt(Math.pow(C.getX() - B.getX(), 2) + Math.pow(C.getY() - B.getY(), 2));
        double DC = Math.sqrt(Math.pow(C.getX() - D.getX(), 2) + Math.pow(C.getY() - D.getY(), 2));
        double AD = Math.sqrt(Math.pow(D.getX() - A.getX(), 2) + Math.pow(D.getY() - A.getY(), 2));

        double S = Math.abs((A.getX() * B.getY() + B.getX() * C.getY() * C.getX() * D.getY() + D.getX() * A.getY()) - (B.getX() * A.getY() + C.getX() * B.getY() + D.getX() * C.getY() + A.getX() * D.getY())) / 2;
        return S;
    }
    public String toString(){
        return "Quadrilateral[A(" + A.getX() + ";" + A.getY() + "), B(" + B.getX() + ";" + B.getY() + "), C(" + C.getX() + ";" + C.getY() + "), D(" + D.getX() + ";" + D.getY() + ")]";
    }
    public Point centroid(){
        double x = (A.getX() + B.getX() + C.getX() + D.getX()) / 4;
        double y = (A.getY() + B.getY() + C.getY() + D.getY()) / 4;

        return new Point(x, y);
    }
}
