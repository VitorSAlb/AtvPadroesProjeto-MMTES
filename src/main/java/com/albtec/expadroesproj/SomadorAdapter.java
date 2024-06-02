package com.albtec.expadroesproj;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter implements SomadorEsperado {
    private SomadorExistente somadorExistente;

    public SomadorAdapter(SomadorExistente somadorExistente) {
        this.somadorExistente = somadorExistente;
    }

    @Override
    public int somaVetor(int[] vetor) {
        List<Integer> lista = new ArrayList<>();
        for (int i : vetor) {
            lista.add(i);
        }
        return somadorExistente.somaLista(lista);
    }
}
