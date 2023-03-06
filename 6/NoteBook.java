
public class NoteBook {
    String model;
    int RAM;
    int HDD;
    String OS;
    String color;
    
    @Override
    public String toString() {
        return String.format(" Модель: %s Оперативная память: %dГб Объем жесткого диска: %d Гб Операционная система: %s Цвет: %s", model, RAM, HDD, OS, color);
    }

    public NoteBook(String parametr1, int parametr2, int parametr3, String parametr4, String parametr5) {
        model = parametr1;
        RAM = parametr2;
        HDD = parametr3;
        OS = parametr4;
        color = parametr5;
    }
    public void getRAM(int value){
        if (RAM >= value){
            System.out.println(toString());
        }
    }
    public void getHDD(int value){
        if (HDD >= value){
            System.out.println(toString());
        }
    }
    public void getOS(String stroka){
        if (OS.equalsIgnoreCase(stroka)){
            System.out.println(toString());
        }
    }
    public void getColor(String stroka){
        if (color.equalsIgnoreCase(stroka)){
            System.out.println(toString());
        }
    }
}
