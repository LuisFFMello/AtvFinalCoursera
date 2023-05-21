package org.example;

import java.util.ArrayList;
import java.util.Collections;
// Essa classe utiliza um método que coloca cada letra da palavra em um ArrayList, embaralha os dados contidos
// na lista e preenche uma nova String com eles, retornando-a no final.


public class EmbaralhadorA implements Embaralhador {


    @Override
    public String embaralhar(String palavra) {
        int tamanho = palavra.length();
        ArrayList <String> lista = new ArrayList<String>();

        for (int i=0; i < palavra.length(); i++)
        {
            lista.add(palavra.substring(i, i+1));
        }

        Collections.shuffle(lista);

        String novaPalavra= palavra.substring(1, 1);

        for (int i=0; i<tamanho ; i++)
        {
            novaPalavra += lista.get(i);
        }
        return novaPalavra;

    }

    @Override
    public String toString() {
        return "Embaralhador A";
    }



}