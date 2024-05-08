class Line {
    private double k;
    private double b;

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line another) {

        if (this.k == another.k) {
            return null;
        }

        double x = (another.b - this.b) / (this.k - another.k);
        double y = this.k * x + this.b;

        return new Point(x, y);
    }
}