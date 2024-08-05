package NovasAtividades.Titulos;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Titulos titulos = new Titulos();
        titulos.setNome("Herry");
        Titulos titulos2 = new Titulos();
        titulos2.setNome("Potter");
        Titulos titulos3 = new Titulos();
        titulos3.setNome("Detento");
        Titulos titulos4 = new Titulos();
        titulos4.setNome("Arthur");
        ArrayList<Titulos> titulosArrayList = new ArrayList<>();
        titulosArrayList.add(titulos);
        titulosArrayList.add(titulos2);
        titulosArrayList.add(titulos3);
        titulosArrayList.add(titulos4);

        Collections.sort(titulosArrayList);
        System.out.println(titulosArrayList);
    }
}
