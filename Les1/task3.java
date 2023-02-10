
// Реализовать простой калькулятор (+ - / *)
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        String operation = scan.next();
        int second = scan.nextInt();
        scan.close();
        System.out.println(operation);
        int rezult = 0;
        switch (operation) {
            case "+":
                rezult = first + second;
                break;
            case "-":
                rezult = first - second;
                break;
            case "/":
                rezult = first / second;
                break;
            case "*":
                rezult = first * second;
                break;
        }
        System.out.println(rezult);
    }

}
