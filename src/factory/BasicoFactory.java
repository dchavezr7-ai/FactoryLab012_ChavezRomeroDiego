package factory;

import bff.Laptop;
import clases.LaptopBasico;

public class BasicoFactory extends LaptopFactory {
    @Override
    public Laptop crearLaptop() {
        return new LaptopBasico();
    }
}