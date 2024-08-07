package Compras;

public class Compras implements Comparable<Compras>{
    private String descricao;
    private double valor;

    public Compras(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "-Descrição " + descricao +  " - valor=" + valor + "\n";
    }

    @Override
    public int compareTo(Compras compras) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(compras.valor));
    }
}
