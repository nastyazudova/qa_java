import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class LionNegativeParametrTest {
    private String LionDataNegative;

    public LionNegativeParametrTest( String LionDataNegative) {
        this.LionDataNegative = LionDataNegative;
    }

    @Parameterized.Parameters
    public static Object[][] LionDataNegative() {
        return new Object[][]{
                {"Самка1"},
                {"null"}
        };
    }

    @Test()
    public void doesHaveManeExceptionTest() throws Exception {

        try {
            Lion lion = new Lion(LionDataNegative);
            lion.doesHaveMane();
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - Самец или Самка",
                    e.getMessage());
            return;
        }
        fail("Expected validation exception was not thrown");
    }

}

