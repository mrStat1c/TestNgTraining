package ru.amelin;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;


public class TestListener implements IInvokedMethodListener {

    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {//инжектится информация о тестовом методе
        if (iInvokedMethod.isTestMethod()) {//условие на то, что метод является тестом, а не фикстурой
            System.out.println("Something happened before start test method " + iInvokedMethod.getTestMethod().getMethodName());
        }
    }

    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        if (iInvokedMethod.isTestMethod()) {
            System.out.println("Something happened after finish test method " + iInvokedMethod.getTestMethod().getMethodName());
        }
    }

//    получается что-то типа фикстуры
}
