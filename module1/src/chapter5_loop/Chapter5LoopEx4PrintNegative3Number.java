package chapter5_loop;

import java.util.Scanner;

public class Chapter5LoopEx4PrintNegative3Number {
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

//case1
        /** int i = 2;

         while (i <= n) {

         if (i % 6 == 0) {
         System.out.print(-i + " ");
         } else {
         System.out.print(i + " ");
         }
         i += 2;
         }**/

//        Case2
        int i = 2;
        int distance = 3, count = 0;

        while (i <= n) {
            count++;
            if (count == distance) {
                count = 0;
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
            i += 3;
        }
    }
}
