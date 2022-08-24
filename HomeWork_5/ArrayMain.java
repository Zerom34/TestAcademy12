package HomeWork_5;

import HomeWork_5.BTM.InfDel;
import HomeWork_5.BTM.InfSort;
import HomeWork_5.BTM.InfSpeed;
import HomeWork_5.BTM.InfToList;
import HomeWork_5.DTOpa.Animal;
import HomeWork_5.DTOpa.Person;

import java.util.*;

public class ArrayMain {
    public static void main(String[] args) {
        List<Person> colectionManOfArray = new ArrayList<>();
        InfToList createColectionManOfArray = new InfToList();
        List<Person> personArray = createColectionManOfArray.toPersonAdd(colectionManOfArray, false);
        InfSort.sortManPas(personArray);
        InfSort.sortManPN(personArray);
        List<Animal> colectionAnimalOfArray = new ArrayList<>();
        InfToList createColectionAnimalOfArray = new InfToList();
        List<Animal> animalArray = createColectionAnimalOfArray.toAnimalAdd(colectionAnimalOfArray, false);
        InfSort.sortAnimPas(animalArray);
        InfSort.sortAnimPN(animalArray);
        List<Person> colectionManOfArrayD = new ArrayList<>();
        createColectionManOfArray.toPersonAdd(colectionManOfArrayD, true);
        List<Animal> colectionAnimalOfArrayD = new ArrayList<>();
        createColectionAnimalOfArray.toAnimalAdd(colectionAnimalOfArrayD, true);
        InfSpeed.checkSpeedIter(personArray);
        InfSpeed.checkSpeedIter(animalArray);
        InfSpeed.checkSpeedFor(personArray);
        InfSpeed.checkSpeedFor(animalArray);
        InfDel.delByTheInterator(personArray);
        InfDel.delByTheInterator(animalArray);
    }
}
