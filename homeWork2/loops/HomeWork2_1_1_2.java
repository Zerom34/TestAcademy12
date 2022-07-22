package HomeWork2.loops;
import java.util.Scanner;
public class HomeWork2_1_1_2 {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        System.out.println("Введите число");
        int num = cons.nextInt();
        System.out.print("1");
        System.out.println(" = ".concat(String.valueOf (recursion(num) )));
    }

    static int recursion(int num) {
        int result;
        if (num < 2) {
            return 1;
        }
        result = recursion(num - 1) * num;
        if (num > 1) {
            System.out.print(" * " + num );
        } else {
            System.out.print(num);
        }

        return result;
    }
}
