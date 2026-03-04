package org.example.personalhospital;

import java.time.LocalDate;

public class Pacient extends Characters implements PacientsInterface {
    String name;
    LocalDate incomeDate;
    LocalDate outcomingDate = null;
    static int room=0;
    int habitacion;
    String Tratamiento;

    public Pacient( Long id,String nombre, int habitacion, String tratamiento) {
        super(id, nombre, false);
        this.incomeDate = LocalDate.now();
        this.habitacion = habitacion;
        Tratamiento = tratamiento;
    }

    @Override
    public void Admision() {
        this.incomeDate = LocalDate.now();
        room++;
        this.habitacion = room;
    }

    @Override
    public void habitacion() {
        System.out.println("Mi habitación es la nº "+habitacion);
    }

    @Override
    public void tratamiento() {
        System.out.println(Tratamiento);
    }

    @Override
    public void salida() {
        outcomingDate = LocalDate.now();
        System.out.println("Estuviste "+(outcomingDate.getDayOfYear()-
                incomeDate.getDayOfYear())+" dias ingresado");
    }

    public LocalDate getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(LocalDate incomeDate) {
        this.incomeDate = incomeDate;
    }

    public LocalDate getOutcomingDate() {
        return outcomingDate;
    }

    public void setOutcomingDate(LocalDate outcomingDate) {
        this.outcomingDate = outcomingDate;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public String getTratamiento() {
        return Tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        Tratamiento = tratamiento;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "name='" + name + '\'' +
                ", incomeDate=" + incomeDate +
                ", outcomingDate=" + outcomingDate +
                ", habitacion=" + habitacion +
                ", Tratamiento='" + Tratamiento + '\'' +
                '}';
    }
}
