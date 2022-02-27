import java.util.Scanner;

public class equation {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("for (ax + by = e) and for (cx + dy = f) " +
                "please insert desired values");
        System.out.print("a:");
        double a = input.nextDouble();

        System.out.print("b:");
        double b = input.nextDouble();

        System.out.print("c:");
        double c = input.nextDouble();

        System.out.print("d:");
        double d = input.nextDouble();

        System.out.println("Now insert values for constant variables!");

        System.out.print("e:");
        double e = input.nextDouble();

        System.out.print("f:");
        double f = input.nextDouble();

        EQ1 example = new EQ1(a, b, c, d, e, f);
        example.get_result();
    }
}

