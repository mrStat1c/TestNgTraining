package ru.amelin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class ChildClassTest extends SomethingClassTest1{//��� ������� ������, ����� ���������� ��� ����� �� ������������� ������
    //�������� ������� ������ ����������



    public void newtest1(){
        System.out.println("Test1 from child class");
    }

    public void newtest2(){
        System.out.println("Test2 from child class");
    }

    @BeforeMethod//������� ���������� Before �� ������������� ������, ����� ���� Before
    //����� ����������� � ��� ������ ������������� ������
    public void newbefore(){//����� ������ ������
        System.out.println("Before method from child class");
    }

    @AfterMethod//������� ���������� ���� After, ����� After �� ������������� ������
    //����� ����������� � ��� ������ ������������� ������
    public void newafter(){//����� ������� �����
        System.out.println("After method from child class");
    }
}
