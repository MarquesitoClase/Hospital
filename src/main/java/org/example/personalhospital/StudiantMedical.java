package org.example.personalhospital;

public class StudiantMedical implements DoctorsInterface{
    int semanalStudyHours;
    int semanalWorkHours;
    String cursoActual;



    @Override
    public int horasTrabajoSemanal() {
        return semanalWorkHours;
    }

    @Override
    public void comer() {
        System.out.println("Estoy lleno.");
    }

    public int horasDeEstudiosPorSemana(){
        return semanalStudyHours;
    }

    public String CursoActual() {
        return cursoActual;
    }
}
