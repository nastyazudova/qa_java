import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTestParametr {
    private String LionData;


    public LionTestParametr(String LionData) {
        this.LionData = LionData;
    }

    @Parameterized.Parameters
    public static Object[][] LionData() {
        return new Object[][]{
                {"Самец"},
                {"Самка"}
        };
    }

    @Test
    public void test() throws Exception {
        Lion lion = new Lion(LionData);

        boolean expected = false;
        if (LionData.equals("Самец")) {
            expected = true;
        } else if (LionData.equals("Самка")) {
            expected = false;}
        boolean b = lion.doesHaveMane();
        assertEquals(expected,b);


    }

}
