package clases;

import bff.Laptop;

public class LaptopGamer extends Laptop {
    public LaptopGamer() {
        this.marca = "Macbook";
        this.modelo = "air";
        this.ano_fabricacion = 2017;
        this.tipo_procesador = "Silicon M1";
        this.tamano_pantalla = 13.0;
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop para Gamer");
        System.out.println("Laptop para Gamer");
        System.out.println("Marca y Modelo: " + marca + " " + modelo);
        System.out.println("Año de Fabricación: " + ano_fabricacion);
        System.out.println("Procesador: " + tipo_procesador);
        System.out.println("Tamaño de la Pantalla: " + (int)tamano_pantalla);
    }
}