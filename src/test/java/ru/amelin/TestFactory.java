package ru.amelin;

import org.testng.annotations.Factory;

public class TestFactory {

//    ��������� �������� ������ ��� ������ �������
//    �������������� ����������� �������� ������

    @Factory
    public Object[] testFabric(){
        Object[] tests = new Object[3];//���������� �������� �������, ������� ����� �����������
        tests[0] = new ClassTestWithOrdering();
        tests[1] = new SomethingClassTest1();
        tests[2] = new SomethingClassTest2();
        return tests;
    }
}

