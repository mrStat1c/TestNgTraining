package ru.amelin;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//@Listeners(TestListener.class)
//наблюдатель для тестового класса (подключается не только к данному тестовому классу, но и ко всем остальным)
@Listeners(RunTwiceInspector.class)//подключает перехватчик, который заменяет тесты на какой-то другой код
public class ParametersTests {

    @Test(dataProviderClass = ParametersTests.class, dataProvider = "somethingProvider")//использование DataProvider для параметризации теста
    //тест запустится 2 раза с разными параметрами (параметры задаются в somethingProvider())
    public void test1(int x1, int x2) {
        System.out.println("Test3: x1 = " + x1 + ", x2 = " + x2);
    }

    @DataProvider
    public Iterator<Object[]> somethingProvider() {
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{1,2});//задаем все возможные варианты параметров
        data.add(new Object[]{3,4});
        return data.iterator();
    }


    @Test(retryAnalyzer = RunUntilSuccess.class)//использовать анализатор для повторного запуска теста (см. класс RunUntilSuccess)
    public void test2() {
        System.out.println("test2");
    }


//    ин-с IMethodIntercepror позволяет упорядочить запуск тестовых методов
//    ин-с IAnnotationTranformer позволяет изменить аннотации тестового метода по каким-то условиям. Например, если для данного теста
//    есть незакрытый баг, можно проставить для аннотации Test параметр enabled = false. Настройка производится в конфиге в тегах
//    <listener>
}
