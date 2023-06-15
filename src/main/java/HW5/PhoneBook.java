package HW5;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private HashMap<String,List> contacts;

    public PhoneBook(){
        contacts = new HashMap<>();
    }

    public void setContacts(String name, String number) {
        List numbers;
        if(contacts.containsKey(name)) {
            numbers = contacts.get(name);
        }else{
            numbers = new ArrayList<>();
            contacts.put(name,numbers);
        }
        numbers.add(number);
    }
    public void printContacts(){
        for(String name : contacts.keySet()){
            System.out.print(name +": ");
            List numbers = contacts.get(name);
            for(Object number : numbers) {
                System.out.println(number + " ");
            }

        }

        System.out.println();
    }
}
