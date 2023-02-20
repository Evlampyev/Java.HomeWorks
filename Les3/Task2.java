
/* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка        
 */
package Les3;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int N = 10;
        list = getRandomArray(N);
        int max = 0;
        int min = 101;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            if (x > max) max = x;
            if (x < min) min = x;
            sum = sum + x;
        }
        System.out.println();
        System.out.print("Max = ");
        System.out.println(max);
        System.out.print("Min = ");
        System.out.println(min);
        System.out.print("Среднее арифметическое = ");
        System.out.println(sum/list.size());
    }

    public static ArrayList<Integer> getRandomArray(int n) {
        ArrayList <Integer> lst = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            lst.add(rand.nextInt(100));
            System.out.print(lst.get(i) + " ");
            }
        return lst;
        }
}
