package Compras;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int continuar = 0;
        Cartao cartao = new Cartao();
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                *******************************
                    BEM-VINDO A LOJA
                """);
        System.out.println("Digite o limite do seu cartão");
        cartao.setLimite(sc.nextDouble());

        do {
            System.out.println("Seu limite é de R$" + cartao.getLimite());
            System.out.println("O que deseja comprar:");
            cartao.setDescriçãoProduto(sc.next());

            System.out.println("Qaul o valor da compra:");
            cartao.setValor(sc.nextDouble());

            Compras compra = new Compras(cartao.getDescriçãoProduto(), cartao.getValor());
            cartao.autorizaCompra(compra);
            System.out.println("Digite 0 para sair ou 1 para continuar");
            continuar = sc.nextInt();
        } while (continuar == 1);
        Collections.sort(cartao.compras);
        System.out.println(cartao.compras);


    }
}