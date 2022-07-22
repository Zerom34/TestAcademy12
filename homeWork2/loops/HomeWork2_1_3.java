package HomeWork2.loops;

import java.util.Scanner;
public class HomeWork2_1_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        double num = console.nextDouble();
        System.out.println("Введите степень в которую необходимо возвести число. Степень должна быть целочисленная и положителньая");
        if (console.hasNextInt()) {
            int rank = console.nextInt();
            if (rank >0) {
                double result = num;
                for (double i=1; i<rank; i++) {
                    result = result * num;
                    System.out.println(result);
                }
            }
            else {
            System.out.println("Степень должна быть положительной");
        }
       }
        else {
            System.out.println("Степень должна быть целочисленная");
        }
   }
}