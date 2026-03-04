package org.example.personalhospital;

public class StudiantMedical extends Characters implements DoctorsInterface{
    int semanalStudyHours;
    int semanalWorkHours;
    String cursoActual;

    public StudiantMedical(Long id, String nombre, boolean esMedico, int semanalStudyHours, int semanalWorkHours, String cursoActual) {
        super(id, nombre, esMedico);
        this.semanalStudyHours = semanalStudyHours;
        this.semanalWorkHours = semanalWorkHours;
        this.cursoActual = cursoActual;
    }

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

    @Override
    public String toString() {
        return "StudiantMedical{" +
                "seminalStudyHours=" + semanalStudyHours +
                ", semanalWorkHours=" + semanalWorkHours +
                ", cursoActual='" + cursoActual + '\'' +
                '}';
    }
}
