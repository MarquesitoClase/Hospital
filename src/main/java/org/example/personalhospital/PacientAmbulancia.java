package org.example.personalhospital;

import java.time.LocalDate;

public class PacientAmbulancia extends Pacient implements PacienteAmbulanciaInterface {
    static Long  actualId = 0L;
    static int actualRoom = 0;
    //( Long id,String name, int room, String treatment, int daysInto)
    public PacientAmbulancia(String name, int habitacion, String treatment, int diasReha) {
        super(actualId, name, habitacion, treatment, actualRoom);
        actualRoom++;
        actualId++;
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
                ", fecha de admisión del paciente:" + getIncomeDate() +
                ", Fecha de alto esperada:" + getOutcomingDate() +
                ", habitacion=" + getRoom() +
                ", treatment='" + getTreatment() + '\'' +
                '}';
    }
}
