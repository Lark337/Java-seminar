// Вывести все простые числа от 1 до 1000 

public class program2 {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("1");
        for (int i = 0; i <= 1000; i++) {
            for (int j = i; j > 1; j--) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 1) {
                System.out.print(" " + i);
            }
            count = 0;    
        }
    }
}
