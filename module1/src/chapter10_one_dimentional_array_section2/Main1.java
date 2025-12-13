package chapter10_one_dimentional_array_section2;

import util.Sort;

import java.util.Arrays;

public class Main1 {
    static void main() {

        int[] arr = {-2, 4, 3, 2, 1};

//        Arrays.sort(arr);

        Sort.increaseInterchangeSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
