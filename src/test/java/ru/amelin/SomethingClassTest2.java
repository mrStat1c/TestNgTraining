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
        System.out.println("Test1");//����������
    }


    private void test2() {
        System.out.println("Test2");//�� ����������, �.�. private � @Test ������ � ������
    }

    @Test(enabled = false)
    public void test3() {
        System.out.println("Test3");//�� ����������
    }

    public void test4() {
        System.out.println("Test4");//����������
        Assert.assertEquals(1, 2);
    }

    @AfterMethod
//    �������� ��������� ���������� � �������� AfterMethod
    public void afterMethod(ITestResult result) {
        if (!result.isSuccess()) {
            System.out.println("Repair data!");
        }
    }

    @BeforeMethod
//    �������� ���������� � ������ (�����) � �������� BeforeMethod ���� AfterMethod (��� Method �� Reflection)
//    ����� ����� ���������� ���������� � ����� � DataProvider
    public void beforeMethod(Method method) {
        System.out.println("Will call test " + method.getName());
        System.out.println("Annotations of tests:" + Arrays.toString(method.getDeclaredAnnotations()));
    }
}

