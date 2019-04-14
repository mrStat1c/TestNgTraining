package ru.amelin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class ChildClassTest extends SomethingClassTest1{//при запуске класса, также запустятся все тесты из родительского класса
    //названия методов должны отличаться



    public void newtest1(){
        System.out.println("Test1 from child class");
    }

    public void newtest2(){
        System.out.println("Test2 from child class");
    }

    @BeforeMethod//сначала выполнится Before из родительского класса, потом этот Before
    //будет выполняться и для тестов родительского класса
    public void newbefore(){//перед каждым тестом
        System.out.println("Before method from child class");
    }

    @AfterMethod//сначала выполнится этот After, потом After из родительского класса
    //будет выполняться и для тестов родительского класса
    public void newafter(){//после каждого теста
        System.out.println("After method from child class");
    }
}
