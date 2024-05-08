public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(1, 1);
        Line line2 = new Line(-1, 3);

        Point result = line1.intersection(line2);
        System.out.println(result);
    }
}