import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)

public class program3 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int n1 = vvod.nextInt();
        System.out.print("Введите действие: ");
        String znak = vvod.next();
        System.out.print("Введите второе число: ");
        int n2 = vvod.nextInt(); 
        vvod.close();
        int res = 0;
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
    }
}
