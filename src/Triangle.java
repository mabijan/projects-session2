public final class Triangle {
    double a;
    double h;

    public Triangle(double a1, double h1) {
        this.a = a1;
        this.h = h1;
    }

    public void print_info() {
        double area = (a * h) / 2;
        double value = Math.sqrt((a * a) + (h * h));
        double circumference = a + (2 * value);
        System.out.format("The area of this shape is:%f\n", area);
        System.out.format("The circumference of this shape is:%f", circumference);
    }
}

