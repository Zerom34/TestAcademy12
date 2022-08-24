package HomeWork_5.BTM;

import HomeWork_5.DTOpa.Animal;
import HomeWork_5.DTOpa.Person;
import HomeWork_5.UseToWork.AllGeneration;

import java.util.*;

public class InfToList {

    //метод для Person - наполнение свежесозданного
    public List<Person> toPersonAdd(List<Person> collection, boolean personTime) {
        long positionToTime1 = System.currentTimeMillis();
        for (int c = 0; c < 100000; c++) {
            Person person = new Person();
            person.setName(AllGeneration.randomName());
            person.setNick(AllGeneration.randomEngString());
            person.setPassword(AllGeneration.randomPassword());
            collection.add(person);
        }
        long positionToTime2 = System.currentTimeMillis();
        if (personTime) {
            System.out.println();
            System.out.println("Заполнение Person: ");
            System.out.println((positionToTime2 - positionToTime1) + " * 10^-6 sec ");
        }
        return collection;
    }

    //метод для Animal - наполнение свежесозданного
    public List<Animal> toAnimalAdd(List<Animal> collection, boolean personTime) {
        long positionToTime1 = System.currentTimeMillis();
        for (int c = 0; c < 100000; c++) {
            Animal animal = new Animal();
            animal.setName(AllGeneration.randomAnimalName());
            animal.setAge(AllGeneration.randomAge());
            collection.add(animal);
        }
        long positionToTime2 = System.currentTimeMillis();
        if (personTime) {
            System.out.println("Заполнение Animal: ");
            System.out.println((positionToTime2 - positionToTime1) + " * 10^-6 sec ");
        }
        return collection;
    }


    public Set<Person> toPersonAdd(Set<Person> collection, boolean personTime) {
        long positionToTime1 = System.currentTimeMillis();
        for (int c = 0; c < 100000; c++) {
            Person person = new Person();
            person.setName(AllGeneration.randomName());
            person.setNick(AllGeneration.randomEngString());
            person.setPassword(AllGeneration.randomPassword());
            collection.add(person);
        }
        long positionToTime2 = System.currentTimeMillis();
        if (personTime) {
            System.out.println("Заполнение Person: ");
            System.out.println((positionToTime2 - positionToTime1) + " * 10^-6 sec ");
        }
        return collection;
    }

    public Set<Animal> toAnimalAdd(Set<Animal> collection, boolean personTime) {
        long positionToTime1 = System.currentTimeMillis();
        for (int c = 0; c < 100000; c++) {
            Animal animal = new Animal();
            animal.setName(AllGeneration.randomAnimalName());
            animal.setAge(AllGeneration.randomAge());
            collection.add(animal);
        }
        long positionToTime2 = System.currentTimeMillis();
        if (personTime) {
            System.out.println("Заполнение Animal: ");
            System.out.println((positionToTime2 - positionToTime1) + " * 10^-6 sec ");
        }
        return collection;
    }
}
