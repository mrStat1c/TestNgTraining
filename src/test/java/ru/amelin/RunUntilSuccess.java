package ru.amelin;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RunUntilSuccess implements IRetryAnalyzer {

//    если true (когда тест не прошел), тогда запустить тест повторно
    public boolean retry(ITestResult iTestResult) {
        return !iTestResult.isSuccess();
    }
}
