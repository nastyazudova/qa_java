import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest {
    private int KittensData;
    public FelineTest(int KittensData) {
        this.KittensData = KittensData;
    }

    @Parameterized.Parameters
    public static Object[][] KittensData() {
        return new Object[][]{
                {0},
                {2},
                {3},
                {500}
        };
    }

    @Test
    public void eatMeatListTest() throws Exception {
        Feline feline = new Feline();
        List actual = feline.eatMeat();
        List expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithoutIntTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithIntTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(KittensData);
        int expected = KittensData;
        assertEquals(expected, actual);
    }


}
