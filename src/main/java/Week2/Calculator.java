package Week2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Elige tu operación (+, -, *): ");
        String operation = sc.nextLine();

        System.out.print("Ingresa el primer número: ");
        double firstNumber = sc.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double secondNumber = sc.nextDouble();

        double result;

        if (operation.equals("s")) {
            result = addvalue(firstNumber, secondNumber);
        } else if (operation.equals("r")) {
            result = subvalue(firstNumber, secondNumber);
        } else if (operation.equals("m")) {
            result = multivalue(firstNumber, secondNumber);
        } else {
            System.out.println("Operación inválida.");
            sc.close();
            return;
        }

        System.out.println("Resultado: " + result);
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