package chapter9_one_dimentional_array;
//1. Các thao tác nhập xuất
//    a. Nhập mảng
//    b. Xuất mảng
//2. Các thao tác kiểm tra
//    a. Mảng có phải là mảng toàn chẵn?
//    b. Mảng có phải là mảng toàn số nguyên tố?
//    c. Mảng có phải là mảng tăng dần?
//3. Các thao tác tính toán
//    a. Đếm số lượng phần tử lẻ có trong mảng a.
//    b. Tính tổng số dương lẻ của mảng a.
//    c. Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5.
//    d. Tổng các số nguyên tố có trong mảng.
//4. Các thao tác tìm kiếm
//    a. Vị trí cuối cùng của phần tử x trong mảng.
//    b. Vị trí số nguyên tố đầu tiên trong mảng nếu có.
//    c. Tìm số dương nhỏ nhất trong mảng.
//    d. Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí của k trong mảng. (*)
//    e. Tìm giá trị lớn nhất và nhỏ nhất của mảng a.

import util.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.IntegerNumber;


public class Chapter9Ex1 {

    public static Scanner input = new Scanner(System.in);

    static void main() {

//1. Các thao tác nhập xuất
        System.out.println("n number is length of the array");

        int n = Input.inputGreatThan("n", 0); //Length of the array
        int[] arr = new int[n];

        arrayImport(arr, n); //    a. Nhập mảng
        arrayExport(arr); //    b. Xuất mảng

//  2. Các thao tác kiểm tra
        System.out.println(isEvenArray(arr) ? "It is an array of all even numbers" : "Not an array of all even numbers");//    a. Mảng có phải là mảng toàn chẵn?
        System.out.println(isPrimeArray(arr) ? "It is an array of all prime numbers" : "Not an array of all prime numbers");//    b. Mảng có phải là mảng toàn số nguyên tố?
        System.out.println(isIncreaseArray(arr) ? "It is an increasing array" : "Not an increasing array"); //    c. Mảng có phải là mảng tăng dần?

//  3. Các thao tác tính toán
        System.out.print("The number of odd element in the array is: " + countOddNumbers(arr) + "\n");//    a. Đếm số lượng phần tử lẻ có trong mảng a.
        System.out.println("Sum of all odd positive number in array: " + sumOddPositiveNumbers(arr));//    b. Tính tổng số dương lẻ của mảng a.
        System.out.printf("Have %d numbers Divisible by 4 but not divisible by 5" + "\n", countDivBy4Not5(arr));//    c. Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5
        System.out.println("Sum of all prime numbers in array: " + sumOfPrimeNumbers(arr));//    d. Tổng các số nguyên tố có trong mảng.

//  4. Các thao tác tìm kiếm
        System.out.print("Enter X to find in array: ");
        int x = input.nextInt();
        System.out.printf("Last index of X = %d is: %d" + "\n", x, lastIndexOf(arr, x)); //    a. Vị trí cuối cùng của phần tử x trong mảng.

        System.out.println("First index of prime number in array is: " + firstIndexOfPrime(arr)); //    b. Vị trí số nguyên tố đầu tiên trong mảng nếu có.
        System.out.println("The smallest positive number in array is: " + minValueOfPositive(arr));//    c. Tìm số dương nhỏ nhất trong mảng.


        System.out.print("enter k value to check if it appears: ");//    d. Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí của k trong mảng. (*)
        int k = input.nextInt();
        System.out.println("K status: " + findKIndex(arr, k));

        System.out.println("Min value of array: " + finMin(arr));//    e. Tìm giá trị lớn nhất và nhỏ nhất của mảng a.
        System.out.println("Max value of array: " + finMax(arr));

    }


    //1. Các thao tác nhập xuất
    public static void arrayImport(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter a[%d]: ", i);
            arr[i] = input.nextInt();
        }
    }

    public static void arrayExport(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]: " + arr[i] + "\n", i);
        }
    }

    //2. Các thao tác kiểm tra

    //    a. Mảng có phải là mảng toàn chẵn?
    public static boolean isEvenArray(int[] arr) {
        for (int j : arr) {
            if (j % 2 != 0)
                return false;
        }
        return true;
    }

    //    b. Mảng có phải là mảng toàn số nguyên tố?
    public static boolean isPrimeArray(int[] arr) {
        for (int j : arr) {
            if (IntegerNumber.isPrime(j)) {
                return false;
            }
        }
        return true;
    }

    //    c. Mảng có phải là mảng tăng dần?
    public static boolean isIncreaseArray(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //3. Các thao tác tính toán
//    a. Đếm số lượng phần tử lẻ có trong mảng a.
    public static int countOddNumbers(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    //    b. Tính tổng số dương lẻ của mảng a.
    public static int sumOddPositiveNumbers(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            if (j > 0 && j % 2 != 0) {
                sum += j;
            }
        }
        return sum;
    }

    //    c. Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5
    public static int countDivBy4Not5(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 4 == 0 && i % 5 != 0) {
                count++;
            }
        }
        return count;
    }

    //    d. Tổng các số nguyên tố có trong mảng.
    public static int sumOfPrimeNumbers(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (IntegerNumber.isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }


    //4. Các thao tác tìm kiếm
//    a. Vị trí cuối cùng của phần tử x trong mảng.
    public static int lastIndexOf(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    //    b. Vị trí số nguyên tố đầu tiên trong mảng nếu có.
    public static int firstIndexOfPrime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (IntegerNumber.isPrime(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    //    c. Tìm số dương nhỏ nhất trong mảng.
    public static int minValueOfPositive(int[] arr) {
        int temp = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < temp) {
                temp = j;
            }
        }
        return temp;
    }

    //    d. Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí của k trong mảng. (*)
    public static List<Integer> findKIndex(int[] arr, int k) {
        List<Integer> KIndex = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                KIndex.add(i);
            }
        }
        return KIndex;
    }

    //    e. Tìm giá trị lớn nhất và nhỏ nhất của mảng a.
    public static int finMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int finMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

