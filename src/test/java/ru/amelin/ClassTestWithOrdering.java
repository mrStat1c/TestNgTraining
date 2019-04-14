package ru.amelin;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTestWithOrdering {

    @Test(priority = 10)//��� ������, ��� ������ ����������
    public void test1(){
        System.out.println("Test1");
    }

    @Test(dependsOnMethods = "test1", alwaysRun = true)//������� �� ����� 1 => ������� ���������� test 1, � ����� ���� test 1 �������,
    //���������� test 2, alwaysRun ������� � ���, ��� ���� ���� test1 ������, test2 � ����� ������ ����������
    public void test2(){
        System.out.println("Test2");
    }

    @Test
    @Parameters({"firstArgument", "secondArgument"})//����� ������� � ���������������� �����, ����� �������� ����� ������������� ��� �������
    //���� ����������� ��� �������
    //������ ������ �.�. ������� ����� ��������� � ���������������� �����
    public void test3(int x1, int x2){
        System.out.println("Test3: x1 = " + x1 +"x2 = " + x2);
    }
}
