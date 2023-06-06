package HW3;
/*Задание
        Пусть дан произвольный список целых чисел.

        1) Нужно удалить из него чётные числа
        2) Найти минимальное значение
        3) Найти максимальное значение
        4) Найти среднее значение*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Task3_1 {
    static Random random = new Random();
    static List<Integer> ints = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ints.add(random.nextInt(11));
            System.out.print(ints.get(i)+ " " );

        }
        System.out.println(" ");
        for (int i = ints.size() -1; i >=0 ; i--) {
            if (ints.get(i) % 2 ==0){
                ints.remove(i);

            }

        }
        System.out.println("Список с удаленными четными числами: "+ints);


        //Collections.sort(ints);
        //System.out.print(ints);
    }
}