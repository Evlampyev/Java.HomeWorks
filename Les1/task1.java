import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
public class task1 {

    public static void main(String[] args) {
        System.out.println("Введите n");
        Scanner scan = new Scanner(System.in); //открытие сканера для считвания вводимых данных
        Integer n = scan.nextInt(); // Считывание введенного значения в переменную
        scan.close();
        Integer total = 0; // С большой буквы это обертка = класс, передается ссылкой
        int fact = 1; // с маленькой буквы - это примитив, передается значением
        for (int i = 1; i < n+1; i++) {
            total = total + i;
            fact = fact * i;
        }
        System.out.println(total);
        System.out.println(fact);


    }
}