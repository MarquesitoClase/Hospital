package org.example;

import org.example.personalhospital.Especialist;
import org.example.personalhospital.Pacient;
import org.example.personalhospital.PacientAmbulancia;
import org.example.personalhospital.StudiantMedical;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Pacient pacient1 = new Pacient(1L,"Juan", 1,
                "Antigripal 10 días", 0);
        Pacient pacient2 = new Pacient(2L, "Irene", 25,
                "Gastrectomía Vertical.", 7);
        PacientAmbulancia pambulancia1 = new PacientAmbulancia("María",
                15,"Asistirla al dar a luz",10);
        PacientAmbulancia pambulancia2 = new PacientAmbulancia("José",
                4, "Coma inducido.", 300);
        Especialist especialist1 = new Especialist(3L, "Pepe", true,
                LocalDate.of(LocalDate.now().getYear(), 6, 1),
                35, 76, "Traumatologo");
        Especialist especialist2 = new Especialist(4L,"Lucas",true,
                LocalDate.of(LocalDate.now().getYear(), 6, 1),
                35, 76, "Cardiologo");
        StudiantMedical studiantMedical1 = new StudiantMedical(5L, "Sara", true,
                50, 17,"Segundo");
        StudiantMedical studiantMedical2 = new StudiantMedical(6L, "Icker", true,
                50, 17, "Tercero");
        System.out.println(pacient1+"\n"+ pacient2);
        System.out.println(pambulancia1+"\n"+pambulancia2);
        System.out.println(especialist1+"\n"+especialist2);
        System.out.println(studiantMedical1+"\n"+studiantMedical2);
    }
}