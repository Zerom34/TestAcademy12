package Test.HomeWork_6.Quest4;

import HomeWork_6.interf.ISearchEngine;
import HomeWork_6.quest4.RegExSearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegExSearchTest {
    @Test
    public void ezT1(){
        ISearchEngine test=new RegExSearch();
        assertEquals(1,test.search("Мир миром, Миру мира, миру. Мир, мир?", "мир"));
        assertEquals(2,test.search("Мир миром, Миру мира, миру. Мир, мир?", "Мир"));
        assertEquals(0,test.search("Мир миром, Миру мира, миру. Мир, мир?", "Мира"));
        assertEquals(1,test.search("Мир миром, Миру мира, миру. Мир, мир?", "Миру"));
        assertEquals(0,test.search("Мир миром, Миру мира, миру. Мир, мир?", "МИр"));
        assertEquals(0,test.search("Мир миром, Миру мира, миру. Мир, мир?", "МИР"));
        assertEquals(1,test.search("Мир миром, Миру мира, миру. Мир, мир?", "мира"));
    }

    @Test
    public void ezT2(){
        ISearchEngine test=new RegExSearch();
        assertEquals(0,test.search("Мир миром, Миру мира, миру. Мир, мир?", "и"));
        assertEquals(0,test.search("Мир миром, Миру мира, миру. Мир, мир?", "И"));
    }

    @Test
    public void ezT3(){
        ISearchEngine test=new RegExSearch();
        assertEquals(2,test.search("Привет-пока, и вновь привет, а и, забыл, пока. И?", "и"));
        assertEquals(1,test.search("Привет-пока, и вновь привет, а и, забыл, пока. И?", "И"));
    }

    @Test
    public void ezT4(){
        ISearchEngine test=new RegExSearch();
        assertEquals(3,test.search("МИр, миР, МИР, мИр, мириться, мера, мИР, мир-мир, мир, Мир?Мир", "мир"));
        assertEquals(2,test.search("МИр, миР, МИР, мИр, мириться, мера, мИР, мир-мир, мир, Мир?Мир", "Мир"));
    }

    @Test
    public void ezT5(){
        ISearchEngine test=new RegExSearch();
        assertEquals(0,test.search("", "и"));
        assertEquals(0,test.search("", "мир"));
        assertEquals(0,test.search("", " "));
    }
    @Test
    public void ezT6(){
        ISearchEngine test=new RegExSearch();
        assertEquals(1,test.search("привет, как дела", "дела"));
        assertEquals(1,test.search("привет,какдела", "привет"));
        assertEquals(1,test.search("привет;какдела", "привет"));
        assertEquals(1,test.search("Привет -привет", "привет"));
        assertEquals(1,test.search("бабушка бабушке бабушку", "бабушку"));
    }
}