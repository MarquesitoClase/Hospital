package org.example.personalhospital;

import java.time.LocalDate;

public class PacientAmbulancia extends Pacient implements PacienteAmbulanciaInterface {
    public PacientAmbulancia(String name, int habitacion, String tratamiento, int diasReha) {
        super(12L, name, habitacion, tratamiento);
        this.setTratamiento(tratamiento);
        this.setOutcomingDate(LocalDate.now().plusDays(diasReha));
    }

    @Override
    public void rehabilitacion() {
        System.out.println("Llendo a mi sesion de rehabilitación.");
    }

    @Override
    public void operacion() {
        System.out.println("El paciente "+name+" se llevo a operarse.");
    }

    @Override
    public String toString() {
        return "PacientAmbulancia{" +
                "name='" + getname() + '\'' +
                ", incomeDate=" + getIncomeDate() +
                ", outcomingDate=" + getOutcomingDate() +
                ", habitacion=" + getHabitacion() +
                ", Tratamiento='" + getTratamiento() + '\'' +
                '}';
    }
}
