package Chapter4_Condition;

import java.util.Scanner;

public class Chapter4_Ex5_FirstDegreeEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;
        double result;

        System.out.println("Equation type: ax+b=0");

        System.out.print("Enter a: ");
        a = input.nextInt();

        System.out.print("Enter b: ");
        b = input.nextInt();

        if (a == 0 && b != 0) {
            System.out.println("Inconsistent Values");
        } else if (a == 0 && b == 0) {
            System.out.println("Equation with infinitely mani solutions");
        } else {
            result = (double) -b / a;
            System.out.println("The first degree equation result is: " + result);
        }
    }
}
