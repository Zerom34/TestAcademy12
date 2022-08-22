package HomeWork_5.Generation;
import java.util.Random;

public class RandomAnimalName {

    public static String randomAnimalName(){
        /* Метод выбирает случайное имя из заданного списка
         @param randomName - массив заполненный кличками животных
         @param min - нижняя планка случайных чисел
         @param max - верхняя планка случайных чисел
         @return Возвращает случайное имя
         */
        //Random random = new Random();
        String [] randomAnimalName = {"Завтрак","Закуска","Тефтелька","Владыка Тьмы","Лорд Коттермотрт","Боник","Алиса","Попугайчик","Хомячек",
                "Безымянный", "Дема","Альтаир","Стефа","Бима","Кошкозавр","Кошкозавриха","Бастет","Зевс","Аид","Нобель","Дон Собакеоне","Суслки",
                "Сильвер", "Кьяра", "Бэтмен", "Малыш", "Гоги", "Маркиз", "Луна", "Эмми", "Черника", "Кит", "Шепард"
        }; //Вображения у меня нет, так что просто взял клички своих любимцев и + поспрашивал у друзей
        int min = 1;
        int max = randomAnimalName.length;
        int randomNumb = (new Random().nextInt(max - min) + min);

        return randomAnimalName[randomNumb];
    }
}

