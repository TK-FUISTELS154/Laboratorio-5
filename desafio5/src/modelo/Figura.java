package modelo;

public class Figura {
    private double altura;
    private double base;
    public void calcularArea(){
        System.out.println("EL área de la figura es: " + (base * altura));
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}