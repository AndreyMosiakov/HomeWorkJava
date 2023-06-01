package HW1;

import java.util.Scanner;
public class Task3_Calc {
    public static void main(String[] args) {
        double result;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scan.nextDouble();
        System.out.print("Выберите действие(+, -, *, /): ");
        char op = scan.next().charAt(0);
        System.out.print("Введите второе число: ");
        double num2 = scan.nextDouble();
        switch (op) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println("Введите правильный оператор");
                return;
            }
        }
        System.out.printf("Результат вычисления :"+num1 + " " + op + " " + num2 + " = " + result);
    }
}