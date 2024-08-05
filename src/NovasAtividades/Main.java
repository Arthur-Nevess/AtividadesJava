package NovasAtividades;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Inteiros inteiros = new Inteiros();
        ArrayList<Integer> listaInteiros = new ArrayList<>();

        listaInteiros.add(inteiros.a);
        listaInteiros.add(inteiros.b);
        listaInteiros.add(inteiros.c);
        listaInteiros.add(inteiros.d);
        listaInteiros.add(inteiros.e);
        listaInteiros.add(inteiros.f);
        listaInteiros.add(inteiros.g);

        System.out.println("Números antes de ordenar: ");
        System.out.println(listaInteiros);

        Collections.sort(listaInteiros);
        System.out.println("Números pós ordenação: ");
        System.out.println(listaInteiros);
    }
}
