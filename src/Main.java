import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Nomes nome1 = new Nomes("Jaqueline");
        Nomes nome2 = new Nomes("Larissa");
        Nomes nome3 = new Nomes("Leone");
        Nomes nome4 = new Nomes("Louize");
        Nomes nome5 = new Nomes("Arthur");
        ArrayList<Nomes> nome = new ArrayList<>();
        nome.add(nome1);
        nome.add(nome2);
        nome.add(nome3);
        nome.add(nome4);
        nome.add(nome5);

        nome.forEach( Nomes -> System.out.println(Nomes));



    }
}