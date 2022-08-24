package Test.HW5.Generation;
import java.util.Random;

public class RandomEngString {
    /* Метод возвращает "имя" состоящее из случайных символов
    @param maxLit - длинна сгенерированного имени
     Первая буква имени - строчная
     @return - возвращает сгенерированное имя
     */
    public static String randomEngString (int maxLit){
        String randomEngString = "";
        for (int i = 0; i < maxLit; i++) {
            Random ourNumbOfLit = new Random();
            String engLet = "qwertyuiopasdfghjklzxcvbnm";
            String letterChoose = engLet + engLet.toUpperCase();
            char letter = letterChoose.charAt(ourNumbOfLit.nextInt(letterChoose.length()));
            if (i == 0) {
                letter = Character.toUpperCase(letter);
            }
            if (i != 0) {
                letter = Character.toLowerCase(letter);
            }
            String letterS = String.valueOf(letter);
            randomEngString = randomEngString.concat(letterS);
        }
        return randomEngString;
    }
}