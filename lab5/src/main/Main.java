package main;
import modelo.Animal;
import modelo.Gato;
import modelo.Perro;
public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        miAnimal.hacerSonido();
        miPerro.hacerSonido();
        miGato.hacerSonido();

    }
}
