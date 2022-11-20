package com.example.youtubeplayerview;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ExampleUnitTest {
    @Ignore
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void parametrsSinLessonsAreEqual(){
        int expected = 36;//12 уроков по 3% за каждый всех уроков
        App test = new App();
        int actual =App.CountSinLessonsScore();
        assertEquals(expected,actual);
    }

    @Test
    public void parametrsDrumLessonsAreEqual(){
        int number = 36;//12 уроков по 3% за каждый всех уроков
        App test = new App();
        int actual =App.CountDrumLessons();
        assertEquals(number,actual);
    }
    @Test
    public void parametrsGuitarLessonsAreEqual(){
        int number = 37;//12 уроков по 3% за каждый всех уроков
        App test = new App();
        int actual =App.CountGuitarLessonsScore();
        assertEquals(number,actual);
    }
    @Test
    public void YoutubeURL(){
        String URL = "g7ACnx_dFoM";//Ссылка на урок с синтезатором
        App test = new App();
        String actual = App.Sin_MainURLYT();
        assertEquals(URL,actual);
    }
    @Test
    public void storeValueIntTNotNull(){
        Integer tests = 1;//Сохранение числа
        App test = new App();
        Integer actual = App.storeValueIntT("Test",tests);
        assertNotNull(actual);
    }
    @Test
    public void storeValueIntTEqual(){
        Integer q = 1;//Сохранение числа
        App test = new App();
        Integer actual = App.storeValueIntT("Test",q);
        assertEquals(actual,q);
    }
    @Test
    public void Fetch(){
        String tests = "null";//Выгрузка без файла записного файла
        App test = new App();
        String actual = App.fetchValueStringT("key");
        assertEquals(actual,tests);
    }
    @Test
    public void CountDrumLessonsForN(){
        Integer tests =15;//Подсчет для n кол-ва уроков
        App test = new App();
        Integer actual = App.CountDrumLessonsForLessons(5);
        assertEquals(tests,actual);
    }
    @Test
    public void CountGuitarLessonsForN(){
        Integer tests =15;//Подсчет для n кол-ва уроков
        App test = new App();
        Integer actual = App.CountGuitarLessonsForLessons(5);
        assertEquals(tests,actual);
    }
    @Test
    public void CountSinLessonsForN(){
        Integer tests =24;//Подсчет для n кол-ва уроков
        App test = new App();
        Integer actual = App.CountSinLessonsForLessons(8);
        assertEquals(tests,actual);
    }
}