package HW4;

import java.util.*;

public class Task4_2 {
    static Random random = new Random();

    static LinkedList<Integer> ints = new LinkedList<>();
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            ints.add(random.nextInt(11));
            System.out.print(ints.get(i) + " ");

        }
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите число: ");
            enqueue(ints, scan.nextInt());
            System.out.println(ints);
            System.out.println(dequeue(ints));
            System.out.println(ints);
            System.out.println(first(ints));
            System.out.println(ints);
            scan.close();
        }
        public static void enqueue(LinkedList<Integer> ints, int num){
            ints.add(num);
        }
        public static int dequeue(LinkedList<Integer> ints){
            int num = ints.getFirst();
            ints.removeFirst();
            return num;

        }
        public static int first(LinkedList<Integer> ints){
            return ints.getFirst();
        }
    }


