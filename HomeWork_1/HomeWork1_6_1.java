package HomeWork_1;
import java.util.Objects;
import java.util.Scanner;
public class HomeWork1_6_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Как тебя зовут");
        String na = console.next();
        if (Objects.equals(na,"Вася")) {
            System.out.println("Привет.");
            System.out.println("Я тебя так долго ждал!");
        } else {
            if (Objects.equals(na,"Анастасия")) {
                System.out.println("Я тебя так долго ждал!");
            } else {
                System.out.println("Добрый день, а вы кто?");
            }
        }
    }
}