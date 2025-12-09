package chapter8_stringbulder_datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class main1 {
    static void main() throws ParseException {

        Scanner input = new Scanner(System.in);
        SimpleDateFormat sft = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("enter your birthday");
        Date date = sft.parse(input.nextLine());

        System.out.println("Your year old is: " + (Year.now().getValue() - (date.getYear() + 1900)));

        System.out.println("Your Birthday is: " + sft.format(date));

    }

}
