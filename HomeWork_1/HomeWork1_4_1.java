package HomeWork_1;
import java.util.Scanner;
public class HomeWork1_4_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Укажите число для определения четности");
        int result = console.nextInt();
        System.out.println(parity(result));
    }

    public static String parity(int result) {
        if (result == 0){
            return ("Ноль не является ни четным, ни нечетным");
        }
        if (result % 2 == 0) {
            return (result + " - четное " + "число");
        } else {
            return (result + " - нечетное " + "число");
        }
    }
}
