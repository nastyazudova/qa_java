import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void getFoodTest() {
        Lion lion = new Lion(feline);
        try {
            lion.getFood();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            Mockito.verify(feline).getFood("Хищник");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void getFoodTestList()  {
        Feline feline1 = new Feline();
        Lion lion = new Lion(feline1);
        List actual = null;
        try {
            actual = lion.getFood();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        List expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensTest() {
        Lion lion = new Lion(feline);
        lion.getKittens();
        Mockito.verify(feline).getKittens();
        int kittensCount=1;
        Mockito.when(feline.getKittens()).thenReturn(kittensCount);
        assertEquals(kittensCount, lion.getKittens());
    }



}