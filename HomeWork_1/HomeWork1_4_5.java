package HomeWork_1;

import java.util.Scanner;

public class HomeWork1_4_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите символ");
        String a = console.nextLine();
        System.out.println(numOr(a));
    }
    public static String numOr (String a){
        char c = a.charAt(0);
        boolean result = Character.isLetter(c);
        if (result) {
            return (a + " - это буква");
        }
        if (!result) {
            return (a + " - это не буква");
        }
        return "Ошибка";
    }
}

