package HomeWork_5.Generation;

import java.util.Random;

public class RandomRusString {
    /* Метод возвращает "имя" состоящее из случайных символов русского алфавита
     @param maxLit - длинна сгенерированного имени
     Первая буква имени - строчная
     @return - возвращает сгенерированное имя
     */
    public static String randomRusString (int maxLit){
        String randomRusString = "";
        for (int i = 0; i < maxLit; i++) {
            Random ourNumbOfLit = new Random();
            String rusLet = "абвгдеёжзийклмнопрстуфхцчъыьэюя";
            String letterChoose = rusLet + rusLet.toUpperCase();
            char letter = letterChoose.charAt(ourNumbOfLit.nextInt(letterChoose.length()));

            if (i == 0) {
                letter = Character.toUpperCase(letter);
            }
            if (i != 0) {
                letter = Character.toLowerCase(letter);
            }
            String letterS = String.valueOf(letter);
            randomRusString = randomRusString.concat(letterS);
        }
        return randomRusString;
    }
}

