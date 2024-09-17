import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(feline);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(feline);
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

   @Test
   public void MaleTest() throws Exception {
      Lion lion = new Lion("Самец");
      lion.doesHaveMane();
   }

   @Test
   public void FemaleTest() throws Exception {
      Lion lion = new Lion("Самка");
      lion.doesHaveMane();
   }
}