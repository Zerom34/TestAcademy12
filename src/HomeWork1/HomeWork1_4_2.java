package HomeWork1;
import java.util.Scanner;
public class HomeWork1_4_2 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int f = console.nextInt();
        int s = console.nextInt();
        int t = console.nextInt();
        int nummax = Math.max(Math.max(f,s), t);
        int nummin = Math.min(Math.min(f,s), t);
        int nummiddle = f + s + t - (nummax + nummin);
        System.out.println("Среднее число из введенных, это," + nummiddle);
    }
}
