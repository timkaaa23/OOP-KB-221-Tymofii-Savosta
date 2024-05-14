public class Circle extends Figure{
    private Point O;
    private double R;

    public Circle(Point O, double R) {
        this.R = R;
        this.O = O;

        double area = square();
        if (area <= 0) {
            System.out.print("Error: Invalid input");
            System.exit(1);
        }
    }

    public double square(){
        return  Math.pow(R, 2) * Math.PI;
    }

    public String toString(){
        return "Circle[O(" + O.getX() + ";" + O.getY() + "), " + R + "]";
    }

    public Point centroid(){
        return new Point(O.getX(), O.getY());
    }
}
