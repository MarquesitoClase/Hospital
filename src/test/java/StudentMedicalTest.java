import org.example.personalhospital.StudiantMedical;
import org.junit.jupiter.api.Test;

public class StudentMedicalTest {
    StudiantMedical student = new StudiantMedical(1L, "Pedro",true,40,10, "Primero de medicina");

    @Test
    public void horasTrabajoSemanalTest(){
        assert student.horasTrabajoSemanal()==10;
    }

    @Test
    public void cursoActualTest(){
        assert student.CursoActual().equals("Primero de medicina");
    }

    @Test
    public void horasDeEstudiosPorSemanaTest(){
        assert student.horasDeEstudiosPorSemana()==40;
    }

}
