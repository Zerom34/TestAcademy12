package HomeWork_1;
import java.util.Objects;
import java.util.Scanner;
public class HomeWork1_6_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String na = console.nextLine();
        if (Objects.equals(na, "Вася")){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if (Objects.equals(na,"Анастасия")){
            System.out.println("Я тебя так долго ждал");
        }
        if (!Objects.equals(na, "Вася") && !Objects.equals(na,"Анастасия")){
            System.out.println("Добрый день а Вы кто?");
        }
    }
}