package HomeWork_2.loops;
import java.util.*;


public class HomeWork2_1_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите  целое число");
        int multiplier = scan.nextInt();
        long a = 1;
        int b;
        if (multiplier>0) {
            b = Integer.MAX_VALUE / multiplier; // b = Integer.MAX_VALUE масимально возможное значение числа с типом int 2 147 483 647
            System.out.println("Максимально возможно значение числа а с типом Long до переполнения " + Integer.MAX_VALUE);
            System.out.println("Сколько раз нужно повторить умножение числа а для получения переполнения: " + b);
            for (int i = 1; i <= b; i++) {
                a = a * multiplier;
                if ( a * multiplier < 0){
                    System.out.println("Произошло переполнение");
                    System.out.println("Произведение до переполнения = " + a);
                    System.out.println("Произведение после переполнения = " + a * multiplier);
                    break;
                }
            }
        }
        if (multiplier<0){
            b = Integer.MAX_VALUE / multiplier * (-1);
            System.out.println("Максимально возможно значение числа а с типом Long до переполнения " + Integer.MAX_VALUE);
            System.out.println("Сколько раз нужно повторить умножение числа а для получения переполнения: " + b);
            for (int i = 1; i <= b; i++) {
                a = a * multiplier;
                if (i == (b-1)){
                    System.out.println("Произошло переполнение");
                    System.out.println("Произведение до переполнения = " + a);
                    System.out.println("Произведение после переполнения = " + a * multiplier);
                    break;
                }
            }
        }


        //System.out.println("=" + res);
        //int per=res*(b+1);
        //System.out.println("Если вы умножите на один раз больше  то получим переполненение: " + per);
    }
}
