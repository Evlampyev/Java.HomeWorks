/* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Добавить функции 
    1) Добавление номера
    2) Вывод всего */

package Les5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String s = new String();
        boolean flag = true;
        while (flag) {
            System.out.println("Ваш выбор: ");
            System.out.println("0. Выход ");
            System.out.println("1. Добавить запись");
            System.out.println("2. Просмотр справочника");
            s = sc.nextLine();
            switch (s) {
                case "0":
                    flag = false;
                    break;
                case "1":
                    System.out.print("Номер телефона: ");
                    String tel = sc.nextLine();
                    System.out.print("Фамилия: ");
                    String name = sc.nextLine();
                    map.put(tel, name);
                    break;
                case "2":
                    System.out.println("--- Телефонный справочник ---");
                    for (var el : map.entrySet()) {
                        System.out.println(el.getValue() + " " + el.getKey());
                    }
                    System.out.println("------------------------------");
                    break;
            }
        }
        sc.close();
    }
}