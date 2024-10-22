package model;

public class Coche {
    private String marca, modelo, matricula;
    private int cv, cc, velocidad, kmRecorridos;

    public Coche() {}

    public Coche(String marca, String modelo, String matricula, int cv, int cc, int velocidad, int kmRecorridos) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.cc = cc;
        this.velocidad = velocidad;
        this.kmRecorridos = kmRecorridos;
    }

    public void mostrarDatos() {
        System.out.printf("Información del coche: %s %s con matrícula %s.%n", marca, modelo, matricula);
        System.out.printf("CV: %d, CC: %d, Velocidad: %d km/h, Km recorridos: %d km%n", cv, cc, velocidad, kmRecorridos);
        System.out.println("--------------------------------------------------------");
    }

    public void acelerar() {
        int incremento = (cv > 100) ? (int) ((Math.random() * 20) + 10) : (int) (Math.random() * 10);
        velocidad += incremento;
        kmRecorridos += (int) (velocidad * 0.5);
        System.out.printf("Coche %s - Velocidad actual: %d km/h, Km recorridos: %d km%n", matricula, velocidad, kmRecorridos);
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }


}
