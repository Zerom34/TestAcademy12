package HomeWork_1;
import java.util.Scanner;
public class Sleep {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сегодня рабочий день?");
        System.out.println("Введите да в случе рабочего, либо нет если выходной");
        String dayOfWeek = scan.next();
        System.out.println("У вас сейчас время отпуска?");
        System.out.println("Введите да или нет");
        String vaca = scan.next();
        boolean day = dayOfWeek.equals("нет");
        boolean vacation = vaca.equals("да");
        if (sleepIn(day, vacation)){
            System.out.println("Можем спать дальше");}
        else {
            System.out.println("Пора на работу");}
    }



    public static boolean sleepIn(boolean day, boolean vacation) {
        if (day || vacation) {
            return true;
        } else {
            return false;
        }
    }
}


