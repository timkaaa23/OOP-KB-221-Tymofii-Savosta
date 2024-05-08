public class Segment {
    private byte[] A, B;

    public Segment(byte[] A, byte[] B) {
        this.A = A;
        this.B = B;
    }

    public double lenght() {
        double x1 = A[0];
        double x2 = B[0];
        double y1 = A[1];
        double y2 = B[1];

        double result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return result;
    }

    public Point middle(){
        double x1 = A[0];
        double x2 = B[0];
        double y1 = A[1];
        double y2 = B[1];

        double xM = (x1 + x2) / 2;
        double yM = (y1 + y2) / 2;

        return new Point(xM, yM);
    }

    public Point intersection(Segment another){
        double x1 = A[0];
        double x2 = B[0];
        double y1 = A[1];
        double y2 = B[1];

        double a1 = another.A[0];
        double b1 = another.B[0];
        double a2 = another.A[1];
        double b2 = another.B[1];

        double m = (y2 - y1) / (x2 - x1);
        double c = y1 - m * x1;
        double a = (b2 - b1) / (a2 - a1);
        double d = b1 - a * a1;

        double x = (a - m) / (c - d);
        double y = c * x + m;

        return new Point(x, y);
    }
}