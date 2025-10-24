package main;
import modelo.Circulo;
import modelo.Figura;
import modelo.Rectangulo;
public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Rectangulo();
        figura1.setBase(4);
        figura1.setAltura(5);
        figura1.calcularArea();

        Figura figura2 = new Circulo();
        ((Circulo) figura2).setRadio(3);
        figura2.calcularArea();

        Figura figura3 = new Figura();
        figura3.setBase(5);
        figura3.setAltura(10);
        figura3.calcularArea();
    }
}
