package br.com.ContaBancaria;

public class Conta {
    private int numero;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
}
