package HomeWork_5.comparator;
import HomeWork_5.dto.Person;

import java.util.Comparator;

public class ComparatorLengthOfPassword implements Comparator<Person> {
    // Компоратор для классов, который сравнивает длину пароля
    public int compare(Person firstPerson, Person secondPerson) {
        return Integer.compare(firstPerson.getPassword().length(), secondPerson.getPassword().length());
    }
}