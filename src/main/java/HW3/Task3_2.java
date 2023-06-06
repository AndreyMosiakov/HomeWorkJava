package HW3;

/*Задание
        2) Найти минимальное значение
        3) Найти максимальное значение
        4) Найти среднее значение*/

import java.util.*;


public class Task3_2 {
    static Random random = new Random();
    static List<Integer> ints = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ints.add(random.nextInt(11));
            System.out.print(ints.get(i) + " ");
        }
        System.out.println(" ");
        System.out.print("Максимальное значение в списке "+ Collections.max(ints));
        System.out.println(" ");
        System.out.print("Минимальное значение в списке "+ Collections.min(ints));
        System.out.println(" ");

        IntSummaryStatistics stats = ints.stream()//  вычисляет все значения , в том числее и среднее арифметическое.
                .mapToInt((x) -> x)
                .summaryStatistics();
        System.out.println(stats);
    }

}