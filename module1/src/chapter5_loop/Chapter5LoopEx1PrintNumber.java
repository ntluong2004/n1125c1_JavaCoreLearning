package chapter5_loop;

import java.util.Scanner;

public class Chapter5LoopEx1PrintNumber {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter n (n>0): ");
            n = input.nextInt();

            if (n < 0) {
                System.out.println("\u001b[31m" + "Err: n<0 | please enter again" + "\u001b[0m");
            }
        }
        while (n < 0);

        int i = 1;
        while (i <= n){
            System.out.print(i + " ");
            i++;
        }

    }
}
