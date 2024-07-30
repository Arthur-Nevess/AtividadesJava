package br.com.arthur.Animal;

public class Cachorro extends Animal{

    public Cachorro(String raça, String som) {
        super(raça, som);
    }
    public void abanarRabo() {
        System.out.println("Abanando rabo");
    }

    @Override
    public String toString() {
        return this.raça;
    }
}
