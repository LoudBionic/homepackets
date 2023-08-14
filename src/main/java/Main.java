import ru.netology.services.homepackets.services.FreelanceService;

public class Main {
    public static void main(String[] args) {

        FreelanceService service = new FreelanceService();

        int count = service.calculate(100000, 60000, 150000);

        System.out.println(count);
    }
}
