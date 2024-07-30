package br.com.Produtos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double mediaValores = 0;
        Produto p1 = new Produto("faca", 2.50);
        Produto p2 = new Produto("garfo", 4.45);
        Produto p3 = new Produto("colher", 5.20);
        Produto p4 = new Produto("concha", 20.00);
        Produto p5 = new Produto("pegador", 15.50);
        ArrayList<Produto> talheres = new ArrayList<>();
        talheres.add(p1);
        talheres.add(p2);
        talheres.add(p3);
        talheres.add(p4);
        talheres.add(p5);

        for (Produto p : talheres){
            mediaValores += p.preço;
        }
        System.out.println("A média de preço do jogo de talheres: " +
                            (mediaValores/talheres.size()));
    }
}
