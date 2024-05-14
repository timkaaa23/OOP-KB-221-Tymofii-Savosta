public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(new Point(0, 0), new Point(3, 6), new Point(6, 0));

        System.out.println("Triangle:");
        System.out.println(triangle.square());
        System.out.println(triangle.centroid());
        System.out.println(triangle.toString());

        Quadrilateral quadrilateral = new Quadrilateral(new Point(0, 0), new Point(0, 4), new Point(4, 4), new Point(4, 0));

        System.out.println("Quadrilateral:");
        System.out.println(quadrilateral.square());
        System.out.println(quadrilateral.centroid());
        System.out.println(quadrilateral.toString());

        Circle circle = new Circle(new Point(0, 0), 4);

        System.out.println("Circle:");
        System.out.println(circle.square());
        System.out.println(circle.centroid());
        System.out.println(circle.toString());

    }
}
