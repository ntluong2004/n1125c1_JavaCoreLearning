package chapter8_stringbulder_datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Chapter8Ex2 {
//     a. Chuyển chuỗi "02/28/2023" sang kiểu java.util.Date.
//    b. Chuyển ngày hiện tại (của hệ thống) đang ở kiểu java.util.Date sang kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình.
//    c. Chuyển chuỗi "02/28/2023" sang kiểu LocalDate.
//    d. Chuyển ngày hiện tại (của hệ thống) đang ở kiểu LocalDate sang kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình.
//    e. Lấy ngày, tháng, năm, giờ, phút, giây hiện tại của hệ thống.
//    f. Hãy cho biết 1 tháng sau (tính từ ngày hiện tại) sẽ rơi vào thứ mấy trong tuần, và cách ngày hiện tại bao nhiêu ngày?
//        Gợi ý: nếu ngày hiện tại là ngày 26/6 thì 1 tháng sau được hiểu là ngày 26/7 (giữ nguyên ngày, tăng 1 tháng).
//    g. Hãy cho biết cách đây 1000 ngày (tính từ ngày hiện tại) là ngày tháng năm nào?
//    h. Hãy nhập vào 2 String có định dạng là dd/MM/yyyy. Hãy chuyển thành 2 biến kiểu LocalDate. Sau đó hãy tính số ngày chênh lệch giữa 2 ngày đã nhập vào.
//    i. Hãy nhập vào 1 String có định dạng là dd/MM/yyyy. Sau đó, nhập vào số tự nhiên n. Hãy in ra ngày đứng sau ngày đã nhập n ngày.


    static void main() throws ParseException {
//        a. Chuyển chuỗi "02/28/2023" sang kiểu java.util.Date.
        String a = "02/28/2023";
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date aDate = sdf.parse(a);

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("The date is " + sdf2.format(aDate));


//    b. Chuyển ngày hiện tại (của hệ thống) đang ở kiểu java.util.Date sang kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình.
        Date bCurrentDate = new Date();

        SimpleDateFormat bSdf = new SimpleDateFormat("dd/MM/yyyy");

        String FormattedDate = bSdf.format(bCurrentDate);
        System.out.println("The date is " + FormattedDate);


        //    c. Chuyển chuỗi "02/28/2023" sang kiểu LocalDate.
        String c = "02/28/2023";
        DateTimeFormatter cSdf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate cLocalDate = LocalDate.parse(c, cSdf);
        System.out.println("The date is " + cLocalDate);


        //    d. Chuyển ngày hiện tại (của hệ thống) đang ở kiểu LocalDate sang kiểu String theo đinh dạng dd/MM/yyyy và hiển thị ra màn hình.
        LocalDate dLocalDate = LocalDate.now();
        DateTimeFormatter dSdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dFormatted = dLocalDate.format(dSdf);

        System.out.println("The date now: " + dLocalDate);
        System.out.println("The date formatted: " + dFormatted);


//        e. Lấy ngày, tháng, năm, giờ, phút, giây hiện tại của hệ thống.
        LocalDateTime eLocalDate = LocalDateTime.now();

        System.out.println(eLocalDate.getDayOfMonth() + "/" + eLocalDate.getMonthValue() + "/" + eLocalDate.getYear());
        System.out.println(eLocalDate.getHour() + "/" + eLocalDate.getMinute() + "/" + eLocalDate.getSecond());


//        f. Hãy cho biết 1 tháng sau (tính từ ngày hiện tại) sẽ rơi vào thứ mấy trong tuần, và cách ngày hiện tại bao nhiêu ngày?
        LocalDate fLocalDate = LocalDate.now();
        LocalDate fNextMonth = fLocalDate.plusMonths(1);

        System.out.println("The date now: " + fLocalDate);
        System.out.println("The date of next month: " + fNextMonth);

        DayOfWeek fDayOfWeek = fLocalDate.getDayOfWeek();
        DayOfWeek fDayOfWeekNextMonth = fNextMonth.getDayOfWeek();
        System.out.println("The date of week now: " + fDayOfWeek);
        System.out.println("The date of week of next month: " + fDayOfWeekNextMonth);

        long daysBetween = fLocalDate.until(fNextMonth, ChronoUnit.DAYS);
        System.out.println("The number of days between two dates: " + daysBetween);


//        g. Hãy cho biết cách đây 1000 ngày (tính từ ngày hiện tại) là ngày tháng năm nào?
        LocalDate gLocalDate = LocalDate.now();
        LocalDate gOldDay = gLocalDate.minusDays(1000);

        System.out.println("The date after reduce 1000 days: " + gOldDay);

//         h. Hãy nhập vào 2 String có định dạng là dd/MM/yyyy. Hãy chuyển thành 2 biến kiểu LocalDate. Sau đó hãy tính số ngày chênh lệch giữa 2 ngày đã nhập vào.
        String h1 = "28/02/2023";
        String h2 = "28/02/2025";

        DateTimeFormatter hDtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate h3 =  LocalDate.parse(h1, hDtf);
        LocalDate h4 =  LocalDate.parse(h2, hDtf);
        long daysBetween2 = h3.until(h4, ChronoUnit.DAYS);
        System.out.println("The number of days between two dates: " + Math.abs(daysBetween2));


//        i. Hãy nhập vào 1 String có định dạng là dd/MM/yyyy. Sau đó, nhập vào số tự nhiên n. Hãy in ra ngày đứng sau ngày đã nhập n ngày.
        String i = "28/02/2023";
        int n;
        Scanner input = new Scanner(System.in);

        DateTimeFormatter iFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate i1 = LocalDate.parse(i,iFormatter);
do {
    System.out.println("Enter n: ");
    n = input.nextInt();
if (n < 0){
    System.out.println("/u001[31m" + "n is small less than 0, please try again"+ "/u001[0m");
}
}
while (n < 0);

        System.out.println("The day after add n days: " + i1.plusDays(n));

    }
}
