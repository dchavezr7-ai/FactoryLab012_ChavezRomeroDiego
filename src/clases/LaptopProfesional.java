package clases;

import bff.Laptop;

public class LaptopProfesional extends Laptop {
    public LaptopProfesional() {
        this.marca = "Macbook";
        this.modelo = "Pro";
        this.ano_fabricacion = 2022;
        this.tipo_procesador = "Apple Silicon";
        this.tamano_pantalla = 14.0;
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Profesional");
        System.out.println("Laptop para Profesional");
        System.out.println("Marca y Modelo: " + marca + " " + modelo);
        System.out.println("Año de Fabricación: " + ano_fabricacion);
        System.out.println("Procesador: " + tipo_procesador);
        System.out.println("Tamaño de la Pantalla: " + (int)tamano_pantalla);
    }
}