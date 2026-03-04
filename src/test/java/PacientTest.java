import org.example.personalhospital.Pacient;
import org.junit.jupiter.api.Test;

public class PacientTest {
    Pacient pacient = new Pacient(1L, "Juan", 1, "Traqueotomía");

    @Test
    public void admisionTest(){
        pacient.Admision();
        int room = pacient.getRoom();
        String name = pacient.getNombre();
    }
}
