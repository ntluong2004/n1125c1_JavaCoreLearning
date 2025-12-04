package chapter5_loop;

import java.util.Scanner;

public class Chapter5LoopEx6PrintNegativeNumber {
    static void main() {
        Scanner input = new Scanner(System.in);
        double n;
//        Declare distance and count variable
//        do-while loop require user enter again when number wrong type (n<0), not a number
        do {
            System.out.print("Enter n number (n<0): ");
            n = input.nextInt();

            if (n < 0) {
                System.out.println("\u001b[31m]" + "Err: n<0 please enter again!!!" + "\u001b[0m]");
            }
        }
        while (n < 0);


        int i = 2;
        int distance = 2, count = 1;

        while (i <= n) {
            if (count == distance) {
                count = 0;
                distance += 1;
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
            count++;
            i += 2;
        }
    }
}
