package HW6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop("Xiaomi", "black", 1111);
        lap1.setHDD(700);
        lap1.setOS("Windows");
        lap1.setRAM(8);

        Laptop lap2 = new Laptop("Acer", "white", 2222);
        lap2.setHDD(1000);
        lap2.setOS("Linux");
        lap2.setRAM(16);

        Laptop lap3 = new Laptop("Apple", "pink", 3333);
        lap3.setHDD(900);
        lap3.setOS("macOS");
        lap3.setRAM(32);

        Laptop lap4 = new Laptop("HP", "silver", 4444);
        lap4.setHDD(500);
        lap4.setOS("Windows");
        lap4.setRAM(8);


        HashSet<Laptop> laptops = new HashSet<>(Arrays.asList(lap1, lap2, lap3, lap4));
        HashSet<Laptop> result = new HashSet<>();


        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while (n != 5) {
            if (n == 1) {
                System.out.println("Введите минимальную оперативную память");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("RAM", temp);
            }
            if (n == 2) {
                System.out.println("Введите минимальный объем ЖД");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("HDD", temp);
            }
            if (n == 3) {
                System.out.println("Введите ОС");
                String temp = sc.nextLine();
                filters.put("OS", temp);
            }
            if (n == 4) {
                System.out.println("Введите цвет");
                String temp = sc.nextLine();
                filters.put("color", temp);
            }
            System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
            n = sc.nextInt();
            sc.nextLine();
        }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if (entry.getKey().equals("RAM")) {
                for (Laptop lap : laptops) {
                    if (lap.getRAM() >= (Integer) entry.getValue()) {
                        result.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("HDD")) {
                for (Laptop lap : laptops) {
                    if (lap.getHDD() >= (Integer) entry.getValue()) {
                        result.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("OS")) {
                for (Laptop lap : laptops) {
                    if (lap.getOS().equals(entry.getValue())) {
                        result.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("color")) {
                for (Laptop lap : laptops) {
                    if (lap.getColor().equals(entry.getValue())) {
                        result.add(lap);

                    }
                }
            }
        }

        for (Laptop lap : result) {
            System.out.println(lap.toString());
            System.out.println();
        }


    }
}