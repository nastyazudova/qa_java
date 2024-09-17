import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

    @Test
    public void ExceptionTest() throws Exception {
        Lion lion = new Lion("Самец1");
        lion.doesHaveMane();
    }
}
