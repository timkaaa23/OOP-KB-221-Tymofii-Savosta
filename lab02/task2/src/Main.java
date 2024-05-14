public class Main {
    public static void main(String[] args) {
        Segment segment1 = new Segment(new Point(5, 5), new Point(4, 5));
        Segment segment2 = new Segment(new Point(1, 4), new Point(3, -1));

        System.out.println(segment1.lenght());
        System.out.println(segment1.middle());
        System.out.print(segment1.intersection(segment2));
        }
    }


