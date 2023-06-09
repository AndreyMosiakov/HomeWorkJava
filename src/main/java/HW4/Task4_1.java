package HW4;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
import static java.util.Collections.reverse;

public class Task4_1 {
    static Random random = new Random();
    private static List<Integer> ints = new LinkedList<>();

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            ints.add(random.nextInt(11));
            System.out.print(ints.get(i) + " ");

        }
        System.out.println(" ");
        Collections.reverse(ints);
        System.out.print(ints);
    }
}






