package HomeWork_5.comparator;

import HomeWork_5.dto.Person;
import java.util.Comparator;

public class ComparatorLengthOfPasswordAndNick implements Comparator<Person> {
    public int compare(Person firstPerson, Person secondPerson) {
        /*
        Компоратор для классов, который сравнивает длину пароля пользователей и псевдонимы пользователей по алфавиту
         */

            int passwordNickIf= Integer.compare(firstPerson.getPassword().length(), secondPerson.getPassword().length());
            if (passwordNickIf == 0) {
                return firstPerson.getNick().compareTo(secondPerson.getNick());
            }
            return passwordNickIf;
        }

}