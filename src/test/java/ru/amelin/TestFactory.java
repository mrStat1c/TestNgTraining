package ru.amelin;

import org.testng.annotations.Factory;

public class TestFactory {

//    генерация тестовых данных для группы методов
//    параметризация генераторов тестовых данных

    @Factory
    public Object[] testFabric(){
        Object[] tests = new Object[3];//экзмепляры тестовых классов, которые будут запускаться
        tests[0] = new ClassTestWithOrdering();
        tests[1] = new SomethingClassTest1();
        tests[2] = new SomethingClassTest2();
        return tests;
    }
}

