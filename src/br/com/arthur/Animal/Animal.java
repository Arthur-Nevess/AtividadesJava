package br.com.arthur.Animal;

public class Animal {
    String raça;
    String som;
    double mediaTamanho;

    public Animal (String raça, String som){
        this.raça = raça;
        this.som = som;
    }

    public void emiteSom(){
        System.out.println(this.som);
    }

    @Override
    public String toString() {
        return this.raça;
    }
}
