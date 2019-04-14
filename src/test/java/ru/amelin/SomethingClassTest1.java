package ru.amelin;

import org.testng.annotations.*;

public class SomethingClassTest1 {

    @Test(groups = {"positive", "smoke"})//��������� ����� � ��������� ������ (����� ����� ��������� ������ ��������� ������ ������)
    public void test1(){
        System.out.println("Test1");//����������
    }

    @Test(groups = {"negative", "smoke"})
    public void test2(){
        System.out.println("Test2");//����������
    }

    @Test(enabled = false)
    public void test3(){
        System.out.println("Test3");//�� ����������, �.�. ��������
    }

    @Test
    private void test4(){
        System.out.println("Test4");//private, �� ���� ���������� �.�. ������� ����������
    }

    @BeforeMethod(groups = {"smoke"})//����� ����������� ������ ��� ������� ������ � ������� smoke
    public void before(){//����� ������ ������
        System.out.println("Before method");
    }

    @AfterMethod(alwaysRun = true)//����� ����������� ���������� �� ����� (�����)
    public void after(){//����� ������� �����
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

//    @BeforeSuite, @AfterSuite - ��� ����� ���������� �������
//    ���� ������������ ������ ��� ���������� ������������ ������, � ������ ����� ������� �� ���������
//    @AfterGroups, @BeforeGroups - ��������� ��� ������� ��� �������� ����, ��� ��� ����������� ������ ��� ������ � ������������� ��������
}


