import java.util.LinkedList;
import java.util.Scanner;

// 2 . Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class program4_2 {

    public static void main(String[] args) {
        LinkedList <Integer> list1 = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        int vvod = 0;
        int num = 0;
        while(vvod != 4){
            System.out.println("Введите операцию:");
            System.out.println("1: enqueue()");
            System.out.println("2: dequeue()");
            System.out.println("3: first()");
            System.out.println("4: Выйтик");
            vvod = scan.nextInt();
            if( vvod == 1){
                System.out.println("Введите число: ");
                num = scan.nextInt();
                enqueue(list1, num);
                System.out.println(list1);
            }
            if( vvod == 2){
                dequeue(list1);
                System.out.println(list1);
            }
            if( vvod == 3){
                first(list1);
                System.out.println(list1);
            }
        
        }
        scan.close();
        
    }
    public static LinkedList <Integer> enqueue (LinkedList<Integer> list1, int num) {
        list1.add(num);
        return list1;
    }
    
    public static Integer dequeue (LinkedList<Integer> list1) {
        int res = list1.remove();
        System.out.println("Удален первый элемент: " + res);
        return res;
    }
    
    public static Integer first (LinkedList<Integer> list1) {
        int res = list1.get(0);
        System.out.println("Первый элемент: " + res);
        return res;
    }
}