/* Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
 */
package Les2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введите строку для проверки: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        scan.close();
        System.out.println(polindrom(text));
    }

    public static boolean polindrom(String txt) {
        Boolean rezult = true;
        for (int i = 0; i < txt.length() / 2; i++) {
            if (txt.charAt(i) != txt.charAt(txt.length()-1-i))
                rezult = false;
        }
        return rezult;
    }
}
