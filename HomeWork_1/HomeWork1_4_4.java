package HomeWork_1;
import java.util.Scanner;
public class HomeWork1_4_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Выберите категорию перевода:");
        System.out.println("(1) Байты в килобайты");
        System.out.println("(2) Килобайты в байты");
        int choose = console.nextInt();
        int item = console.nextInt();
        System.out.println(byteToKilobyte(choose, item));
    }
    public static String byteToKilobyte(int choose, int item){
        String res;
        if (item<0){
            return "Данные не могут быть отрицательными";
        }
        boolean result = choose > 1;
        if (!result) {
            res = (item + " это " + item/1024 + "."+ item%1024 + " килобайт");
            return res;
        }
        if (result) {
            res = (item + " это " + item*1024 + " байт");
            return res;
        }
        return "Ошибка";
    }
}
