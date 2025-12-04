package chapter4_condition;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Chapter4Ex10CheckPerfectSquare {
    static void main() {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter the number: ");
        number = input.nextInt();

        if (number < 0){
            System.out.println("err: number < 0");
        }
        else{
            if(sqrt(number) % 1 == 0){
                System.out.println(number + " is a perfect square number");
            }
            else{
                System.out.println(number + " is not a perfect square number");
            }
        }

    }
}
