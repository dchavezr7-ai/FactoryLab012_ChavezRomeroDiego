package factory;

import bff.Laptop;
import clases.LaptopGamer;

public class GamerFactory extends LaptopFactory {
    @Override
    public Laptop crearLaptop() {
        return new LaptopGamer();
    }
}