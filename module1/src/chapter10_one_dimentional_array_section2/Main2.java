package chapter10_one_dimentional_array_section2;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    static void main() {
        Scanner input = new Scanner(System.in);
//  Bước 1: nhập số lượng phần tử của mảng
        System.out.print("Enter size of array: ");
        int n = Input.inputGreatThan("n ", 0);

//  Bước 2: khai báo mảng mới
        int[] arr = new int[n];

//  Bước 3: Nhập mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter arr[%d}: ", i);
            arr[i] = input.nextInt();
        }

//  Bước 4: Xuất mảng
        for (int j : arr) { //đây là dùng foeach, foreach dùng trong trường hợp không cần truy cập đến chỉ số phần tử i
            System.out.print(j + " ");
        }
        System.out.println();


        arr = addNewElement2(arr, 100, 2);
        System.out.println(Arrays.toString(arr));
    }

    static int[] addNewElement(int[] arr, int x) {
//        Step1: make a new array
        int[] brr = new int[arr.length + 1];

//        Step2: duplicate array 1 to array 2
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }

//  Step3: insert new element to end of array
        brr[arr.length] = x;

//  Step 4: reference to new array
        return brr;
    }

    static int[] addNewElement(int[] arr, int x, int index) {
//  Step1: make a new array
        int[] brr = new int[arr.length + 1];

//  Step2: duplicate array 1 to array 2
        for (int i = 0; i < index; i++) {
            brr[i] = arr[i];
        }

        for (int i = index; i < arr.length; i++) {
            brr[i + 1] = arr[i];
        }

//  Step3: insert new element to end of array
        brr[index] = x;

//  Step 4: reference to new array
        return brr;
    }

    static int[] addNewElement2(int[] arr, int x, int index) {
//  Step1: make a new array
        int[] brr = new int[arr.length + 1];

//  Step2: duplicate array 1 to array 2
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                brr[i] = x;
                k++;
                brr[i+k] = arr[i];
                continue;
            }
            brr[i+k] = arr[i];
        }
//  Step3: insert new element to end of array

//  Step 4: reference to new array
        return brr;
    }
}
