package HomeWork_1;
import java.util.Scanner;
public class HomeWork1_4_6 {
    public static void main(String args[]) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите интересующий вас год");
        int yea = console.nextInt();
        if (yea%4 == 0) {
            if (yea%100 == 0) {
             if (yea%400 == 0) {
                 System.out.println(yea + " не високосный год");
             }
             else {
                 System.out.println(yea + " високосный год");
             }
            }
            else {
                System.out.println(yea + " високосный год");
            }
        }
        else {
            System.out.println(yea + " не високосный год");
        }
    }
}
