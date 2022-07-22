package HomeWork_1;
import java.util.Scanner;
public class HomeWork1_4_1 {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        if ((n % 2) == 0) {
            System.out.println("это четное число");
        }
        else {
            System.out.println("это нечетное число");
        }
    }
}
