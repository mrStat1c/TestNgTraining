package ru.amelin;

import org.testng.annotations.*;

public class SomethingClassTest1 {

    @Test(groups = {"positive", "smoke"})//включение теста в некоторые группы (можно будет запускать только отдельные группы тестов)
    public void test1(){
        System.out.println("Test1");//запустится
    }

    @Test(groups = {"negative", "smoke"})
    public void test2(){
        System.out.println("Test2");//запустится
    }

    @Test(enabled = false)
    public void test3(){
        System.out.println("Test3");//не запустится, т.к. отключен
    }

    @Test
    private void test4(){
        System.out.println("Test4");//private, но тоже запустится т.к. помечен аннотацией
    }

    @BeforeMethod(groups = {"smoke"})//будет запускаться только при запуске тестов с группой smoke
    public void before(){//перед каждым тестом
        System.out.println("Before method");
    }

    @AfterMethod(alwaysRun = true)//будет запускаться независимо от групп (тегов)
    public void after(){//после каждого теста
        System.out.println("After method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("BeforeClass method");
    }

//    @BeforeSuite, @AfterSuite - для пачки запущенных классов
//    теги используются только для фильтрации определенных тестов, в связях между тестами не участвуют
//    @AfterGroups, @BeforeGroups - аннотации для фикстур для указания того, что они запускаются только для тестов с определенными группами
}


