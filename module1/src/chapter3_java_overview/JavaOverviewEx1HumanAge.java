import java.util.Scanner;
import java.time.Year;

    static void main() {
        int currentYear = Year.now().getValue();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your year of birth");
        int yearOfBirth = sc.nextInt();

        System.out.println("Your age: " + (currentYear - yearOfBirth));
    }
