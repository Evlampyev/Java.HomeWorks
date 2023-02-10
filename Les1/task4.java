import java.util.HashSet;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.print("Введите выражение через пробел, знаки '?' допускаются до знака '=': ");
        Scanner scan = new Scanner(System.in);
        String example = scan.nextLine();
        scan.close();
        String[] exampleLst = example.split(" ", 0);
        int[] firstnum = reset(exampleLst[0]);
        int[] secondnum = reset(exampleLst[2]);
        int result = Integer.parseInt(exampleLst[4]);
        String answer = "";
/*         System.out.println(result); */
        HashSet<String> set = new HashSet<String>();
        for (int k1 = 0; k1 < 10; k1++) {
            for (int m1 = 0; m1 < 10; m1++) {
                for (int k2 = 0; k2 < 10; k2++) {
                    for (int m2 = 0; m2 < 10; m2++) {
                        int newfirst = firstnum[0] + firstnum[1] / 10 * k1 * 10 + firstnum[1] % 10 * m1;
                        int newsecond = secondnum[0] + secondnum[1] / 10 * k2 * 10 + secondnum[1] % 10 * m2;
                        if (newfirst + newsecond == result) {
                            answer = Integer.toString(newfirst) + " + " + Integer.toString(newsecond) + " = "
                                    + Integer.toString(result);
                            set.add(answer);
                        }
                    }

                }

            }
        }
        String[] myArray = {};
        myArray = set.toArray(new String[set.size()]);
        if (myArray.length == 0) {
            System.out.println("Нет корней");
        } else {
            for (int i = 0; i < myArray.length; i++) {
                System.out.println(myArray[i]);
            }
        }

    }

    public static int[] reset(String text) {
        int[] array = { 0, 0 }; // 0 - число , 2 - налиие ?
        char first = text.charAt(0);
        char second = text.charAt(1);
        if (first == '?' && second != '?') {
            array[0] = Character.getNumericValue(second);
            array[1] = 10;
        } else if (first == '?' && second == '?') {
            array[0] = 0;
            array[1] = 11;
        } else if (first != '?' && second == '?') {
            array[0] = Character.getNumericValue(first) * 10;
            array[1] = 1;
        } else {
            array[0] = Integer.parseInt(text);
            array[1] = 0;
        }
        /*
         * System.out.println(array[0]);
         * System.out.println(array[1]);
         */

        return array;
    }
}
