package factory;

import bff.Laptop;
import clases.LaptopProfesional;

public class ProfesionalFactory extends LaptopFactory {
    @Override
    public Laptop crearLaptop() {
        return new LaptopProfesional();
    }
}