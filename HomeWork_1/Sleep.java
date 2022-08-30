package HomeWork_1;
import java.util.Scanner;
public class Sleep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сегодня рабочий день? Введите  да или нет ");
        String weekdayToday = in.next();
        System.out.print("У вас отпуск? Введите  да или нет ");
        String vacationToday = in.next();
        System.out.println(result(isWeekDay(weekdayToday),(isVacationDay(vacationToday)) ));
    }


    public static boolean isWeekDay(String weekdayToday) {
        return weekdayToday.equals("да");
    }

    public static boolean isVacationDay(String vacationToday) {
        return vacationToday.equals("да");
    }

    public static String result(boolean result, boolean result2) {
        if (result || result2) {
            return "Можно спать";
        } else {
            return "Пора работать";
        }
    }

}


