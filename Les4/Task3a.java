package Les4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task3a {
    public static void main(String[] args) {
        System.out.println("$ - закончить работу с калькулятором");
        System.out.println("# - отмена последней операции");
        LinkedList<String> list = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        Integer rezult = 0;
        list.add(scan.nextLine());
        int last = 0;
        boolean flag = true;
        while (flag) {
            list.add(scan.nextLine());
            last++;
            if (list.get(last).equals("$") ) {
                flag = false;
            } else if (list.get(last).equals("#")) {
                String x = list.remove(last);
                while (!(x.equals("*")) & !(x.equals("/")) & !(x.equals("+")) & !(x.equals("-"))) {
                    last--;
                    x = list.remove(last);
                }
                /* last--;
                x = list.remove(last); */
                last--;
                System.out.println(list.get(last));
            } else {
                list.add(scan.nextLine());
                last++;
                System.out.println("=");
                list.add("=");
                last++;
                switch (list.get(last - 2)) {
                    case "+":
                        rezult = Integer.parseInt(list.get(last - 3)) + Integer.parseInt(list.get(last - 1));
                        break;
                    case "-":
                        rezult = Integer.parseInt(list.get(last - 3)) - Integer.parseInt(list.get(last - 1));
                        break;
                    case "/":
                        rezult = Integer.parseInt(list.get(last - 3)) / Integer.parseInt(list.get(last - 1));
                        break;
                    case "*":
                        rezult = Integer.parseInt(list.get(last - 3)) * Integer.parseInt(list.get(last - 1));
                        break;
                }
                System.out.println(rezult);
                list.add(Integer.toString(rezult));
                last++;
            }

        }
    }
}
