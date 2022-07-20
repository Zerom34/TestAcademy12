package HomeWork1;
import java.util.Scanner;
public class HomeWork1_4_4 {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
     System.out.println("Выберите категорию перевода:");
     System.out.println("(1) Байты в килобайты");
     System.out.println("(2) Килобайты в байты");
     int choose = console.nextInt();
     boolean result = choose > 1;
     if (!result) {
         System.out.println("Введите колличество байт");
         int bi = console.nextInt();
         System.out.println(bi + " это " + bi/1024 + "."+ bi%1024 + " килобайт");
     }
     if (result) {
         System.out.println("Введите колличество килобайт");
         int ki = console.nextInt();
         System.out.println(ki + " это " + ki*1024 + " байт");
     }
    }
}
