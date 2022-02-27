public final class EQ1 {
    double a, b, c, d;
    double e, f;

    public EQ1(double a1, double b1, double c1,
               double d1, double e1, double f1) {

        this.a = a1;
        this.b = b1;
        this.c = c1;
        this.d = d1;
        this.e = e1;
        this.f = f1;

    }

    public void get_result() {
        System.out.println("a:" + a + "\n" + "b:" + b + "\n" + "c:" + c + "\n" + "d:" + d + "\n" +
                "e:" + e + "\n" + "f:" + f + "\n");

        if (((a * d) - (b * c)) != 0) {
           double result1 = ((e * d) - (b * f)) / ((a * d) - (b * c));
            System.out.format("the first answer is(X):%f\n", result1);
        } else {
            System.out.println("the first equations doesnt have real value(s)!");
        }
        if (((a * d) - (b * c)) != 0) {
           double result2 = ((a * f) - (e * c)) / ((a * d) - (b * c));
            System.out.format("the second answer is(Y):%f", result2);
        } else {
            System.out.println("the second equations doesnt have real value(s)!");
        }
    }

}
