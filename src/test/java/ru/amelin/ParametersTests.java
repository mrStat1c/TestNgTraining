package ru.amelin;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//@Listeners(TestListener.class)
//����������� ��� ��������� ������ (������������ �� ������ � ������� ��������� ������, �� � �� ���� ���������)
@Listeners(RunTwiceInspector.class)//���������� �����������, ������� �������� ����� �� �����-�� ������ ���
public class ParametersTests {

    @Test(dataProviderClass = ParametersTests.class, dataProvider = "somethingProvider")//������������� DataProvider ��� �������������� �����
    //���� ���������� 2 ���� � ������� ����������� (��������� �������� � somethingProvider())
    public void test1(int x1, int x2) {
        System.out.println("Test3: x1 = " + x1 + ", x2 = " + x2);
    }

    @DataProvider
    public Iterator<Object[]> somethingProvider() {
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{1,2});//������ ��� ��������� �������� ����������
        data.add(new Object[]{3,4});
        return data.iterator();
    }


    @Test(retryAnalyzer = RunUntilSuccess.class)//������������ ���������� ��� ���������� ������� ����� (��. ����� RunUntilSuccess)
    public void test2() {
        System.out.println("test2");
    }


//    ��-� IMethodIntercepror ��������� ����������� ������ �������� �������
//    ��-� IAnnotationTranformer ��������� �������� ��������� ��������� ������ �� �����-�� ��������. ��������, ���� ��� ������� �����
//    ���� ���������� ���, ����� ���������� ��� ��������� Test �������� enabled = false. ��������� ������������ � ������� � �����
//    <listener>
}
