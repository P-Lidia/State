package ru.plidia.stateapp.util;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.plidia.stateapp.entity.Citizen;
import ru.plidia.stateapp.entity.State;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;


public class OperationWithCitizenListTest {
    private OperationWithCitizenList sortTest = new OperationWithCitizenList();
    private static State instance;
    private List<Citizen> citizen;
    private static Citizen citizen1 = new Citizen();
    private static Citizen citizen2 = new Citizen();
    private static Citizen citizen3 = new Citizen();
    private static Citizen citizen4 = new Citizen();
    private static Citizen citizen5 = new Citizen();

    @BeforeSuite
    public void setUp() {
        instance = State.getInstance();
        citizen1.setAge(2);
        citizen2.setAge(25);
        citizen3.setAge(51);
        citizen4.setAge(73);
        citizen5.setAge(90);
        citizen1.setName("Vbtyr");
        citizen2.setName("Ikldyr");
        citizen3.setName("Ydddhgf");
        citizen4.setName("Miuyfjdk");
        citizen5.setName("Iujdfklsrt");
        citizen = new ArrayList<>();
        citizen.add(citizen1);
        citizen.add(citizen2);
        citizen.add(citizen3);
        citizen.add(citizen4);
        citizen.add(citizen5);
        instance.setCitizen(citizen);
    }

    @DataProvider(name = "sorting")
    public static Object[][] createDataToSorting() {
        return new Object[][]{
                {instance}
        };
    }

    @Test(dataProvider = "sorting")
    public void rightAverageCitizenAge(State state) {
        String expected = "Всего жителей - " + 5 + " человек, средний возраст = " + 48 + "\n";
        String actual = sortTest.averageCitizenAge(state);
        Assert.assertEquals(actual, expected, "ошибка");
    }

    @DataProvider(name = "UpperOrLowerCase")
    public static Object[][] createDataToSorting_UpperOrLowerCase() {
        return new Object[][]{
                {instance, "m"},
                {instance, "M"}
        };
    }

    @Test(dataProvider = "UpperOrLowerCase")
    public void rightSortNamesByFirstLetter_UpperOrLowerCase(State state, String str) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(str.getBytes());
        System.setIn(testIn);
        String expected = "Список жителей, чьи имена начинаются на M: \n" + citizen4;
        String actual = sortTest.sortNamesByFirstLetter(state);
        Assert.assertEquals(actual, expected, "ошибка");
    }

    @DataProvider(name = "wrongSymbol")
    public static Object[][] createDataToSortingWrongSymbol() {
        return new Object[][]{
                {instance, "7"},
                {instance, "-1"},
                {instance, "-"},
                {instance, "."},
                {instance, "]"}
        };
    }

    @Test(dataProvider = "wrongSymbol")
    public void sortNamesByFirstLetter_WrongSymbol(State state, String str) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(str.getBytes());
        System.setIn(testIn);
        String expected = "Ввели некорректное значение, попробуйте сделать запрос ещё раз.\n";
        String actual = sortTest.sortNamesByFirstLetter(state);
        Assert.assertEquals(actual, expected, "ошибка");
    }
}