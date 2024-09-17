import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    private Feline feline;

    @Test
    public void test1() throws Exception {

        feline.eatMeat();
        feline.getFamily();
        feline.getKittens();
        feline.getKittens(2);
        Mockito.verify(feline).eatMeat();
        Mockito.verify(feline).getFamily();
        Mockito.verify(feline).getKittens();
        Mockito.verify(feline).getKittens(2);
    }
    @Test
    public void test2() throws Exception {
        Feline feline1 = new Feline();
        feline1.eatMeat();
        feline1.getFamily();
        feline1.getKittens();
        feline1.getKittens(2);

    }
}
