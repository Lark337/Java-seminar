import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

public class program1 {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите число");
        int n = number.nextInt();
        number.close();
        int res1 = 0;
        int res2 = 1;
        for (int i = 1; i <= n; i++) {
            res1 += i;
        }
        for (int i = 1; i <= n; i++) {
            res2 *= i;
        }
        System.out.println("n-ое треугольного числа: " + res1);
        System.out.println("Факториал n: " + res2);
    }
}