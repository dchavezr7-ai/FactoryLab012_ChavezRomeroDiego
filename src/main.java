import bff.Laptop;
import factory.LaptopFactory;
import factory.GamerFactory;
import factory.BasicoFactory;
import factory.ProfesionalFactory;

public class main {
    public static void main(String[] args) {
        System.out.println("BIENVENIDOS A LA FABRICA DE LAPTOPS\n");

        // 1. Ejecución Laptop Gamer
        LaptopFactory mGamer = new GamerFactory();
        Laptop lGamer = mGamer.crearLaptop();
        lGamer.ejecutarPrueba();
        System.out.println();

        // 2. Ejecución Laptop Básica
        LaptopFactory mBasico = new BasicoFactory();
        Laptop lBasico = mBasico.crearLaptop();
        lBasico.ejecutarPrueba();
        System.out.println();

        // 3. Ejecución Laptop Profesional
        LaptopFactory mProfesional = new ProfesionalFactory();
        Laptop lProfesional = mProfesional.crearLaptop();
        lProfesional.ejecutarPrueba();
    }
}