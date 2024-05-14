
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 5), new Point (5, 0));
        System.out.println(triangle.area());
        System.out.println(triangle.centroid());
        }
    }
