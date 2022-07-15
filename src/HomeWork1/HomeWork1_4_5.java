package HomeWork1;

import java.util.Scanner;

public class HomeWork1_4_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите символ");
        String a = console.nextLine();
        System.out.println(a);
        char c = a.charAt(0);
        boolean result = Character.isLetter(c);;
        if (result) {
            System.out.println(a + " - это буква");
        }
        if (!result) {
             System.out.println(a + " - это не буква");
        }
    }
}

