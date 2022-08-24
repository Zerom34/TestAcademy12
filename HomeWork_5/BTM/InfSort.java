package HomeWork_5.BTM;

import HomeWork_5.Comparator.ComparatorLengthOfPassword;
import HomeWork_5.Comparator.ComparatorLengthOfPasswordAndNick;
import HomeWork_5.Comparator.ComparatorOfAge;
import HomeWork_5.Comparator.ComparatorOfAgeAndAnimalName;
import HomeWork_5.DTOpa.Animal;
import HomeWork_5.DTOpa.Person;
import java.util.*;

public class InfSort {

    //Сортировка для Person - пароль
    public static void sortManPas(List<Person> collection) {
        collection.sort(new ComparatorLengthOfPassword());
        System.out.println("Сортировка  для листа Person: по паролю");
        for (Person i : collection) {
            System.out.println("Имя: " + i.getName());
            System.out.println("Пароль: " + i.getPassword() );
            System.out.println();
        }
    }
    public static void sortManPas(Set<Person> collection) {
        List <Person> collectionOfSortManPas=new ArrayList<>(collection);
        collectionOfSortManPas.sort(new ComparatorLengthOfPassword());
        HashSet<Person> collectionHashSet=new HashSet<>(collectionOfSortManPas);
        System.out.println("Сортировка  для листа Person: по паролю");
        for (Person i : collectionHashSet) {
            System.out.println("Имя: " + i.getName());
            System.out.println("Пароль: " + i.getPassword() );
            System.out.println();
        }
    }

    //Сортировка для Animal - возрасту
    public static void sortAnimPas(List<Animal> collection) {
        collection.sort(new ComparatorOfAge());
        System.out.println("Сортировка  для листа Animal: по возрасту");
        for (Animal i : collection) {
            System.out.println("Кличка: " + i.getName());
            System.out.println("Возраст: " + i.getAge() );
            System.out.println();
        }
    }
    public static void sortAnimPas(Set<Animal> collection) {
        List <Animal> collectionOfSortAnimPas=new ArrayList<>(collection);
        collectionOfSortAnimPas.sort(new ComparatorOfAge());
        HashSet <Animal> collectionHashSet=new HashSet<>(collectionOfSortAnimPas);
        System.out.println("Сортировка  для листа Animal: по возрасту");
        for (Animal i : collectionHashSet) {
            System.out.println("Кличка: " + i.getName());
            System.out.println("Возраст: " + i.getAge() );
            System.out.println();
        }
    }

    //Сортировка для Person - паролю и нику
    public static void sortManPN(List<Person> collection) {
        collection.sort(new ComparatorLengthOfPasswordAndNick());
        System.out.println("Сортировка  для листа Person: по паролю и нику");
        for (Person i : collection) {
            System.out.println("Имя: " + i.getName());
            System.out.println("Ник: " + i.getNick());
            System.out.println("Пароль: " + i.getPassword() );
            System.out.println();
        }
    }
    public static void sortManPN(Set<Person> collection) {
        List <Person> collectionOfSortManPN=new ArrayList<>(collection);
        collectionOfSortManPN.sort(new ComparatorLengthOfPasswordAndNick());
        HashSet<Person> collectionHashSet=new HashSet<>(collectionOfSortManPN);
        System.out.println("Сортировка  для листа Person: по паролю");
        for (Person i : collectionHashSet) {
            System.out.println("Имя: " + i.getName());
            System.out.println("Ник: " + i.getNick());
            System.out.println("Пароль: " + i.getPassword() );
            System.out.println();
        }
    }

    //Сортировка для Animal - возрасту и кличке
    public static void sortAnimPN(List<Animal> collection) {
        collection.sort(new ComparatorOfAgeAndAnimalName());
        System.out.println("Сортировка  для листа Animal: по возрасту и кличке");
        for (Animal i : collection) {
            System.out.println("Кличка: " + i.getName());
            System.out.println("Возраст: " + i.getAge() );
            System.out.println();
        }
    }
    public static void sortAnimPN(Set<Animal> collection) {
        List <Animal> collectionOfSortAnimPN=new ArrayList<>(collection);
        collectionOfSortAnimPN.sort(new ComparatorOfAgeAndAnimalName());
        HashSet <Animal> collectionHashSet=new HashSet<>(collectionOfSortAnimPN);
        System.out.println("Сортировка  для листа Animal: по возрасту и кличке");
        for (Animal i : collectionHashSet) {
            System.out.println("Кличка: " + i.getName());
            System.out.println("Возраст: " + i.getAge() );
            System.out.println();
        }
    }
}
