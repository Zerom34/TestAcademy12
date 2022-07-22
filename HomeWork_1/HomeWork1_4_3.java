package HomeWork_1;
import java.util.Scanner;
public class HomeWork1_4_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите делимое число");
        int a = console.nextInt();
        System.out.println("Введите делитель");
        int b = console.nextInt();
        if (b == 0) {
            System.out.println("На 0 не делиться");
        }
        else if (a%b == 0)  {
            System.out.println(a + " целочисленно делится на " + b + " и равняется: " + a/b + " остаток равняется: " + a%b);
        }
        else if (a/b == 0) {
            System.out.println(a + " не делится на " + b + " остаток равняется: " + a%b);
        }
        else {
            System.out.println(a + " целочисленно не делится на " + b + " и результат деления равняется: " + a/b + " а остаток " + a%b);
        }
    }
}
