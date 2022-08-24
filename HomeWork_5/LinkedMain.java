package HomeWork_5;

import HomeWork_5.BTM.InfDel;
import HomeWork_5.BTM.InfSort;
import HomeWork_5.BTM.InfSpeed;
import HomeWork_5.BTM.InfToList;
import HomeWork_5.DTOpa.Animal;
import HomeWork_5.DTOpa.Person;

import java.util.*;

public class LinkedMain {
    public static void main(String[] args){
        List<Person> colectionManOfLink = new LinkedList<>();
        InfToList createColectionManOfLink = new InfToList();
        List<Person> personLink = createColectionManOfLink.toPersonAdd(colectionManOfLink, false);
        InfSort.sortManPas(personLink);
        InfSort.sortManPN(personLink);
        List<Animal> colectionAnimakOfLink = new LinkedList<>();
        InfToList createColectionAnimakOfLink = new InfToList();
        List<Animal> animalLink = createColectionAnimakOfLink.toAnimalAdd(colectionAnimakOfLink, false);
        InfSort.sortAnimPas(animalLink);
        InfSort.sortAnimPN(animalLink);
        List<Person> colectionManOfLinkD = new LinkedList<>();
        createColectionManOfLink.toPersonAdd(colectionManOfLinkD, true);
        List<Animal> colectionAnimakOfLinkD = new LinkedList<>();
        createColectionAnimakOfLink.toAnimalAdd(colectionAnimakOfLinkD, true);
        InfSpeed.checkSpeedIter(personLink);
        InfSpeed.checkSpeedIter(animalLink);
        InfSpeed.checkSpeedFor(personLink);
        InfSpeed.checkSpeedFor(animalLink);
        InfDel.delByTheInterator(personLink);
        InfDel.delByTheInterator(animalLink);
    }
}
