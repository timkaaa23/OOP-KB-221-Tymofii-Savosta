public class Segment {
    private Point A, B;

    public Segment(Point A, Point B) {
        if(A.getX() == B.getX() && A.getY() == B.getY()){
            System.out.print("Invalid input");
            System.exit(1);
        }
        this.A = A;
        this.B = B;
    }
    public double lenght() {
        double result = Math.sqrt(Math.pow((B.getX() - A.getX()), 2) + Math.pow((B.getY() - A.getY()), 2));
        return result;
    }
    public Point middle(){
        double x = (A.getX() + B.getX()) / 2;
        double y = (A.getY() + B.getY()) / 2;

        return new Point(x, y);
    }

    public Point intersection(Segment another){
        double m = (B.getY() - A.getY()) / (B.getX() - A.getX());
        double c = A.getY() - m * A.getX();
        double a = (another.B.getY() - another.B.getX()) / (another.A.getY() - another.A.getX());
        double d = another.B.getX() - a * another.A.getX();

        double x = (a - m) / (c - d);
        double y = c * x + m;

        return new Point(x, y);
    }
}