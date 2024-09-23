import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParametrTest {
    private String LionDataPositive;
    private String LionDataNegative;


    public LionParametrTest(String LionDataPositive, String LionDataNegative) {
        this.LionDataPositive = LionDataPositive;
        this.LionDataNegative = LionDataNegative;
    }


    @Parameterized.Parameters
    public static Object[][] LionDataPositive() {
        return new Object[][]{
                {"Самец"},
                {"Самка"},
        };
    }
    @Parameterized.Parameters
    public static Object[][] LionDataNegative() {
        return new Object[][]{
                {"Самка1"},
                {"null"}
        };
    }

    @Test(expected = Exception.class)
    public void doesHaveManeException() throws Exception {
        Lion lion = new Lion(LionDataNegative);

        boolean expected = false;
        if (LionDataNegative.equals("Самец")) {
            expected = true;
        } else if (LionDataNegative.equals("Самка")) {
            expected = false;}

        boolean actual = lion.doesHaveMane();
        assertEquals(expected,actual);


    }

    @Test()
    public void doesHaveMane() throws Exception {
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
