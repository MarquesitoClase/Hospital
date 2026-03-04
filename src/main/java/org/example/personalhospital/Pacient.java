package org.example.personalhospital;

import javax.swing.table.TableCellRenderer;
import java.time.LocalDate;

public class Pacient extends Characters implements PacientsInterface {
    private String name;
    private LocalDate incomeDate;
    private LocalDate outcomingDate = null;
    private int room=0;
    private String treatment;

    public Pacient( Long id,String name, int room, String treatment, int daysInto) {
        super(id, name, false);
        this.incomeDate = LocalDate.now();
        this.setRoom(room);
        this.setOutcomingDate(incomeDate.plusDays(Long.parseLong(String.valueOf(daysInto))));
        this.treatment = treatment;
    }

    @Override
    public void Admision() {
        this.incomeDate = LocalDate.now();
        room++;
        this.setRoom(room);
    }

    @Override
    public void room() {
        System.out.println("Mi habitación es la nº "+room);
    }

    @Override
    public void treatment() {
        System.out.println(treatment);
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

    public String getTreatment() {
        return treatment;
    }

    public void settreatment(String treatment) {
        this.treatment = treatment;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "name='" + this.getName() + '\'' +
                ", incomeDate=" + incomeDate +
                ", outcomingDate=" + outcomingDate +
                ", room=" + getRoom() +
                ", treatment='" + getTreatment() + '\'' +
                '}';
    }
    
}
