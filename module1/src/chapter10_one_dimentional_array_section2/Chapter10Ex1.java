package chapter10_one_dimentional_array_section2;

import util.Array;
import util.IntegerNumber;
import util.Sort;

import java.util.Arrays;

public class Chapter10Ex1 {
    //    Các thao tác xử lý
//    a. Tách các số nguyên tố có trong mảng a đưa vào mảng b.
//    b. Tách mảng a thành 2 mảng b (chứa các số nguyên dương) và c (chứa các số còn lại)
//    c. Sắp xếp mảng giảm dần
//    d. Sắp xếp mảng sao cho các số dương đứng đầu mảng giảm dần, kế đến là các số âm tăng dần, cuối cùng là các số 0.
//    e. Đảo thứ tự các phần tử của mảng a.
//    f. Kiểm tra xem mảng a có phải là mảng đối xứng hay không.
//            Vd: Mảng sau là mảng đối xứng {1, 2, 4, 7, 3, 7, 4, 2, 1}
//    g. Đếm số cặp số đối xứng trong mảng.
//    Vd: Mảng sau {1, 2, 8, 7, 3, 7, 4, 2, 1} có 3 cặp số đối xứng
    static void main() {

        int[] arr = {-3, -4, 1, 2, 3, 16, 8, 10, 11, -8};
        int[] e = arr.clone();
        int[] f = arr.clone();
        int[] g = arr.clone();

        System.out.println(Arrays.toString(makePrimeArray(arr, countPrimeInArray(arr)))); //    a. Tách các số nguyên tố có trong mảng a đưa vào mảng b.

        System.out.println(Arrays.toString(makePositivesArray(arr)));//    b. Tách mảng a thành 2 mảng b (chứa các số nguyên dương) và c (chứa các số còn lại)
        System.out.println(Arrays.toString(makeUnPositivesArray(arr)));


        System.out.println(Arrays.toString(Sort.reduceInterchangeSort(arr))); //    c. Sắp xếp mảng giảm dần

        System.out.println(Arrays.toString(sortArrayByRule(arr))); //    d. Sắp xếp mảng sao cho các số dương đứng đầu mảng giảm dần, kế đến là các số âm tăng dần, cuối cùng là các số 0.

        System.out.println(Arrays.toString(reverseArray(e))); //    e. Đảo thứ tự các phần tử của mảng a.

//  f. Kiểm tra xem mảng a có phải là mảng đối xứng hay không.
        if (Array.isPalindromeArray(f)) {
            System.out.println("Array is Palindrome");
        } else {
            System.out.println("Array is not Palindrome");
        }

//  g. Đếm số cặp số đối xứng trong mảng.
        System.out.println("Number of symmetric elements in array: " + countPalindromeNumber(g));
    }


    //  Count prime number in an array
    static int countPrimeInArray(int[] arr) {

        int count = 0;

        for (int j : arr) {
            if (IntegerNumber.isPrime(j)) {
                count++;
            }
        }
        return count;
    }

    //  Make a new array and add prime number from A array to it
    static int[] makePrimeArray(int[] arr, int size) {

        if (arr == null) {
            return new int[0];
        }

        int[] b = new int[size];
        int bIndex = 0;

        for (int j : arr) {
            if (IntegerNumber.isPrime(j)) {
                b[bIndex] = j;
                bIndex++;
            }
        }
        return b;
    }

    static int countPositive(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    static int[] makePositivesArray(int[] arr) {

        int size = countPositive(arr);

        int[] b = new int[size];
        int bIndex = 0;

        for (int j : arr) {
            if (j > 0) {
                b[bIndex] = j;
                bIndex++;
            }
        }
        return b;
    }

    static int[] makeUnPositivesArray(int[] arr) {
        int size = arr.length - countPositive(arr);
        int[] c = new int[size];
        int cIndex = 0;

        for (int j : arr) {
            if (j <= 0) {
                c[cIndex] = j;
                cIndex++;
            }
        }
        return c;
    }

    static int[] sortArrayByRule(int[] arr) {

        int index = 0;
        for (int i : Sort.reduceInterchangeSort(makePositivesArray(arr))) {
            arr[index] = i;
            index++;
        }
        for (int j : Sort.increaseInterchangeSort(makeUnPositivesArray(arr))) {
            arr[index] = j;
            index++;
        }
        return arr;
    }

    public static int[] reverseArray(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }

    static int countPalindromeNumber(int[] arr) {
        int count = 0;
        if (arr.length == 0 || arr.length == 1) {
            return 0;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] == arr[end]) {
                count++;
            }
            start++;
            end--;
        }
        return count;
    }
}
