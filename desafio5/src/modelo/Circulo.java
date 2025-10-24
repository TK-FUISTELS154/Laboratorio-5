package modelo;

public class Circulo extends Figura {
    private double radio;
    @Override
    public void calcularArea (){
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
