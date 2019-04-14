package ru.amelin;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

public class RunTwiceInspector implements IHookable {//позволяет заменить выполнение теста на выполнение другого кода

//iHookCallBack - тестовый метод, который должен быть запущен
    public void run(IHookCallBack iHookCallBack, ITestResult iTestResult) {
        System.out.println("Start something...");
    }
}
