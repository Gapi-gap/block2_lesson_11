import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import org.mockito.Mockito;
import ru.netology.statistic.DataClass.PosterManager;

import static org.mockito.Answers.CALLS_REAL_METHODS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.withSettings;

public class PosterManagerTest {


    String poster1 = "Шрек";
    String poster2 = "Кот в сапогах";
    String poster3 = "Гарри Поттер";

    // poster.addPoster(poster1);
    // poster.addPoster(poster2);
    //poster.addPoster(poster3);
    @Test
    public void checkingInitializationConstruct() {

        PosterManager mockManager = new PosterManager();
        int expected = 5;
        Assertions.assertEquals(expected, mockManager.getPrintLastposter());
    }

    @Test
    public void CheckingInitializationConstructorParameters() {
        PosterManager poster = new PosterManager(3);
        int expected = 3;
        Assertions.assertEquals(expected, poster.getPrintLastposter());
    }


}
