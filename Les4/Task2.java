/* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя. */
package Les4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.print("Текущая очередь: ");
        System.out.println(list);
        System.out.println("0. exit");
        System.out.println("1. enqueue()");
        System.out.println("2. dequeue()");
        System.out.println("3. enqueue()");
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        String s = new String();
        while (flag) {
            System.out.print("Выберете метод:");
            String Ss = scan.nextLine();
            switch (Ss) {
                case "1":
                    System.out.print("Что добавить: ");
                    int N = scan.nextInt();
                    s = scan.nextLine(); 
                    enqueue(list, N);
                    break;
                case "2":
                    dequeue(list);
                    break;
                case "3":
                    first(list);
                    break;
                case "0":
                    flag = false;
                    break;
                default:
                    break;
                }
            System.out.print("Новая очередь: ");
            System.out.println(list);
        }
        scan.close();

    }

    public static void enqueue(LinkedList lst, int n) {
        lst.add(n);
    }

    public static void dequeue(LinkedList lst) {
        System.out.println("Первый элемент был - " + lst.removeFirst());
    }

    public static void first(LinkedList lst) {
        System.out.println("Первый элемент - " + lst.get(0));
    }
}
