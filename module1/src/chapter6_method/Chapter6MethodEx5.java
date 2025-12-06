package chapter6_method;

import java.util.Scanner;

public class Chapter6MethodEx5 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.println("Please enter a positive integer");
            n = input.nextInt();

            if (n < 0) {
                System.out.print("ERROR: negative number, Please Enter again: ");
            }

        }
        while (n < 0);

        System.out.print(n + " value of fibonaci sequence: ");
        printFibonacci(n);
    }

    static void printFibonacci(int n) {
        int f0 = 1,
        f1 = 1, f2;

        if (n >= 1) {
            System.out.print((f0 - 1) + " " + f1 + " ");
        }
        for (int i = 2; i <= n; i++) {
            f2 = f0 + f1;
            System.out.print(f2 + " ");

            f0 = f1;
            f1 = f2;
        }
    }
}


