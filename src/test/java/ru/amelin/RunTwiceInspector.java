package ru.amelin;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

public class RunTwiceInspector implements IHookable {//��������� �������� ���������� ����� �� ���������� ������� ����

//iHookCallBack - �������� �����, ������� ������ ���� �������
    public void run(IHookCallBack iHookCallBack, ITestResult iTestResult) {
        System.out.println("Start something...");
    }
}
