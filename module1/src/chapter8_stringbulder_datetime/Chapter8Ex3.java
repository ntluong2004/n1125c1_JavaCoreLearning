package chapter8_stringbulder_datetime;

public class Chapter8Ex3 {
//        a. Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới:
//        byte⤍short⤍int⤍long⤍float⤍double
//    b. Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới:
//        double⤍float⤍long⤍int⤍short⤍byte
//    c. Cho các ví dụ về ép kiểu mà độ chính xác bị thay đổi, như thứ tự bên dưới:
//        double⤍float⤍long⤍int⤍short⤍byte
//    d. Phân biệt ép kiểu tường minh và ép kiểu ngầm định
//    e. Khi nào cần dùng các ký tự L, F, D… sau các số nguyên, số thực trong Java? Khi nào thì không cần dùng đến các ký tự này mà Java vẫn tự hiểu được các số thuộc kiểu dữ liệu gì?

    static void main() {
//        a. Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới byte⤍short⤍int⤍long⤍float⤍double:

        System.out.println("CÂU A");

// 1. Khởi tạo giá trị ban đầu là kiểu byte
        byte byteValue = 100;
        System.out.println("1. Giá trị ban đầu (byte): " + byteValue);

        // 2. Ép kiểu từ byte -> short
        System.out.println("2. Ép kiểu sang short: " + (short) byteValue);

        // 3. Ép kiểu từ short -> int
        int intValue = (short) byteValue;
        System.out.println("3. Ép kiểu sang int: " + intValue);

        // 4. Ép kiểu từ int -> long
        System.out.println("4. Ép kiểu sang long: " + (long) intValue);

        // 5. Ép kiểu từ long -> float (Lưu ý trường hợp này chỉ được dùng với số nhỏ vì thực chất phạm vi của long lớn hơn float. Float chỉ dùng 24bit (23bit lu trữ + 1 bit ngầm)
//      vậy nên khi số long vượt quá 2 mũ 24 thì sẽ bị làm tròn để vừa với 24 bit của float
        float floatValue = (long) intValue;
        System.out.println("5. Ép kiểu sang float: " + floatValue);

        // 6. Ép kiểu từ float -> double
        System.out.println("6. Ép kiểu sang double: " + (double) floatValue);


//        b. Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới:
//        double⤍float⤍long⤍int⤍short⤍byte

        System.out.println("CÂU B");
        double doubleValue = 101.0;
        System.out.println("1. Giá trị ban đầu (double): " + doubleValue);
//        2. Ép kiểu từ double -> float
        float floatValue1 = (float) doubleValue;
        System.out.println("2. Ép kiểu sang float: " + floatValue);

//        // 3. Ép kiểu từ float -> long (Mất phần thập phân .0)
        long longValue1 = (long) floatValue1;
        System.out.println("3. Ép kiểu sang long: " + longValue1);

        // 4. Ép kiểu từ long -> int
        int intValue1 = (int) longValue1;
        System.out.println("4. Ép kiểu sang int: " + intValue1);

// 5. Ép kiểu từ int -> short
        short shortValue1 = (short) intValue1;
        System.out.println("5. Ép kiểu sang short: " + shortValue1);

// 6. Ép kiểu từ short -> byte
        byte byteValue1 = (byte) intValue1;
        System.out.println();
        System.out.println("6. Ép kiểu sang byte: " + byteValue1);

//    c. Cho các ví dụ về ép kiểu mà độ chính xác bị thay đổi, như thứ tự bên dưới:
//        double⤍float⤍long⤍int⤍short⤍byte
        System.out.println("CÂU C");

        // 1. Giá trị double ban đầu
        double doubleValue3 = 123456789.123456789;
        System.out.println("1. Giá trị ban đầu (double): " + doubleValue3);

        // 2. Ép kiểu từ double -> float
        float floatValue3 = (float) doubleValue3;
        System.out.println("2. Ép kiểu sang float: " + floatValue3);

        // 3. Ép kiểu từ float -> long
        long longValue3 = (long) floatValue3;
        System.out.println("3. Ép kiểu sang long: " + longValue3);

        // 4. Ép kiểu từ long -> int (Mất dữ liệu do TRÀN SỐ)
        long largeLong3 = 3000000000L; // 3 tỷ
        int intValue3 = (int) largeLong3;
        System.out.println("4. Ép kiểu long (3 tỷ) -> int: " + intValue3); // Kết quả sẽ là số âm do tràn bit

        // 5. Ép kiểu từ int -> short (Mất dữ liệu do TRÀN SỐ)
        int largeInt3 = 40000;
        short shortValue3 = (short) largeInt3;
        System.out.println("5. Ép kiểu int (40000) -> short: " + shortValue3); // Kết quả sai do tràn bit

        // 6. Ép kiểu từ short -> byte (Mất dữ liệu do TRÀN SỐ)
        short largeShort3 = 200;
        byte byteValue3 = (byte) largeShort3;
        System.out.println("6. Ép kiểu short (200) -> byte: " + byteValue3); // Kết quả sai do tràn bit

/**TRẢ LỜI CÂU d. Ép kiểu ngầm định là quá trình máy tính tự động thực hiện khi dđổi từ kiểu dữ liệu nhỏ hn sang kiểu dữ liệu lớn hơn
 * Ngược lại ép kiểu tunh là quá trình chúng ta cần chỉ định rõ kiểu dữ liệu cần chuyển đổi, dùng khi ép từ kiểu dữ liệu lớn sang kiểu nhỏ hơn**/

/** Trả lời câu e.  vì thứ tự chạy của câu lệnh nên chương trình sẽ nhận định các giá trị soó nguyên là int và số thực là double, điều này có thể gây ảnh hưởng tới nếu giá trị đó vượt ngoài phạm vi int,
 * hoặc gây sai lệch kiểu dữ liệu đã khai báo, việc sử dụng L, F, D là để thông báo cho chương trình đây là kiểu dữ liệu nào vd, F = float
 * **/

    }
}
