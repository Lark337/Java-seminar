import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*Дана строка (получение через обычный текстовый файл!!!)

"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет] 

*/

/**
 * program2
 */
public class program2_2 {

    public static void main(String[] args) throws IOException {
        FileReader data = new FileReader("2/text2.txt");
        Scanner scan = new Scanner(data);
        String dannie = scan.next();
        data.close();
        scan.close();
        dannie = dannie.replaceAll("\"", "");
        dannie = dannie.replaceAll(":", ",");
        String [] list1 = dannie.split(",");
        StringBuilder res = new StringBuilder();
        res.append("Студент ").append(list1[1]).append(" получил ").append(list1[3]).append(" по предмету ").append(list1[5]);
        System.out.println(res);
    }
}