
// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

public class program3_3 {
    public static void main(String[] args) {
        String stroka = "Проверка является является проверка";
        String[] arr = stroka.split(" ");
        boolean check = true;
        for (int i = 0; i < arr.length/2; i++) {
            if (!arr[i].equalsIgnoreCase(arr[arr.length - 1 - i])){
                check = false;
            }
        }
        System.out.println(check);
    }
}
