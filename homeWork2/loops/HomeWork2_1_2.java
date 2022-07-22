package HomeWork_2.loops;
import java.util.Scanner;
public class HomeWork2_1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число");
        if (scan.hasNextInt()) {
            int num = scan.nextInt();
            String pr = Integer.toString(num);
            long result = 1;
            int[] mas = new int[pr.length()];
            for (int m = mas.length - 1; m >= 0; m--) {
                if (num > 9) {
                    mas[m] = num % 10;
                    num = num / 10;
                }
                else {
                    mas[m] = num;
                }
            }
            for (int i = 0; i < mas.length; i++) {
                if (i == 0) {
                    System.out.print(mas[i]);
                    result *= mas[i];
                }
                else {
                    System.out.print(" * " + mas[i]);
                    result *= mas[i];
                }
            }
            System.out.println(" = " + result);
        } else if (scan.hasNextDouble()) {
            System.out.println("Введенное число не является целым!");
        } else if (scan.hasNextLine()) {
            System.out.println("Введеное не является числом");
        }
    }
}
