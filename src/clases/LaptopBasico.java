package clases;

import bff.Laptop;

public class LaptopBasico extends Laptop {
    public LaptopBasico() {
        this.marca = "Dell";
        this.modelo = "Latitude";
        this.ano_fabricacion = 2020;
        this.tipo_procesador = "intel core i7";
        this.tamano_pantalla = 14.0;
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Basica");
        System.out.println("Laptop Basica");
        System.out.println("Marca y Modelo: " + marca + " " + modelo);
        System.out.println("Año de Fabricación: " + ano_fabricacion);
        System.out.println("Procesador: " + tipo_procesador);
        System.out.println("Tamaño de la Pantalla: " + (int)tamano_pantalla);
    }
}