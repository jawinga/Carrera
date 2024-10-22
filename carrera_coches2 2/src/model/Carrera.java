package model;

public class Carrera {
    private Coche[] participantes;
    private int kmTotales;
    private int numeroVueltas;

    public Carrera(Coche[] participantes, int numeroVueltas, int kmTotales) {
        this.participantes = participantes;
        this.numeroVueltas = numeroVueltas;
        this.kmTotales = kmTotales;
    }

    public void empezarCarrera() {
        for (int vuelta = 1; vuelta <= numeroVueltas; vuelta++) {
            System.out.println("Vuelta número: " + vuelta);
            for (Coche coche : participantes) {
                coche.acelerar();
                System.out.printf("Coche %s - Velocidad: %d km/h, Km recorridos: %d km%n", coche.getMatricula(), coche.getVelocidad(), coche.getKmRecorridos());
                if (coche.getKmRecorridos() >= kmTotales) {
                    System.out.println("¡El coche " + coche.getMarca() + " ha ganado la carrera!");
                    return;
                }
            }
        }
        System.out.println("Todos los participantes han completado las vueltas, pero nadie alcanzó la meta.");
    }
}