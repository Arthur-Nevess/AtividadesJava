package br.com.Forma;

public class main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        Triangulo triangulo = new Triangulo(7, 9);

        System.out.println("A area do quadrado é:" + quadrado.calculaArea());
        System.out.println("A area do triangulo é :" + triangulo.calculaArea());
    }
}
