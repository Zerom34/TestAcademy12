package HomeWork_5.Generation;
import java.util.Random;

public class RandomName {
    public static String randomName(){
        /* Метод выбирает случайное имя из заданного списка
         @param randomName - массив заполненный именами
         @param min - нижняя планка случайных чисел
         @param max - верхняя планка случайных чисел
         @return Возвращает случайное имя
         */
        //Random random = new Random();
        String [] randomName = {"Август","Антон","Авель","Петр","Илья","Иван","Боб","Джон","Кейт","Максим","Альфонс","Абрахам","Гарольд","Томас",
                "Степан","Олаф","Генри","Саймон","Джон","Кени","Стэн","Эрик","Эдик","Вячеслав","Всеслав","Елена","Алена","Алина","Ольга","Таня",
                "Марта","Виктория","Даниела","Николай","Александр","Виктор","Надежда","Дарья","Наталья","Мария","Владислав","Альбус","Бонифаций"
        };
        int min = 1;
        int max = randomName.length;
        int randomNumb = (new Random().nextInt(max - min) + min);

        return randomName[randomNumb];
    }
}
