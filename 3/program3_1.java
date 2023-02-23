import java.util.ArrayList;
import java.util.Arrays;

// 1) Пусть дан произвольный список целых чисел, удалить из него четные числа
/**
 * program3_1
 */
public class program3_1 {

    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>(Arrays.asList(new Integer[] {5,5,7,8,10,17,16,12,19}));
        System.out.println(list1);
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i) % 2 == 0){
                list1.remove(i);
                i -= 1;
            }
        }
        System.out.println(list1);
    }
} 