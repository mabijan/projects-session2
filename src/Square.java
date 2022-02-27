public final class Square {
    double a;
    double b;

    public Square(double a1, double b1) {
        this.a = a1;
        this.b = b1;
    }

    public void print_info() {
        double area = a * b;
        double circumference = (a + b) * 2;
        System.out.format("The area of this shape is:%f\n", area);
        System.out.format("The circumference of this shape is:%f", circumference);
    }


}
