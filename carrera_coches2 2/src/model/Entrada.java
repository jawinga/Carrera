package model;
//programa de Cristian Harders López
//Trabajo evaluable PRO - Carrera de coches

import java.util.ArrayList;
import java.util.List;

public class Entrada {
    public static void main(String[] args) {
        List<Coche> participantes = new ArrayList<>();
        participantes.add(new Coche("Ferrari", "F8", "544535H", 200, 100, 0, 0));
        participantes.add(new Coche("Opel", "Corsa", "123343Y", 92, 80, 0, 0));

        Carrera carrera = new Carrera(participantes.toArray(new Coche[0]), 10, 100);

        for (Coche coche : participantes) {
            coche.mostrarDatos();
        }

        carrera.empezarCarrera();

        System.out.println("----------------------");

        for (Coche coche : participantes) {
            coche.mostrarDatos();
        }
    }
}
