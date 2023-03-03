package Les6;

import java.util.HashSet;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Nout nout1 = new Nout(1, 8, 500, "Windows 10", "Grey");
        HashSet<Nout> nouts = new HashSet<>();
        HashSet<String> noutColor = new HashSet<>();
        HashSet<String> noutOs = new HashSet<>();
        nouts.add(nout1);
        noutColor.add(nout1.getColor());
        noutOs.add(nout1.getOs());
        Nout nout2 = new Nout(2, 16, 1000, "Windows 11", "Red");
        nouts.add(nout2);
        noutColor.add(nout2.getColor());
        noutOs.add(nout2.getOs());
        Nout nout3 = new Nout(3, 8, 1000, "Windows 11", "Red");
        nouts.add(nout3);
        noutColor.add(nout3.getColor());
        noutOs.add(nout3.getOs());
        Nout nout4 = new Nout(4, 16, 2000, "Windows 11", "Black");
        nouts.add(nout4);
        noutColor.add(nout4.getColor());
        noutOs.add(nout4.getOs());
        Nout nout5 = new Nout(5, 4, 320, "Windows 7", "Grey");
        nouts.add(nout5);
        noutColor.add(nout5.getColor());
        noutOs.add(nout5.getOs());
        System.out.println(nouts.toString());
        Scanner scan = new Scanner(System.in);
        System.out.println("Вас приветствует магазин ноутбуков");
        System.out.println("Какой параметр наиболее важен для Вас: ");
        System.out.println("1. ОЗУ");
        System.out.println("2. Объем ЖД");
        System.out.println("3. Операционная система");
        System.out.println("4. Цвет");
        String answer = scan.nextLine();
        switch (answer) {
            case "1":
                System.out.print("Какой минимальный объем вам необходим: ");
                answer = scan.nextLine();
                System.out.println("-------- Наличие ------------");
                for (Nout nout : nouts) {
                    if (nout.getRAM() >= Integer.parseInt(answer)) {
                        System.out.println(nout.toString());
                    }
                }
                break;
            case "2":
                System.out.print("Какой минимальный объем вам необходим: ");
                answer = scan.nextLine();
                System.out.println("-------- Наличие ------------");
                for (Nout nout : nouts) {
                    if (nout.getHDD() >= Integer.parseInt(answer)) {
                        System.out.println(nout.toString());
                    }
                }
                break;
            case "3":
                System.out.println("Возможные варианты");
                System.out.println(noutOs.toString());
                answer = scan.nextLine();
                System.out.println("-------- Наличие ------------");
                for (Nout nout : nouts) {
                    if (nout.getOs().equals(answer)) {
                        System.out.println(nout);
                    }
                }
                break;

            case "4":
                System.out.println("Возможные варианты");
                System.out.println(noutColor.toString());
                answer = scan.nextLine();
                System.out.println("-------- Наличие ------------");
                for (Nout nout : nouts) {
                    if (nout.getColor().equals(answer)) {
                        System.out.println(nout);
                    }
                }
            default:
                break;
        }

    }
}