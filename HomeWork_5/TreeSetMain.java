package HomeWork_5;

import HomeWork_5.btm.InfSort;
import HomeWork_5.btm.InfSpeed;
import HomeWork_5.btm.InfToList;
import HomeWork_5.comparator.ComparatorOfAgeAndAnimalName;
import HomeWork_5.dto.Animal;
import HomeWork_5.dto.Person;
import HomeWork_5.comparator.ComparatorLengthOfPassword;
import java.util.*;

public class TreeSetMain {
    public static void main(String[] args) {
        Set<Person> colectionManOfTreeSet = new TreeSet<>( new ComparatorLengthOfPassword());  //(Comparator<? super Person>)
        InfToList createCollectionManOfTreeSet = new InfToList();
        Set<Person> personTreeSet = createCollectionManOfTreeSet.toPersonAdd(colectionManOfTreeSet, false);
        ArrayList<Person> colectionManOfArray = new ArrayList<>(colectionManOfTreeSet);
        InfSort.sortManPas(colectionManOfArray);
        InfSort.sortManPN(colectionManOfArray);

        Set<Animal> colectionAnimOfTreeSet = new TreeSet<>( new ComparatorOfAgeAndAnimalName());
        InfToList createColectionAnimOfTreeSet = new InfToList();
        Set<Animal> animalTreeSet = createColectionAnimOfTreeSet.toAnimalAdd(colectionAnimOfTreeSet, false);
        ArrayList<Animal> colectionAOfHashSetArray = new ArrayList<>(colectionAnimOfTreeSet);
        InfSort.sortAnimPas(colectionAOfHashSetArray);
        InfSort.sortAnimPN(colectionAOfHashSetArray);

        Set<Person> colectionManOfTreeSetD = new TreeSet<>( new ComparatorLengthOfPassword());
        createCollectionManOfTreeSet.toPersonAdd(colectionManOfTreeSetD, true);
        Set<Animal> colectionAnimOfTreeSetD = new TreeSet<>( new ComparatorOfAgeAndAnimalName());
        createColectionAnimOfTreeSet.toAnimalAdd(colectionAnimOfTreeSetD, true);
        InfSpeed.checkSpeedIter(personTreeSet);
        InfSpeed.checkSpeedIter(animalTreeSet);
        InfSpeed.checkSpeedFor(personTreeSet);
        InfSpeed.checkSpeedFor(animalTreeSet);
    }
}