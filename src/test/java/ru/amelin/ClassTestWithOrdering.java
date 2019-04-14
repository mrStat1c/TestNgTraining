package ru.amelin;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTestWithOrdering {

    @Test(priority = 10)//чем меньше, тем первее запустится
    public void test1(){
        System.out.println("Test1");
    }

    @Test(dependsOnMethods = "test1", alwaysRun = true)//зависит от теста 1 => сначала запустится test 1, а потом если test 1 пройдет,
    //запустится test 2, alwaysRun говорит о том, что если даже test1 упадет, test2 в любом случае запустится
    public void test2(){
        System.out.println("Test2");
    }

    @Test
    @Parameters({"firstArgument", "secondArgument"})//можно описать в конфигурационном файле, какие значения будут подставляться при запуске
    //чаще применяется для фикстур
    //плохой подход т.к. слишком много описывать в конфигурационном файле
    public void test3(int x1, int x2){
        System.out.println("Test3: x1 = " + x1 +"x2 = " + x2);
    }
}
