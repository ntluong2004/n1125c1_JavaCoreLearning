package chapter5_loop;

import java.util.Scanner;

public class Chapter5LoopEx14 {
    static void main() {
        Scanner input = new Scanner(System.in);
        double n;

        do {
            System.out.print("Enter n number (n>0): ");
            n = input.nextInt();

            if (n < 0) {
                System.out.println("\u001b[31m]" + "Err: n<0 please enter again!!!" + "\u001b[0m]");
            }
        }
        while (n < 0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1 ||           // First line
                        i == n ||           // final line
                        j == 1 ||           // First collum
                        j == n) {           // final collum

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}

