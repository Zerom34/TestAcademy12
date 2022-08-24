package HomeWork_5;

import HomeWork_5.BTM.InfDel;
import HomeWork_5.BTM.InfSort;
import HomeWork_5.BTM.InfSpeed;
import HomeWork_5.BTM.InfToList;
import HomeWork_5.DTOpa.Animal;
import HomeWork_5.DTOpa.Person;
import java.util.*;

public class HashSetMain {
    public static void main(String[] args) {
        Set<Person> colectionManOfHashSet = new HashSet<>();
        InfToList createColectionManOfHashSet = new InfToList();
        Set<Person> personHashSet = createColectionManOfHashSet.toPersonAdd(colectionManOfHashSet, false);
        ArrayList<Person> colectionManOfArray = new ArrayList<>(colectionManOfHashSet);
        InfSort.sortManPas(colectionManOfArray);
        InfSort.sortManPN(colectionManOfArray);
        Set<Person> colectionManOfHashSetD = new HashSet<>();
        Set<Animal> colectionAOfHashSet = new HashSet<>();
        InfToList createColectionAOfHashSet = new InfToList();
        Set<Animal> animalHashSet = createColectionAOfHashSet.toAnimalAdd(colectionAOfHashSet, false);
        ArrayList<Animal> colectionAOfHashSetArray = new ArrayList<>(colectionAOfHashSet);
        InfSort.sortAnimPas(colectionAOfHashSetArray);
        InfSort.sortAnimPN(colectionAOfHashSetArray);
        Set<Animal> animalHashSetD = new HashSet<>();
        createColectionManOfHashSet.toPersonAdd(colectionManOfHashSetD, true);
        createColectionAOfHashSet.toAnimalAdd(animalHashSetD, true);
        InfSpeed.checkSpeedIter(personHashSet);
        InfSpeed.checkSpeedIter(animalHashSet);
        InfSpeed.checkSpeedFor(personHashSet);
        InfSpeed.checkSpeedFor(animalHashSet);
        InfDel.delByTheInterator(personHashSet);
        InfDel.delByTheInterator(animalHashSet);
}
}