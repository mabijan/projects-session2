import java.util.Objects;
import java.util.Scanner;

public class TriangleSquare{
    public static void main(String[] args){

        System.out.print("please insert the geometric shape you want to calculate\n");
        System.out.println("for Triangle press \"T\" and for Square press \"S\":");

        Scanner input = new Scanner(System.in);
        String KEY = input.next();

        if (Objects.equals(KEY, "S")){
            System.out.println("please insert the values for a and b:");
            System.out.print("insert for a:");
            double a = input.nextDouble();
            System.out.print("insert for b:");
            double b = input.nextDouble();
            Square S1 = new Square(a, b);
            S1.print_info();

        }else if (Objects.equals(KEY, "T")){
            System.out.println("please insert the values for a and h(height):");
            System.out.print("insert for a:");
            double a = input.nextDouble();
            System.out.print("insert for h(height):");
            double h = input.nextDouble();
            Triangle T1 = new Triangle(a, h);
            T1.print_info();
        }
    }
}


