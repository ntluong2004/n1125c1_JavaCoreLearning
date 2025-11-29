package Chapter3_JavaOverview;

public class JavaOverView_Ex7_aijValue {

    public static int questionA(int i, int j){
        return i++ + j++;
    };

    public static int questionB(int i, int j){
        return i++ + ++j;
    };

    public static int questionC(int i, int j){
        return ++i + j++;
    };

    public static int questionD(int i, int j){
        return ++i + ++j;
    };

    public static int questionE(int i, int j){
        return i++ + j++ + i++ + j++;
    };

    public static int questionF(int i, int j){
        return ++i + ++j + i++ + j++;
    };

    public static int questionG(int i){
        return i++ + ++i - i-- - --i;
    };

    public static int questionH(int a){
        return a += a++ + ++a;
    };

    static void main(String[] args) {
        int a, i = 1, j = 1;

        a = questionA(i, j);
        System.out.println("questionA(i++ + j++) = " + a);

        a = questionB(i, j);
        System.out.println("questionB(i++ + ++j) = " + a);

        a = questionC(i, j);
        System.out.println("questionC(++i + j++) = " + a);

        a = questionD(i, j);
        System.out.println("questionD(++i + ++j) = " + a);

        a = questionE(i, j);
        System.out.println("questionE(i++ + j++ + i++ + j++) = " + a);

        a = questionF(i, j);
        System.out.println("questionF(++i + ++j + i++ + j++) = " + a);

        a = questionG(i);
        System.out.println("questionG(i++ + ++i - i-- - --i) = " + a);

        a = questionH(10);
        System.out.println("questionH(a += a++ + ++a) = " + a);
    }
}
