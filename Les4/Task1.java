/* Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список. */
package Les4;

import java.util.LinkedList;
import java.util.Random;

/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list = getRandomList();
        System.out.println(list);
        LinkedList <String> newList = new LinkedList<>();
        newList =reverseList(list);
        System.out.println(newList);
    }


    public static LinkedList getRandomList() {
        Random rnd = new Random();
        LinkedList <Integer> lst = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            lst.add(rnd.nextInt(100));
        }
        return lst;
    }

    public static LinkedList reverseList(LinkedList lst) {
        LinkedList <String> newLst = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            newLst.add(lst.removeLast().toString());
        }
        return newLst;
    }
}