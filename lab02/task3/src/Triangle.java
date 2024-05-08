public class Triangle {
    private byte[] A, B, C;

    public Triangle(byte[] A, byte[] B, byte[] C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double area(){
        double xA = A[0];
        double yA = A[1];
        double xB = B[0];
        double yB = B[1];
        double xC = C[0];
        double yC = C[1];

        double AB = Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));
        double BC = Math.sqrt(Math.pow((xC - xB), 2) + Math.pow((yC - yB), 2));
        double AC = Math.sqrt(Math.pow((xC - xA), 2) + Math.pow((yC - yA), 2));

        double p = (AB + BC + AC) / 2;

        double S = Math.sqrt(p * (p - AB) * (p - BC) * (p - AC));

        return S;
    }

    public Point centroid(){
        double xA = A[0];
        double yA = A[1];
        double xB = B[0];
        double yB = B[1];
        double xC = C[0];
        double yC = C[1];

        double x = (xA + xB + xC) / 3;
        double y = (yA + yB + yC) / 3;

        return new Point(x, y);
    }
}
