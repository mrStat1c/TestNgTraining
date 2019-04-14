package ru.amelin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

@Test
public class SomethingClassTest2 {


    public void test1() {
        System.out.println("Test1");//запустится
    }


    private void test2() {
        System.out.println("Test2");//не запустится, т.к. private и @Test только у класса
    }

    @Test(enabled = false)
    public void test3() {
        System.out.println("Test3");//не запустится
    }

    public void test4() {
        System.out.println("Test4");//запустится
        Assert.assertEquals(1, 2);
    }

    @AfterMethod
//    инъекция тестового результата в фикстуру AfterMethod
    public void afterMethod(ITestResult result) {
        if (!result.isSuccess()) {
            System.out.println("Repair data!");
        }
    }

    @BeforeMethod
//    инъекция информации о методе (тесте) в фикстуру BeforeMethod либо AfterMethod (тип Method из Reflection)
//    также можно передавать информацию о тесте в DataProvider
    public void beforeMethod(Method method) {
        System.out.println("Will call test " + method.getName());
        System.out.println("Annotations of tests:" + Arrays.toString(method.getDeclaredAnnotations()));
    }
}

