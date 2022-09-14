package HomeWork_5.useToWork;

import java.util.Random;

public class AllGeneration {

     /* Метод возвращает "имя" состоящее из случайных символов
     @param maxLit - длинна сгенерированного имени
     Первая буква имени - строчная
     @return - возвращает сгенерированное имя
     */
    public static String randomString(int maxLit){
        String randomString = "";
        for (int i = 0; i < maxLit; i++) {
            Random ourNumbOfLit = new Random();
            String engLet = "qwertyuiopasdfghjklzxcvbnm123456789";
            String letterChoose = engLet + engLet.toUpperCase();
            char letter = letterChoose.charAt(ourNumbOfLit.nextInt(letterChoose.length()));
            if (i == 0) {
                letter = Character.toUpperCase(letter);
            }
            if (i != 0) {
                letter = Character.toLowerCase(letter);
            }
            String letterS = String.valueOf(letter);
            randomString = randomString.concat(letterS);
        }
        return randomString;
    }

     /* Метод возвращает "имя" состоящее из случайных символов
     @param maxLit - длинна сгенерированного имени
     Первая буква имени - строчная
     @return - возвращает сгенерированное имя
     */
    public static String randomEngString (){
        String randomEngString = "";
        int min = 5;
        int max = 13;
        int maxLit = (new Random().nextInt(max - min) + min);
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

     /* Метод возвращает "имя" состоящее из случайных символов русского алфавита
     @param maxLit - длинна сгенерированного имени
     Первая буква имени - строчная
     @return - возвращает сгенерированное имя
     */
    public static String randomRusString () {
        String randomRusString = "";
        int min = 1;
        int max = 10;
        int maxLit = (new Random().nextInt(max - min) + min);
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
    /* Метод выбирает случайное имя из заданного списка
    @param randomName - массив заполненный именами
    @param min - нижняя планка случайных чисел
    @param max - верхняя планка случайных чисел
    @return Возвращает случайное имя
    */

    public static String randomName(){
        String [] randomName = {"","Антон","Авель","Петр","Илья","Иван","Боб","Джон","Кейт","Максим","Альфонс","Абрахам","Гарольд","Томас",
                "Степан","Олаф","Генри","Саймон","Джон","Кени","Стэн","Эрик","Эдик","Вячеслав","Всеслав","Елена","Алена","Алина","Ольга","Таня",
                "Марта","Виктория","Даниела","Николай","Александр","Виктор","Надежда","Дарья","Наталья","Мария","Владислав","Альбус","Бонифаций"
        };
        int min = 1;
        int max = 42;
        int randomNumb = (new Random().nextInt(max - min) + min);

        return randomName[randomNumb];
    }


    /* Метод выбирает случайное имя из заданного списка
    @param randomName - массив заполненный кличками животных
    @param min - нижняя планка случайных чисел
    @param max - верхняя планка случайных чисел
    @return Возвращает случайное имя
    */
    public static String randomAnimalName(){
        String [] randomAnimalName = {"","Закуска","Тефтелька","Владыка Тьмы","Лорд Коттермотрт","Боник","Алиса","Попугайчик","Хомячек",
                "Безымянный", "Дема","Альтаир","Стефа","Бима","Кошкозавр","Кошкозавриха","Бастет","Зевс","Аид","Нобель","Дон Собакеоне","Суслки",
                "Сильвер", "Кьяра", "Бэтмен", "Малыш", "Гоги", "Маркиз", "Луна", "Эмми", "Черника", "Кит", "Шепард"
        }; //Вображения у меня нет, так что просто взял клички своих любимцев и + поспрашивал у друзей
        int min = 1;
        int max = 32;
        int randomNumb = (new Random().nextInt(max - min) + min);
        return randomAnimalName[randomNumb];
    }


    /* Метод возвращает "имя" состоящее из случайных символов
        @param maxLit - длинна сгенерированного имени
         Первая буква имени - строчная
         @return - возвращает сгенерированное имя
         */
    public static String randomPassword(){
        String randomPassword = "";
        int min = 5;
        int max = 11;
        int maxLit = (new Random().nextInt(max - min) + min);
            for (int i = 0; i < maxLit; i++) {
                Random ourNumbOfLit = new Random();
                String engLet = "qwertyuiopasdfghjklzxcvbnm123456789";
                String letterChoose = engLet + engLet.toUpperCase();
                char letter = letterChoose.charAt(ourNumbOfLit.nextInt(letterChoose.length()));
                String letterS = String.valueOf(letter);
                randomPassword = randomPassword.concat(letterS);
            }
        return randomPassword;
    }
    public static int randomAge(){
        int [] randomAge = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int min = 1;
        int max = randomAge.length;
        int randomNumb = (new Random().nextInt(max - min) + min);

        return randomAge[randomNumb];
    }
}
