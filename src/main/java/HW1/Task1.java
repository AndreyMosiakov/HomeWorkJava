package HW1;
// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num = scan.nextInt();
        scan.close();
        int result = (num * (num + 1)) / 2;
        System.out.println("Треугольное число: "+result);
    }

}
