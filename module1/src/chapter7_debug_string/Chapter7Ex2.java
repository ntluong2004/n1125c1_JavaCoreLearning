package chapter7_debug_string;

public class Chapter7Ex2 {
//    a. Chuyển đổi String thành int
//    b. Chuyển đổi int thành String
//    c. Chuyển đổi String thành long
//    d. Chuyển đổi long thành String
//    e. Chuyển đổi String thành float
//    f. Chuyển đổi float thành String
//    g. Chuyển đổi String thành double
//    h. Chuyển đổi double thành String
//    i. Chuyển đổi String thành short
//    k. Chuyển đổi short thành String


    static void main() {
        //    a. Chuyển đổi String thành int
        String a = new String("24");
        System.out.println("QUESTION A");
        System.out.println("type of string before convert: " + a.getClass().getSimpleName());
        System.out.println("type of string after convert:");

//        case 1: use Integer.parseInt(String s)
        int aInt1 = Integer.parseInt(a);
        System.out.println("Case 1. Type of data: " + ((Object) aInt1).getClass().getSimpleName()); //((Object)soNguyen).getClass().getSimpleName());

//        case 2: Use Integer.valueOf(String s)
        int aInt2 = Integer.valueOf(a);
        System.out.println("Case 2.Type of data: " + ((Object) aInt2).getClass().getSimpleName()); //((Object)soNguyen).getClass().getSimpleName());


//    b. Chuyển đổi int thành String
        System.out.println("QUESTION B");
        int b = 24;
        System.out.println("type of string before convert: " + ((Object) b).getClass().getSimpleName());
        System.out.println("type of string after convert:");

//    case 1: use String.valueOf(int i)
        String bString1 = String.valueOf(b);
        System.out.println("Case 1: type of string after convert: " + bString1.getClass().getSimpleName());

//        case 2: use Integer.toString()
        String bString2 = Integer.toString(b);
        System.out.println("Case 2: type of string after convert: " + bString2.getClass().getSimpleName());


//    c. Chuyển đổi String thành long
        System.out.println("QUESTION C");
        String c = "24";
        System.out.println("type of string before convert: " + c.getClass().getSimpleName());

//    case1: use parse
        long cLong1 = Long.parseLong(c);
        System.out.println("Case 1: type of string after convert: " + ((Object) cLong1).getClass().getSimpleName());
//    case1: use valueOf
        long cLong2 = Long.valueOf(c);
        System.out.println("Case 1: type of string after convert: " + ((Object) cLong2).getClass().getSimpleName());


//    d. Chuyển đổi long thành String
        System.out.println("QUESTION D");
        long d = 24;
        System.out.println("type of string before convert: " + ((Object) d).getClass().getSimpleName());

//    case1: use parse
        String dLong1 = String.valueOf(d);
        System.out.println("Case 1: type of string after convert: " + ((Object) dLong1).getClass().getSimpleName());
//    case1: use valueOf
        String dLong2 = Long.toString(d);
        System.out.println("Case 1: type of string after convert: " + ((Object) dLong2).getClass().getSimpleName());


//    e. Chuyển đổi String thành float
        System.out.println("QUESTION E");
        String e = "24";
        System.out.println("type of string before convert: " + e.getClass().getSimpleName());
//    case1: use parse
        float eFloat1 = Float.parseFloat(e);
        System.out.println("Case 1: type of string after convert: " + ((Object) eFloat1).getClass().getSimpleName());
//    case1: use valueOf
        float eFloat2 = Float.valueOf(e);
        System.out.println("Case 1: type of string after convert: " + ((Object) eFloat2).getClass().getSimpleName());


// f. Chuyển đổi float thành String: Sử dụng phương thức String.valueOf(float f) hoặc Float.toString(float f).
        System.out.println("QUESTION F");
        float f = 24;
        System.out.println("type of string before convert: " + ((Object) f).getClass().getSimpleName());

        String fFloat1 = String.valueOf(f);
        System.out.println("Case 1: type of string after convert: " + ((Object) fFloat1).getClass().getSimpleName());

        String fFloat2 = Float.toString(f);
        System.out.println("Case 2: type of string after convert: " + ((Object) fFloat2).getClass().getSimpleName());

//        g. Chuyển đổi String thành double: Sử dụng phương thức Double.parseDouble(String s) hoặc Double.valueOf(String s).
        System.out.println("QUESTION G");
        String g = "24";
        System.out.println("type of string before convert: " + ((Object) g).getClass().getSimpleName());

//        Case 1:
        double gDouble1 = Double.parseDouble(g);
        System.out.println("Case 1: type of string after convert: " + ((Object) gDouble1).getClass().getSimpleName());

//        Case 2:
        double gDouble2 = Double.valueOf(g);
        System.out.println("Case 2: type of string after convert: " + ((Object) gDouble2).getClass().getSimpleName());


//        h. Chuyển đổi double thành String: Sử dụng phương thức String.valueOf(double d) hoặc Double.toString(double d).
        System.out.println("QUESTION H");
        double h = 24;
        System.out.println("type of string before convert: " + ((Object) h).getClass().getSimpleName());

//    Case 1:
        String hDouble1 = String.valueOf(h);
        System.out.println("Case 1: type of string after convert: " + hDouble1.getClass().getSimpleName());

//        Case2:
        String hDouble2 = Double.toString(h);
        System.out.println("Case 2: type of string after convert: " + hDouble2.getClass().getSimpleName());


//            i. Chuyển đổi String thành short: Sử dụng phương thức Short.parseShort(String s) hoặc Short.valueOf(String s).

        System.out.println("QUESTION I");
        String i = "24";
        System.out.println("type of string before convert: " + ((Object) i).getClass().getSimpleName());

//        case 1:
        short iShort1 = Short.parseShort(i);
        System.out.println("Case 1: type of string after convert: " + ((Object) iShort1).getClass().getSimpleName());

//        Case 2:
        short iShort2 = Short.valueOf(i);
        System.out.println("Case 2: type of string after convert: " + ((Object) iShort2).getClass().getSimpleName());


//    k. Chuyển đổi short thành String: Sử dụng phương thức String.valueOf(short s) hoặc Short.toString(short s).
        System.out.println("QUESTION K");
        short k = 24;
        System.out.println("type of string before convert: " + ((Object) k).getClass().getSimpleName());

//        Case 1
        String kShort1 = String.valueOf(k);
        System.out.println("Case 1: type of string after convert: " + kShort1.getClass().getSimpleName());

//        Case 2
        String kShort2 = Short.toString(k);
        System.out.println("Case 2: type of string after convert: " + kShort2.getClass().getSimpleName());

    }
}
