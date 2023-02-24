package Les5;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        Character[][] list = new Character[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                list[i][j] = '.';
            }
        }
        
        
        
        int x0 = 0;
        int y0 = 5;
        list[x0][y0] = 'x';    
        markCell(x0, y0, list);
        printList(list);
        for (x0 = 1; x0 < 8; x0++) {
            y0 = 0;
            while (list[x0][y0] != '.'){
                y0++;
            }
            list[x0][y0] = 'x';    
            markCell(x0, y0, list);
            printList(list);
        }
    }

    public static void printList(Character[][] lst) {
        System.out.println("---------------------");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(lst[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void markCell(int x, int y, Character[][] lst) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (lst[i][j] == '.'){
                    if (i == x | j == y | Math.abs(i-x)==Math.abs(j-y)){
                        lst[i][j] = '0';
                    }
                }
            }
        }
    }
}
