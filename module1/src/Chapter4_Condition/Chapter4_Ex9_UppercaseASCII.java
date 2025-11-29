package Chapter4_Condition;

import java.util.Scanner;

public class Chapter4_Ex9_UppercaseASCII {
    static void main() {
        Scanner input = new Scanner(System.in);
        char key, invertKey;

        System.out.println("Enter a letter (a or b or c,...)");
        key = input.next().charAt(0);

        if (key >= 'A' && key <= 'Z') {
            System.out.println("Original character: " + key);
            System.out.println("Inverted character: " + ((char) (key + 32)));
        } else if (key >= 'a' && key <= 'z') {
            System.out.println("Original character: " + key);
            System.out.println("Inverted character: " + ((char) (key - 32)));
        } else {
            System.out.println("Invalid character");
        }
    }
}
