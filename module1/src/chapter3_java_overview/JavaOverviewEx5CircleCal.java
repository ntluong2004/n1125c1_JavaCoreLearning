package chapter3_java_overview;

import java.util.Scanner;
import java.lang.Math;

public class JavaOverviewEx5CircleCal {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi = Math.PI;
        double r;

        System.out.print("Enter the radius of the circle (meter): ");
        r = input.nextDouble();

        System.out.println("The perimeter of the circle is " + (2 * pi * r));
        System.out.println("The area of the circle is " + (pi * r * r));


    }
}
