package br.com.arthur.Animal;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        Cachorro cachorro = new Cachorro("Pitbull","auau");
        cachorro.mediaTamanho = 1.10;
        Cachorro outrodog = new Cachorro("S.R.D.","auau");
        Animal animal = new Animal("Indf", "Indf");

        list.add(cachorro);
        list.add(outrodog);
        list.add(animal);

        for (Animal animal1 : list) {
            if (animal1 instanceof Cachorro) {
                cachorro.abanarRabo();
            }
            else {
                animal.emiteSom();
            }
        }

    }
}
