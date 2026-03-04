package org.example.personalhospital;

public class StudiantMedical extends Characters implements DoctorsInterface{
    int treatment;
    int semanalWorkHours;
    String cursoActual;

    public StudiantMedical(Long id, String nombre, boolean esMedico, int treatment, int semanalWorkHours, String cursoActual) {
        super(id, nombre, esMedico);
        this.treatment = treatment;
        this.semanalWorkHours = semanalWorkHours;
        this.cursoActual = cursoActual;
    }

    @Override
    public int lsaborableWeekTime() {
        return this.semanalWorkHours;
    }

    @Override
    public void comer() {
        System.out.println("Estoy lleno.");
    }

    public int semanalStudyHours(){
        return treatment;
    }

    public String CursoActual() {
        return cursoActual;
    }

    public int getTreatment() {
        return treatment;
    }

    public void setTreatment(int treatment) {
        this.treatment = treatment;
    }

    public int getSemanalWorkHours() {
        return semanalWorkHours;
    }

    public void setSemanalWorkHours(int semanalWorkHours) {
        this.semanalWorkHours = semanalWorkHours;
    }

    public String getCursoActual() {
        return cursoActual;
    }

    public void setCursoActual(String cursoActual) {
        this.cursoActual = cursoActual;
    }

    @Override
    public String toString() {
        return "StudiantMedical{" +
                "horas de estudio por semana: =" + treatment +
                ", horas de trabajo por semana: " + semanalWorkHours +
                ", curso actual='" + cursoActual + '\'' +
                '}';
    }
}
