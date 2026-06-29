package bff;

public abstract class Laptop {
    public String marca;
    public String modelo;
    public int ano_fabricacion;
    public String tipo_procesador;
    public double tamano_pantalla;

    public abstract void ejecutarPrueba();
}