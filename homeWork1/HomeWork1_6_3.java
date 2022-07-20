package HomeWork1;
import java.util.Scanner;
public class HomeWork1_6_3 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Name:");
        String na = console.nextLine();
        switch (na){
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}