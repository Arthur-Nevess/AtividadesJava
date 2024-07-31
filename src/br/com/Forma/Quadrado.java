package br.com.Forma;

public class Quadrado implements CalculaArea {

    private double lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado  * lado;
    }
}
