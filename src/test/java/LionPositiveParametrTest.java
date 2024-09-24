import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionPositiveParametrTest {
    private String LionDataPositive;

    public LionPositiveParametrTest(String LionDataPositive) {
        this.LionDataPositive = LionDataPositive;
    }

    @Parameterized.Parameters
    public static Object[][] LionDataPositive() {
        return new Object[][]{
                {"Самец"},
                {"Самка"},
        };
    }


    @Test()
    public void doesHaveManePositiveTest() throws Exception {
        Lion lion = new Lion(LionDataPositive);
        boolean expected = false;
        if (LionDataPositive.equals("Самец")) {
            expected = true;
        } else if (LionDataPositive.equals("Самка")) {
            expected = false;}

        boolean actual = lion.doesHaveMane();
        assertEquals(expected,actual);
    }

}
