package chapter8_stringbulder_datetime;

public class Chapter8Ex1 {
//    a. Cho chuỗi "Hello World"
//    Lấy ra chữ World bằng cách dùng StringBuffer và StringBuilder.

//b. Cho chuỗi "Hello World"
//    Thay o thành f bằng cách dùng StringBuffer và StringBuilder.
//
//c. Cho chuỗi "Hello" và chuỗi “World”
//    Nối 2 chuỗi này bằng cách dùng String, StringBuffer và StringBuilder.
//
//d. Đoạn code sau tạo ra bao nhiêu đối tượng và kết quả hiển thị là gì:
//e. Viết chương trình phân biệt sự khác nhau giữa so sánh bằng method equals và so sánh bằng toán tử == khi sử dụng String, StringBuffer và StringBuilder.


    static void main() {

        String str = "Hello World";

        //    a. Cho chuỗi "Hello World"
//    Lấy ra chữ World bằng cách dùng StringBuffer và StringBuilder.
        StringBuilder aSb = new StringBuilder(str);
        System.out.println(aSb.substring(6));

        StringBuffer aSbf = new StringBuffer(str);
        System.out.println(aSbf.substring(6));

//    b. Cho chuỗi "Hello World"
//    Thay o thành f bằng cách dùng StringBuffer và StringBuildẻ
        StringBuilder b = new StringBuilder(str);
        char bOldChar = 'o';
        char bNewChar = 'f';

        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == bOldChar) {
                b.setCharAt(i, bNewChar);
            }
        }
        System.out.println(b.toString());


        //    c. Cho chuỗi "Hello" và chuỗi “World”
//    Nối 2 chuỗi này bằng cách dùng String, StringBuffer và StringBuilder.
        StringBuilder c = new StringBuilder();
        c.append("Hello");
        c.append("World");

        System.out.println(c.toString());


////   d. Đoạn code sau tạo ra bao nhiêu đối tượng và kết quả hiển thị là gì:
//        String a = "A"; //tạo ra 1 đối tượng
//        String b = new String("A"); //tạo ra 1 đối tượng b = "A"
//        String c = "A"; //tạo ra 1 đối tượng c
//        b.concat("B"). // tạo ra 1 đối tượng với value = "AB
//                String d = c.concat("C"); // d = "AC"
//        StringBuffer e = new StringBuffer("E"); //tạo ra 1 đối tượng e = "E"
//        e.append("F"); //nối "F" vào đối tượng E, không tao ra đô tượng mơ
//        StringBuilder g = new StringBuilder("G"); // Tạo ra 1 đối tượng g = "G"
//        g.append("H"); //Nối "H" vào g, không tạo ra đối tượng mới
//        System.out.println(a + b + c + d + e + g); //Kết quả in ra AABAACEFGH


//e. Viết chương trình phân biệt sự khác nhau giữa so sánh bằng method equals và so sánh bằng toán tử == khi sử dụng String, StringBuffer và StringBuilder.
        String d1 = "Hello";
        String d2 = "Hello";
        String d3 = new String("Hello");

        System.out.println("d1 == d2 (String Pool): " + (d1 == d2)); //true cung dia chia trong pool
        System.out.println("d1.equals(d2): " + d1.equals(d2)); //true nooij dung giong nhau

        // 1b. So sánh giữa String Pool (s1) và Heap (s3)
        System.out.println("d1 == d3 (Heap vs Pool): " + (d1 == d3)); // false (Hai đối tượng khác nhau)
        System.out.println("d1.equals(d3): " + d1.equals(d3)); //true gia tri giong nhau


        // --- 2. STRINGBUFFER (Lớp KHÔNG ghi đè equals(), kế thừa từ Object) ---
        StringBuffer eSb1 = new StringBuffer("World");
        StringBuffer eSb2 = new StringBuffer("World");
        StringBuffer eSb3 = eSb1; // Tạo tham chiếu trỏ đến cùng đối tượng

        System.out.println("eSb1 == eSb2: " + (eSb1 == eSb2));       // false (Hai đối tượng khác nhau)
        System.out.println("eSb1.equals(eSb2): " + eSb1.equals(eSb2)); // false (Giống == vì KHÔNG ghi đè equals())

        // 2b. Cùng một đối tượng (sb3 = sb1)
        System.out.println("eSb1 == eSb3: " + (eSb1 == eSb3));       // true (Cùng một đối tượng)
        System.out.println("eSb1.equals(eSb3): " + eSb1.equals(eSb3)); // true (Giống == vì KHÔNG ghi đè equals())


        // --- 3. STRINGBUILDER (Lớp KHÔNG ghi đè equals(), kế thừa từ Object) ---
        StringBuilder sbld1 = new StringBuilder("Hello");
        StringBuilder sbld2 = new StringBuilder("Hello");

        // 3. Đối tượng khác nhau, nội dung giống nhau
        System.out.println("sbld1 == sbld2: " + (sbld1 == sbld2));     // false (Hai đối tượng khác nhau)
        System.out.println("sbld1.equals(sbld2): " + sbld1.equals(sbld2)); // false (Giống == vì KHÔNG ghi đè equals())
    }
}
