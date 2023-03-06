import java.util.ArrayList;
import java.util.Scanner;

public class program6_1 {
    public static void main(String[] args) {
        ArrayList <NoteBook> list2 = new ArrayList<>();
        NoteBook n1 = new NoteBook("ACER 8541",8,1000,"Windows 10","Black");
        list2.add(n1);
        NoteBook n2 = new NoteBook("ACER 9450",32,3000,"Windows 11","Blue");
        list2.add(n2);
        NoteBook n3 = new NoteBook("HP 3421",16,2000,"Windows 11","White");
        list2.add(n3);
        NoteBook n4 = new NoteBook("HP 4532",16,1500,"Linux","Black");
        list2.add(n4);
        NoteBook n5 = new NoteBook("HP 4264",8,500,"Windows 10","Blue");
        list2.add(n5);
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i).toString());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите параметр\n1 - ОЗУ\n2 - Память \n3 - Операционная система \n4 - Цвет ");
        int parametr = sc.nextInt();
        int value = 0;
        String stroka = " ";
        if (parametr == 1){
            System.out.println("Введите значение в ГБ: ");
            value = sc.nextInt();
            for (int i = 0; i < list2.size(); i++) {
                list2.get(i).getRAM(value);
            }

        }
        if (parametr == 2){
            System.out.println("Введите значение в ГБ: ");
            value = sc.nextInt();
            for (int i = 0; i < list2.size(); i++) {
                list2.get(i).getHDD(value);
            }
        }
        if (parametr == 3){
            System.out.println("Введите одну из предложенных ОС:Windows 10, Windows 11, Linux");
            stroka = sc.nextLine();
            stroka = sc.nextLine();
            System.out.println(stroka);
            for (int i = 0; i < list2.size(); i++) {
                list2.get(i).getOS(stroka);
            }
        }
        if (parametr == 4){
            System.out.println("Введите один из предложенных цветов: black, white,blue ");
            stroka = sc.nextLine();
            stroka = sc.nextLine();
            System.out.println(stroka);
            for (int i = 0; i < list2.size(); i++) {
                list2.get(i).getColor(stroka);
            }
        }
        sc.close();

    }
    
}
