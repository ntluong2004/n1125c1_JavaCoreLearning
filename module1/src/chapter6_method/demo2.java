package chapter6_method;

public class demo2 {

    static void main(String[] args) {
        System.out.println(sum(5, 6));
        int total;
        total = sum(5, 6);
        System.out.println(total);
    }

    //    Viet phuong thuc tinh tong 2 so ab
    static int sum(int a, int b) {
        return a + b;
    }
}


