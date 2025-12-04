package chapter5_loop;

import java.util.Scanner;

public class Chapter5LoopEx7PrintFibonaciNumber {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter n (n>0): ");
            n = input.nextInt();

            if (n < 0) {
                System.out.println("\u001b[31m" + "Err: n < 0, please enter again" + "\u001b[0m");
            }
        }
        while (n < 0);

        int f1 = 0, f2 = 1, fn = 0;

        while (fn <= n) {
            fn = f1 + f2;
            System.out.print(fn + " ");

            f1 = f2;
            f2 = fn;
        }
    }
}
