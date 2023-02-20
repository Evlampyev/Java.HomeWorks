/* Пусть дан произвольный список целых чисел, удалить из него четные числа */

package Les3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Количество элементов в массиве: ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        ArrayList<Integer> list = new ArrayList<>();
        list = getRandomArray(N);
        list = delElement(list);
        System.out.println();
        for (int x : list) {
            System.out.print(x + " ");
        }
            
        }
    

    public static ArrayList<Integer> getRandomArray(int n) {
        ArrayList<Integer> lst = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            lst.add(rnd.nextInt(20));
            System.out.print(lst.get(i) + " ");
        }
        return lst;
    }

    public static ArrayList<Integer> delElement(ArrayList<Integer> lst) {
        for (int i = 0; i < lst.size(); i++) {
            Integer x = lst.get(i);
            if (x % 2 == 0) {
                lst.remove(i);
                i--;
            }
        }
        return lst;
    }
}