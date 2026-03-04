package org.example.personalhospital;

import java.time.LocalDate;

public class Especialist extends Characters implements DoctorsInterface{

    private LocalDate inicioVacaciones;
    private int diasVacaciones=35;
    private int laborableWeekTime;
    private String speciality;

    public Especialist(Long id, String nombre, boolean esMedico, LocalDate inicioVacaciones, int diasVacaciones, int laborableWeekTime, String speciality) {
        super(id, nombre, esMedico);
        this.inicioVacaciones = inicioVacaciones;
        this.diasVacaciones = diasVacaciones;
        this.laborableWeekTime = laborableWeekTime;
        this.speciality = speciality;
    }

    public LocalDate getInicioVacaciones() {
        return inicioVacaciones;
    }

    public void setInicioVacaciones(LocalDate inicioVacaciones) {
        this.inicioVacaciones = inicioVacaciones;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }

    public int getlaborableWeekTime() {
        return laborableWeekTime;
    }

    public void setlaborableWeekTime(int laborableWeekTime) {
        this.laborableWeekTime = laborableWeekTime;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public int lsaborableWeekTime() {
        return this.laborableWeekTime;
    }

    @Override
    public void comer() {
        System.out.println("Yo, el medico "+this.getName()+", me voy a comer.");
    }

    public boolean vacaciones(){
        return (LocalDate.now().isAfter(inicioVacaciones)) &&
                (LocalDate.now().isBefore(inicioVacaciones.plusDays(diasVacaciones)));
    }

    @Override
    public String toString() {
        return "Especialist{" +
                "inicioVacaciones=" + inicioVacaciones +
                ", diasVacaciones=" + diasVacaciones +
                ", laborableWeekTime=" + laborableWeekTime +
                ", especialidad='" + speciality + '\'' +
                '}';
    }
}
