package HomeWork2.loops;
import java.util.Scanner;
public class HomeWork2_1_1_1 {
    public static void main(String args[]) {
        Scanner cons = new Scanner(System.in);
        System.out.println("Введите число");
        int num = cons.nextInt();
        System.out.print("1");
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
            System.out.print(" * " + i);
            if (result < 0) {
                System.out.println(" !Произошло переполнение");
                break;
            }
        }
        if (result > 0) {
            System.out.println(" = " + result);
        }

    }
}