import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline feline;



    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        List expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.verify(feline).getFood("Хищник");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        assertEquals(expectedFood, cat.getFood());
    }



    @Test
    public void getSoundReturnTest() throws Exception {
        Cat cat2 = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat2.getSound();
        assertEquals("Ожидаемый звук не соответствует реальному", expectedSound, actualSound);

    }
}
