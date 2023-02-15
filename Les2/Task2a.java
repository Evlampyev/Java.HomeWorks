//Вторая попытка, должен быть вариант легче!

package Les2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Task2a
 */
public class Task2a {

    public static void main(String[] args) throws IOException {
        String file_name = "text.txt";
        File file = new File(file_name);
        String Line = new String();
        BufferedReader bufReader = new BufferedReader(new FileReader(file));
        Line = bufReader.readLine();
        bufReader.close();
        Path path = Paths.get(file_name);
        List<String> Lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        for (String OneLine : Lines) {
            String[] lst = OneLine.split(",");
            String family = onlyTxt(lst[0]);
            String mark = onlyTxt(lst[1]);
            String object = onlyTxt(lst[2]);
            String rezult = "У студента " + family + " по предмету " + object + " " + mark;
            System.out.println(rezult);
            rezult = "";

        }

    }

    public static String onlyTxt(String text) {
        int index = text.lastIndexOf(':');
        String res = text.substring(index + 2, text.length() - 1);
        return res;
    }
}
