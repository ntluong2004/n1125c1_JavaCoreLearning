package chapter10_one_dimentional_array_section2;

import util.Array;
import util.IntegerNumber;

import java.util.Arrays;

public class Main3 {
    // Bài tập thêm một số không vào sau tất cả số nguyên tố trong mảng
    static void main() {

        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            if (IntegerNumber.isPrime(arr[i])) {
                arr = Array.addNewElement(arr, 2, i + 1);
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
