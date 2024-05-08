public class Main {
    public static void main(String[] args) {
        Segment segment1 = new Segment(new byte[] {2, 2}, new byte[] {-1, 3});
        Segment segment2 = new Segment(new byte[] {1, 4}, new byte[] {3, -1});

        System.out.println(segment1.lenght());
        System.out.println(segment1.middle());
        System.out.print(segment1.intersection(segment2));
        }
    }


