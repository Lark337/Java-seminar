import java.util.LinkedList;
import java.util.Scanner;

// В калькулятор добавьте возможность отменить последнюю операцию.
// Дополнительно каскадная отмена - отмена нескольких операций

public class program4_3 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int n1 = 0;
        String znak = " ";
        int n2 = 0;
        int check = -1;
        int res = 0;
        LinkedList <Integer> list1 = new LinkedList<>();
        list1.add(0);
        while (check != 3){
            n1 = res;
            if (check == -1){
                System.out.print("Введите первое число: ");
                n1 = vvod.nextInt();
            }
            System.out.print("Введите действие: ");
            znak = vvod.next();
            System.out.print("Введите второе число: ");
            n2 = vvod.nextInt(); 
            if (znak.equals("+")){
                res = n1 + n2;
            }
            if (znak.equals("-")){
                res = n1 - n2;
            }
            if (znak.equals("*")){
                res = n1 * n2;
            }
            if (znak.equals("/")){
                res = n1 / n2;
            }
            System.out.println("Результат равен: " + res);
            check = 0;
            while(check != 1 && check != 3){
                System.out.println("Выберите операцию:\n1: продолжить \n2: отменить прошлое действие \n3: Закончить");
                check = vvod.nextInt();
                if (check == 2){
                    res = list1.remove(list1.size()-1);
                    System.out.println("Результат равен: " + res);
                }
            }
            list1.add(res);
        }
        vvod.close();
    }
}
