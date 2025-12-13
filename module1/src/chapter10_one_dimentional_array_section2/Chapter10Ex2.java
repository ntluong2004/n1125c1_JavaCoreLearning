package chapter10_one_dimentional_array_section2;

import util.Array;
import util.IntegerNumber;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter10Ex2 {

//    Thao Tác với Mảng 1 Chiều trong Java: Thêm, Xóa, Sửa và Số Nguyên Tố
//Đề bài
//Các thao tác thêm/xóa/sửa
//    a.    Sửa các số nguyên tố có trong mảng thành số 0
//    b.    Chèn số 0 đằng sau các số nguyên tố trong mảng
//    c.    Xóa các phần tử trong mảng a có giá trị k được nhập vào từ bàn phím. (*)
//    d.    Xóa tất cả số nguyên tố có trong mảng
//    e.    Chèn 1 phần tử vào vị trí k bất kỳ (lưu ý: cần xóa bớt phần tử cuối cùng).


    static void main() {
        int[] arr = {-3, -4, 1, 2, 3, 16, 8, 10, 11, -8};
        int[] a = arr.clone();
        int[] b = arr.clone();
        int[] c = arr.clone();
        int[] d = arr.clone();
        int[] e = arr.clone();

        Scanner input = new Scanner(System.in);

        System.out.println(Arrays.toString(replacePrimeBy0(a)));//    a.    Sửa các số nguyên tố có trong mảng thành số 0
        System.out.println(Arrays.toString(insertOToAfterPrime(b))); //    b.    Chèn số 0 đằng sau các số nguyên tố trong mảng

        //      c.    Xóa các phần tử trong mảng a có giá trị k được nhập vào từ bàn phím. (*)
        System.out.print("Enter K value for remove it from all array: ");
        int k = input.nextInt();
        System.out.print("Array after remove K value: " + Arrays.toString(removeKValues(c, k)) + "\n");

        System.out.print("Array after remove all prime number: " + Arrays.toString(removeAllPrime(d)) + "\n"); //    d.    Xóa tất cả số nguyên tố có trong mảng

        System.out.print("Array after insert new element: " + Arrays.toString(insertElementAfterIndex(e, 3, 100))); //    d.    Xóa tất cả số nguyên tố có trong mảng


    }

    //    a.    Sửa các số nguyên tố có trong mảng thành số 0
    static int[] replacePrimeBy0(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (IntegerNumber.isPrime(arr[i])) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    //    b.    Chèn số 0 đằng sau các số nguyên tố trong mảng
    static int[] insertOToAfterPrime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (IntegerNumber.isPrime(arr[i])) {
                arr = Array.addNewElement(arr, 0, i + 1);
                i++;
            }
        }
        return arr;
    }

    static int[] removeKValues(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                arr = Array.removeArrayElement(arr, i);
            }
        }
        return arr;
    }

    //    d.    Xóa tất cả số nguyên tố có trong mảng
    static int[] removeAllPrime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (IntegerNumber.isPrime(arr[i])) {
                arr = Array.removeArrayElement(arr, i);
                i--;
            }
        }
        return arr;
    }

    //    e.    Chèn 1 phần tử vào vị trí k bất kỳ (lưu ý: cần xóa bớt phần tử cuối cùng).
    static int[] insertElementAfterIndex(int[] arr, int index, int value) {

//        return Array.addNewElement(Array.removeArrayElement(arr, index), index, value);

//Case 1: need fix
//        for (int i = 0; i < arr.length; i++) {
//            if (index == i) {
//                for (int j = 0; j < index; j++) {
//                    arr[i] = arr[j];
//                }
//                for (int j = index + 1; j < arr.length - 1; j++) {
//                    arr[i] = arr[j];
//                }
//                arr[index] = value;
//            }
//
//        return arr;
//    }
//Case 2:
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        return arr;
    }
}
