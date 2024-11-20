import java.util.Scanner;

public class Calculations {

    static String add(String a, String b) {

        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);

        double c = number1 + number2;
        return String.valueOf(c);
    }


    static String subtract(String a, String b) {

        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);

        double c = number1 - number2;
        return String.valueOf(c);
    }

    static String multiply(String a, String b) {

        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);

        double c = number1 * number2;
        return String.valueOf(c);
    }

    static String divide(String a, String b) {

        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);
       
        while (number2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a new non-zero value for the divisor: ");
            number2 = input.nextDouble();
        }

        double c = number1 / number2;
        return String.valueOf(c);
    }

    static String power(String a, String b) {

        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);

        double constant = number1;

        while (number2 != 1) {
            number1 = number1 * constant;
            number2 -= 1;
        }
        return String.valueOf(number1);
    }
}


