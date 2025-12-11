package chapter9_one_dimentional_array;

import util.Input;

import java.util.Scanner;

public class main1 {
    static void main() {
        Scanner input = new Scanner(System.in);
        //Bước 1: nhập số lượng phần tử của mảng
        int n = Input.inputGreatThan("n", 0);

//        Bước 2: khai báo mảng mới
        int[] arr1 = new int[n];

//        Bước 3: Nhập mảng
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("Enter arr[%d}: ", i);
            arr1[i]  = input.nextInt();
        }

//        Bước 4: Xuất mảng
        for (int j : arr1) { //đây là dùng foeach, foreach dùng trong trường hợp không cần truy cập đến chỉ số phần tử i
            System.out.print(j + " ");
        }

    }
}
