package HW5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true){
        System.out.println("для ввода данных нажмите 1 , для печати 2");
        int choice = scanner.nextInt();
        if (choice ==1){
            System.out.println("введите имя");
            String name = scanner.next();
            System.out.println("введите номер телефона");
            String number = scanner.next();
            phoneBook.setContacts (name, number);

        }else {
            if (choice == 2){
                phoneBook.printContacts();
            }
        }


        }
    }
}
