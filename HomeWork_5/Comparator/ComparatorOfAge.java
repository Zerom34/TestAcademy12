package HomeWork_5.Comparator;

import HomeWork_5.DTOpa.Animal;

public class ComparatorOfAge {
    // Компоратор для классов, который сравнивает возраст животных
    public int compare(Animal firstAnimal, Animal secondAnimal) {
        return Integer.compare(firstAnimal.getAge(), secondAnimal.getAge());
    }
}
