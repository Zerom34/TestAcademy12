package HomeWork_1;
import java.util.Scanner;
public class HomeWork1_4_2 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Ввидеите три числа среди которых нужно найти среднее");
        int f = console.nextInt();
        int s = console.nextInt();
        int t = console.nextInt();
        System.out.println("Среднее число из введенных, это, " + aver(f,s,t));
    }

    public static int aver(int f, int s, int t){
        int nummax = Math.max(Math.max(f,s), t);
        int nummin = Math.min(Math.min(f,s), t);
        return f + s + t - (nummax + nummin);
    }
}
