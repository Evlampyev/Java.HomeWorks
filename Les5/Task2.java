package Les5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String file = "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова Анна Владимирова Иван Мечников Петр Петин Иван Ежов";
        String[] list = file.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            if (i % 2 == 0) {
                if (map.containsKey(list[i])) {
                    int x = map.get(list[i]);
                    map.put(list[i], x + 1);
                } else {
                    map.put(list[i], 1);
                }
            }
        }
        System.out.println(map);
        ArrayList<Integer> intList = new ArrayList<>(map.size());
        for (var el : map.entrySet()) {
            intList.add(el.getValue());
        }
        System.out.println(intList.toString());
        Collections.sort(intList, Collections.reverseOrder());
        for (int i = 1; i < intList.size(); i++) {
            if (intList.get(i) == intList.get(i - 1)) {
                intList.remove(i);
                i--;
            }
        }
        System.out.println(intList.toString());
        for (Integer el_itn : intList) {
            for (var el : map.entrySet()) {
                if (el_itn == el.getValue()) {
                    System.out.println(el.getKey() + " " + el.getValue());
                }
            }
        }

    }
}
