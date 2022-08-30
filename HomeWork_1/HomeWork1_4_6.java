package HomeWork_1;
import java.util.Scanner;
public class HomeWork1_4_6 {
    public static void main() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите интересующий вас год");
        int yea = console.nextInt();
        System.out.println(whatYear(yea));
    }
    public static String whatYear(int yea){
        if (yea%4 == 0) {
            if (yea%100 == 0) {
                if (yea%400 == 0) {
                    return(yea + " не високосный год");
                }
                else {
                    return(yea + " високосный год");
                }
            }
            else {
                return(yea + " високосный год");
            }
        }
        else {
            return (yea + " не високосный год");
        }
    }
}
