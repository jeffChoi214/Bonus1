import java.util.Scanner;

/**
 * Created by hyunchoi on 1/30/17.
 */
public class main {
    public static char convertGrade(int grade) {
        if (grade >= 0 && grade <= 60) {
            return 'F';
        }
        else if (grade >= 60 && grade <= 66) {
            return 'D';
        }
        else if (grade >= 67 && grade <= 79) {
            return 'C';
        }
        else if (grade >= 80 && grade <= 87) {
            return 'B';
        }
        else {
            return 'A';
        }
    }

    // does not display if char extendChar??
    public static String extraChar(int grade) {
        if (grade <= 60) {
            return "";
        }
        else {
            if ((grade % 10 >= 7) && (grade % 10 <= 9)) {
                return "+";
            }
            else if ((grade % 10 >= 0) && (grade % 10 <= 3)) {
                return "-";
            }
            else {
                return "";
            }

        }
    }

    public static void main (String[] args) {
        int grade;
        char doContinue;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Letter Grade Converter!");

        while (true) {
            System.out.print("Enter a numerical grade between 0-100: ");

            while (!sc.hasNextInt()) {
                System.out.println("Please enter a numerical grade!");
                sc.next();
            }

            grade = sc.nextInt();

            while (grade < 0 || grade > 100) {
                System.out.println("Please enter a grade between 0-100!");
                grade = sc.nextInt();
            }

            System.out.println("Letter Grade: " + convertGrade(grade) + extraChar(grade));
            System.out.print("Continue? (y/n): ");
            doContinue = sc.next().charAt(0);

            if (doContinue == 'n' || doContinue == 'N') {
                break;
            }
            else if (doContinue == 'y' || doContinue == 'Y') {
                // do nothing keep looping
            }
            else {
                System.out.println("Provided wrong input, exiting program.");
                break;
            }
        }

        System.out.println("Exiting program...");
    }
}
