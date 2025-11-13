package week2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculator {
    private static Logger logger = Logger.getLogger(Calculator.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        logger.info("Choose your operation (sum, res, mul): ");
        String operation = sc.nextLine();

        logger.info("Enter the first number: ");
        double firstNumber = sc.nextDouble();

        logger.info("Enter the second number: ");
        double secondNumber = sc.nextDouble();

        double result;

        if (operation.equals("sum")) {
            result = addvalue(firstNumber, secondNumber);
        } else if (operation.equals("res")) {
            result = subvalue(firstNumber, secondNumber);
        } else if (operation.equals("mul")) {
            result = multivalue(firstNumber, secondNumber);
        } else {
            logger.warning("Invalid operation.");
            sc.close();
            return;
        }

        logger.log(Level.INFO,"Result: {0}" , result);
        sc.close();
    }

    public static double addvalue(double num1, double num2) {
        return num1 + num2;
    }

    public static double subvalue(double num1, double num2) {
        return num1 - num2;
    }

    public static double multivalue(double num1, double num2) {
        return num1 * num2;
    }
}