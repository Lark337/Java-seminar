import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

public class program4_1 {
    public static void main(String[] args) {
        LinkedList <Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        System.out.println(list1);
        System.out.println(reverseLinkedList(list1));
    }
    public static LinkedList <Integer> reverseLinkedList(LinkedList <Integer> list1) {
        for (int i = 0; i < list1.size(); i++) {
            list1.add(i,list1.remove(list1.size()-1));
        }
        return list1;
    }
    
}
