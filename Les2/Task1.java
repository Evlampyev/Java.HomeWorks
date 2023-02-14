package Les2;

import java.io.FileWriter;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = { 2, 5, 3, 7, 6, 1, 4, 7, 1};
        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(array));
        loggist(array);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] < array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    loggist(array);
                }
            }
        }
        System.out.print("Отсортированный массив: ");
        System.out.println(Arrays.toString(array));
    }

    public static void loggist(int[] array) {
        String file_name = "Les2/log.txt";
        try {
            FileWriter writer = new FileWriter(file_name, true);
            writer.write(Arrays.toString(array));
            writer.write("\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так?");
        }
    }
}
