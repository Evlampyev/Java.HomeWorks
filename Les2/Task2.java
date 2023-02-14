/* Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].
 */
package Les2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Task2 {
    public static void main(String[] args) {
        String file_name = "text.txt";
        String stroka = new String();
        try {
            File file = new File(file_name);
            if (file.createNewFile()) {
                System.out.println("file.created");
            }
            else {
                stroka = ReadFromFile(file);
            }
        }
        catch (Exception e) {
            System.out.println("Что-то не так");
            }
        finally {System.out.println(stroka);
            }
        }
    

    public static String ReadFromFile(File file) {
        String line = new String();
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(file));
            System.out.println("file.existed");
            line = bufReader.readLine();
            bufReader.close();
        } catch (Exception e) {
            System.out.println("Возникла какая-то неприятность");
        } finally {
            return line;}
        }
    }
