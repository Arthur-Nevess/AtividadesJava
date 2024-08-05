package NovasAtividades.Titulos;

public class Titulos implements Comparable {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Object o) {
        return this.nome.compareTo(((Titulos) o).nome);
    }

    @Override
    public String toString() {
        return getNome();
    }
}
