package org.example.personalhospital;

import java.time.LocalDate;

public class PacientAmbulancia extends Pacient implements PacienteAmbulanciaInterface {
    public PacientAmbulancia(String name, int habitacion, String treatment, int diasReha) {
        super(12L, name, habitacion, treatment);
        this.settreatment(treatment);
        this.setOutcomingDate(LocalDate.now().plusDays(diasReha));
    }

    @Override
    public void rehabilitacion() {
        System.out.println("Llendo a mi sesion de rehabilitación.");
    }

    @Override
    public void operacion() {
        System.out.println("El paciente "+getName()+" se llevo a operarse.");
    }

    @Override
    public String toString() {
        return "PacientAmbulancia{" +
                "name='" + getName() + '\'' +
                ", incomeDate=" + getIncomeDate() +
                ", outcomingDate=" + getOutcomingDate() +
                ", habitacion=" + getRoom() +
                ", treatment='" + getTreatment() + '\'' +
                '}';
    }
}
