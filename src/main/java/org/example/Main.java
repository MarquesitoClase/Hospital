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
        Pacient pacient1 = new Pacient("Juan", 1,
                "Antigripal 10 días");
        Pacient pacient2 = new Pacient("Irene", 25,
                "Gastrectomía Vertical.");
        PacientAmbulancia pambulancia1 = new PacientAmbulancia("Maria",
                1, "Escayolarle el brazo.", 15);
        PacientAmbulancia pambulancia2 = new PacientAmbulancia("José",
                4, "", 15);
        Especialist especialist1 = new Especialist(LocalDate.of(LocalDate.now().getYear(), 6, 1),
                35, 76, "Traumatologo");
        Especialist especialist2 = new Especialist(LocalDate.of(LocalDate.now().getYear(), 6, 1),
                35, 76, "Cardiologo");
        StudiantMedical studiantMedical1 = new StudiantMedical(50, 17,
                "Segundo");
        StudiantMedical studiantMedical2 = new StudiantMedical(50, 17,
                "Tercero");
    }
}