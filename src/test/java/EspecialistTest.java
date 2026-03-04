import org.example.personalhospital.Especialist;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class EspecialistTest {
    Especialist especialist = new Especialist(1L, "Ana", true,LocalDate.of(LocalDate.now().getYear(), 6, 1),60,50,"Cardiologo");
    @Test
    public  void especialidadTest(){
        assert especialist.getEspecialidad().equals("Cardiologo");
    }
    @Test
    public void especialidadNonPodologo() {
        assert !especialist.getEspecialidad().equals("Podologo");
    }
}