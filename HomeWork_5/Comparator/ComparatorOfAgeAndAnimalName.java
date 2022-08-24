package HomeWork_5.Comparator;

import HomeWork_5.DTOpa.Animal;
import java.util.Comparator;

public class ComparatorOfAgeAndAnimalName implements Comparator<Animal>{
    public int compare(Animal firstAnimal, Animal secondAnimal) {
        /*
        Компоратор для классов, который сравнивает возраст животных и имена их по алфавиту
         */

        int passwordNickIf= Integer.compare(firstAnimal.getAge(), secondAnimal.getAge());
        if (passwordNickIf == 0) {
            return firstAnimal.getName().compareTo(secondAnimal.getName());
        }
        return passwordNickIf;
    }
}
