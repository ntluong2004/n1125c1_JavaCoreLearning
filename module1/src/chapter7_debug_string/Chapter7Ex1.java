package chapter7_debug_string;

import java.util.Scanner;

public class Chapter7Ex1 {

//    a. Lấy ra chữ World
//    b. Thay o thành f
//    c. Đếm xem có bao nhiêu chữ l
//    d. Cho biết vị trí xuất hiện đầu tiên và cuối cùng của chữ l
//    e. Xóa hết space giữa chừng, đầu tiên và cuối cùng
//    f. Xóa hết space đầu tiên và cuối cùng (không được xóa space giữa chừng)
//    g. Đảo chuỗi thành dlroW olleH
//    h. Cho chuỗi "SQC". Hãy tạo thành chuỗi “SQC Hello World”
//    i. Đổi toàn bộ kí tự của S sang chữ Hoa
//    k. Đổi toàn bộ kí tự của S sang chữ thường
//    l. Trích ra chuỗi con của S từ kí tự thứ n đến thứ m của S (n, m nhập từ bàn phím)

    static void main() {
        String string = " Hello World ";

//    a. Lấy ra chữ World
        System.out.println(string.substring(6, 12));

//    b. Thay o thành f
        System.out.println(string.replace('o', 'f'));

//    c. Đếm xem có bao nhiêu chữ l
        int count = 0;
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == 'l') {
                count += 1;
            }
        }
        System.out.println(count);

//    d. Cho biết vị trí xuất hiện đầu tiên và cuối cùng của chữ l
        System.out.println("Firt index of 'l' chart: " + string.indexOf('l'));
        System.out.println("Last index of 'l' chart: " + string.lastIndexOf('l'));

//    e. Xóa hết space giữa chừng, đầu tiên và cuối cùn
        System.out.println(string.replace(" ", ""));

//    f. Xóa hết space đầu tiên và cuối cùng (không được xóa space giữa chừng)
        System.out.println(string.trim());

//    g. Đảo chuỗi thành dlroW olleH

//        case 1
        StringBuilder sb = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        String newString = sb.toString();
        System.out.println(newString);
//      case 2
        String newString1 = sb.reverse().toString();
        System.out.println(newString1);

//    h. Cho chuỗi "SQC". Hãy tạo thành chuỗi “SQC Hello World”
        //Case 1 (use stringBuilder to save memory
        newString = "SQC" + " Hello World";
        System.out.println(newString);
        //case2
        String string1 = "SQC";
        System.out.println(string1.concat(string));

//    i. Đổi toàn bộ kí tự của S sang chữ Hoa: Sử dụng phương thức toUpperCase().
        System.out.println(string.toUpperCase());

//    k. Đổi toàn bộ kí tự của S sang chữ thường
        System.out.println(string.toLowerCase());

//    l. Trích ra chuỗi con của S từ kí tự thứ n đến thứ m của S (n, m nhập từ bàn phím)
        Scanner input = new Scanner(System.in);
        int n, m;

        do {
            do {
                System.out.print("please enter n and m number to get string: ");
                n = input.nextInt();

                if (n < 0) {
                    System.out.println("\u001B[31m" + "n number must be greater than zero, please enter again" + "\u001b[0m");
                }
            }
            while (n < 0);

            do {
                System.out.print("please enter m number to get string: ");
                m = input.nextInt();
                if (m < 0) {
                    System.out.println("\u001b[31m" + "m number must be greater than zero, please enter again" + "\u001b[0m");
                }
            }
            while (m < 0);

            if (n > m){
                System.out.println("\u001b[31m"+"Err: m must be greater than n, please enter again: " + "\u001b[0m");
            }
        }
        while (n > m);
        System.out.println("string: " + string.substring(n, m));

    }
}


