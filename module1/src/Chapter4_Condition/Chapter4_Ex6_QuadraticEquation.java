package Chapter4_Condition;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Chapter4_Ex6_QuadraticEquation {

    static double FirstDegreeEquationCal(int a, int b) {

        double result = 0;
        if (a == 0 && b != 0) {
            System.out.println("Inconsistent Values");
        } else if (a == 0 && b == 0) {
            System.out.println("Equation with infinitely mani solutions");
        } else {
            result = (double) -b / a;
            System.out.println("The first degree equation result is: " + result);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double delta;

        System.out.println("Quadratic Equation type: ax^2 + bx + c = 0");

        System.out.print("Enter the a number: ");
        int a = input.nextInt();

        System.out.print("Enter the b number: ");
        int b = input.nextInt();

        System.out.print("Enter the c number: ");
        int c = input.nextInt();

        if (a == 0) {
            FirstDegreeEquationCal(b, c);
        } else {
            delta = b * b - 4 * a * c;
            System.out.println("Delta: " + delta);

            if (delta < 0) {
                System.out.println("Meaningless");
            } else if (delta == 0) {
                System.out.println("Equation has exactly one solution: " + ((double) -b / 2*a));
            } else if (delta > 0) {
                System.out.println("Equation have 2 distinct solutions");
                System.out.println("x1 = " + (((double) -b - sqrt(delta)) / (2 * a)));
                System.out.println("x2 = " + (((double) -b + sqrt(delta)) / (2 * a)));
            }
        }

    }
}
