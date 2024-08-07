package Compras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cartao{
    private double limite;
    private double valor;
    public boolean compraAutorizada;
    List<Compras> compras = new ArrayList();

    public String getDescriçãoProduto() {
        return descriçãoProduto;
    }

    public void setDescriçãoProduto(String descriçãoProduto) {
        this.descriçãoProduto = descriçãoProduto;
    }

    private String descriçãoProduto;

    public double getValor() {
        return valor;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean autorizaCompra(Compras comp) {
        if (valor > limite) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        else {
            limite -= valor;
            compras.add(comp);
            return true;
        }
    }
}
