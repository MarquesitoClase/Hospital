package org.example.personalhospital;

import java.time.LocalDate;

public class Especialist extends Characters implements DoctorsInterface{

    private LocalDate inicioVacaciones;
    private int diasVacaciones=35;
    private int horasTrabajoSemanal;
    private String especialidad;

    public Especialist(Long id, String nombre, boolean esMedico, LocalDate inicioVacaciones, int diasVacaciones, int horasTrabajoSemanal, String especialidad) {
        super(id, nombre, esMedico);
        this.inicioVacaciones = inicioVacaciones;
        this.diasVacaciones = diasVacaciones;
        this.horasTrabajoSemanal = horasTrabajoSemanal;
        this.especialidad = especialidad;
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

    public int getHorasTrabajoSemanal() {
        return horasTrabajoSemanal;
    }

    public void setHorasTrabajoSemanal(int horasTrabajoSemanal) {
        this.horasTrabajoSemanal = horasTrabajoSemanal;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public int horasTrabajoSemanal() {
        return horasTrabajoSemanal;
    }

    @Override
    public void comer() {
        System.out.println("Yo, el medico "+this.getNombre()+", me voy a comer.");
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
                ", horasTrabajoSemanal=" + horasTrabajoSemanal +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
