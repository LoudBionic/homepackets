import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.homepackets.services.FreelanceService;


public class FreelanceServiceTest {

    @Test
    void shouldCalculateForCount() {
        FreelanceService service = new FreelanceService();


        int income =100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;


        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }


}
