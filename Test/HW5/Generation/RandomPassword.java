package Test.HW5.Generation;

import java.util.Random;

public class RandomPassword {
    /* Метод возвращает "имя" состоящее из случайных символов
    @param maxLit - длинна сгенерированного имени
     Первая буква имени - строчная
     @return - возвращает сгенерированное имя
     */
    public static String randomPassword(int maxLit){
        String randomPassword = "";
        if (maxLit > 10){
            System.out.println("Пароль не должен превышать 10 символов");
        } else if (maxLit < 5) {
            System.out.println("Пароль должен быть состоять минимум из 5 символов");
        }
        else {
            for (int i = 0; i < maxLit; i++) {
                Random ourNumbOfLit = new Random();
                String engLet = "qwertyuiopasdfghjklzxcvbnm123456789";
                String letterChoose = engLet + engLet.toUpperCase();
                char letter = letterChoose.charAt(ourNumbOfLit.nextInt(letterChoose.length()));
                String letterS = String.valueOf(letter);
                randomPassword = randomPassword.concat(letterS);
            }
        }
        return randomPassword;
    }
}