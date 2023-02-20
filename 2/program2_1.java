
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.

/**
 * program1
 */
public class program2_1 {

    public static void main(String[] args) throws IOException {
        int[] arr = {5,4,3,2,7,6,8,1};
        System.out.println(Arrays.toString(arr)); 
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j = -1;
                    i = 0;
                }
            }
        }
        FileWriter log = new FileWriter("2/log.txt", true);
        log.write(Arrays.toString(arr));
        log.write("\n");
        log.close();
    }
}