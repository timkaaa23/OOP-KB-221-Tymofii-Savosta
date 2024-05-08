
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new byte[] {0, 0}, new byte[] {0, 5}, new byte[] {5, 0});
        System.out.println(triangle.area());
        System.out.println(triangle.centroid());
        }
    }
