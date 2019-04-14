package ru.amelin;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RunUntilSuccess implements IRetryAnalyzer {

//    ���� true (����� ���� �� ������), ����� ��������� ���� ��������
    public boolean retry(ITestResult iTestResult) {
        return !iTestResult.isSuccess();
    }
}
