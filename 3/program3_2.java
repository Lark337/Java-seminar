import java.util.ArrayList;
import java.util.Arrays;


// 2) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

public class program3_2 {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>(Arrays.asList(new Integer[] {5,5,7,8,10,17,20,16,12,19}));
        System.out.println(list1);
        System.out.println("Максимальное значение: " + maxZnach(list1));
        System.out.println("Минимальное значение: " + minZnach(list1));
        System.out.println("Среднее арифмическое значение: " + midZnach(list1));
    }
    public static int maxZnach(ArrayList<Integer> list1) {
        int max = list1.get(0);
        for (int i = 1; i < list1.size(); i++) {
            if (list1.get(i) > max){
                max = list1.get(i);
            }
        }
        return max;
    }
    public static int minZnach(ArrayList<Integer> list1) {
        int min = list1.get(0);
        for (int i = 1; i < list1.size(); i++) {
            if (list1.get(i) < min){
                min = list1.get(i);
            }
        }
        return min;
    }
    public static double midZnach(ArrayList<Integer> list1) {
        double summa = 0;
        for (int i = 1; i < list1.size(); i++) {
            summa += list1.get(i);
            }
        double rez = summa / list1.size();
        return rez;
    }
}
