package modelo;

public class Rectangulo extends Figura {
    private double altura;
    private double base;
    @Override
    public void calcularArea(){
        System.out.println("El área del rectángulo es: " + (base * altura));
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
