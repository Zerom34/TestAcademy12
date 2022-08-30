package HomeWork_1;
import java.util.Scanner;
public class HomeWork1_4_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите делимое число");
        int a = console.nextInt();
        System.out.println("Введите делитель");
        int b = console.nextInt();
        System.out.println(div(a, b));
    }
    public static String div(int a, int b){
        String result;
        if (b == 0) {
            return("На 0 не делиться");
        }
        if (a%b == 0)  {
            result = a + " целочисленно делится на " + b + " и равняется: " + a/b + " остаток равняется: " + a%b ;
            return result;
        }
        else if (a/b == 0) {
            result = a + " не делится на " + b + " остаток равняется: " + a%b;
            return result;
        }
        else {
            result = a + " целочисленно не делится на " + b + " и результат деления равняется: " + a/b + " а остаток " + a%b;
            return result;
        }
    }
}
