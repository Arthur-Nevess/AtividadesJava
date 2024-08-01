package br.com.ContaBancaria;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double compara = 0;
        ArrayList<Conta> contas = new ArrayList<>();
        Conta conta = new Conta(1, 1250.50);
        Conta conta2 = new Conta(2, 50.22);
        Conta conta3 = new Conta(3, 14000.00);
        Conta conta4 = new Conta(4, 2500.00);
        Conta conta5 = new Conta(5, 100.30);

        contas.add(conta);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);

        for (Conta c : contas){
           if (c.getSaldo() > compara){
               compara = c.getSaldo();
           }
        }

        System.out.println("O maior saldo é o da conta " + conta.getNumero() +
                " com o saldo de R$ " + compara);
    }
}
