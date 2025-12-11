package util;

import java.util.Scanner;


public class IntArrayInput {
    public static Scanner input = new Scanner(System.in);

    static int[] arrayInput(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter arr[%d}: ", i);
            arr[i] = new int[]{input.nextInt()};
        }
        return arr[n];
    }
}
