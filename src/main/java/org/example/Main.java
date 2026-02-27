package org.example;

import org.example.personalhospital.Pacient;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Pacient pacient1 = new Pacient("Juan", 1,
                "Amputarle el brazo.");
        Pacient pacient2 = new Pacient("Irene", 25,
                "Gastrectomía Vertical.");
        Pacient pacient3 = new Pacient("Pedro", 36,
                "Escayolarle el brazo izquierdo.");
        Pacient pacient4 = new Pacient("Sara", 25,
                "Operación de estetica tipo 2.");
    }
}
