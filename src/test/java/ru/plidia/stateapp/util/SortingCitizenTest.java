package ru.plidia.stateapp.util;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.plidia.stateapp.entity.Citizen;
import ru.plidia.stateapp.entity.State;

import java.util.ArrayList;
import java.util.List;

public class SortingCitizenTest {

    private SortingCitizen sortTest = new SortingCitizen();
    private static State instance;
    private List<Citizen> citizen;
    private static Citizen citizen1 = new Citizen("Hsrrdcdd", "Ksdfvs", 2);
    private static Citizen citizen2 = new Citizen("Andnssd", "Ocbdcvd", 25);
    private static Citizen citizen3 = new Citizen("Mddfg", "Vddfdjk", 51);
    private static Citizen citizen4 = new Citizen("Nsjdfsddyt", "Psdnssd", 73);
    private static Citizen citizen5 = new Citizen("Zhdfluytr", "Hsfbhdf", 90);


    @BeforeSuite
    public void setUp() {
        instance = State.getInstance();
        citizen = new ArrayList<>();
        citizen.add(citizen1);
        citizen.add(citizen2);
        citizen.add(citizen3);
        citizen.add(citizen4);
        citizen.add(citizen5);
        instance.setCitizen(citizen);
    }

    @DataProvider(name = "create")
    public static Object[][] createData() {
        return new Object[][]{
                new Object[]{instance}
        };
    }

    @Test(dataProvider = "create")
    public void rightAverageCitizenAge(State state) {
        int num = 0;
        for (int i = 0; i < 5; i++) {
            num = num + state.getCitizen().get(i).getAge();
        }
        num = num / 5;
        String expected = "Всего жителей - " + 5 + " человек, средний возраст = " + num + "\n";
        String actual = sortTest.averageCitizenAge(state);
        Assert.assertEquals(actual, expected, "ошибка");

    }
}



