import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline feline;

    @Mock
    Cat cat1 = new Cat(feline);

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void getSoundTest() throws Exception {
        cat1.getSound();
        Mockito.verify(cat1).getSound();
    }

    @Test
    public void getSoundReturnTest() throws Exception {
        Cat cat2 = new Cat(feline);
        String i = cat2.getSound();
        System.out.println(i);

    }
}
