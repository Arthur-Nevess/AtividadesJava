package br.com.Forma;


public class Triangulo implements CalculaArea{

    private double base;
    private double altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
   public double calculaArea(){
       return base * altura / 2;
   }
}
