package org.example.personalhospital;

import java.time.LocalDate;

public class PacientAmbulancia extends Pacient implements PacienteAmbulanciaInterface {
    public PacientAmbulancia(String nombre, int habitacion, String tratamiento, int diasReha) {
        super(12L, nombre, habitacion, tratamiento);
        this.setTratamiento(tratamiento);
        this.outcomingDate = LocalDate.now().plusDays(diasReha);
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
                "name='" + name + '\'' +
                ", incomeDate=" + incomeDate +
                ", outcomingDate=" + outcomingDate +
                ", habitacion=" + habitacion +
                ", Tratamiento='" + Tratamiento + '\'' +
                '}';
    }
}
