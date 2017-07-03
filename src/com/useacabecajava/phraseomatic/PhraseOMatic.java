package com.useacabecajava.phraseomatic;

/**
 * Created by Israel Sales on 03/07/2017.
 * pagina livro-12, pdf-38
 */
public class PhraseOMatic {
    public static void main(String[] args) {
        //crie três conjuntos de palavras onde será feita a seleção. Adicione o que quiser
        String[] sujeitos = {"Israel", "Laecyo", "Vinicius", "Lais", "Fátima", "Luciano", "Sandra", "Paulo"};
        String[] verbos = {" carrega", " anda", " molha", " fura", " belisca"};
        String[] predicados = {" a cabeça do dragão", " o ouvido do cão", " a garganta da baleia", " a asas do ave"};

        //descubra quantas palavras existem em cada lista
        int quantidadeSujeitos = sujeitos.length;
        int quantidadeVerbos = verbos.length;
        int quantidadePredicados = predicados.length;

        //gere tres números aleatórios
        int aleatorioSujeito = (int) (Math.random()*quantidadeSujeitos);
        int aleatorioVerbo = (int) (Math.random()*quantidadeVerbos);
        int aleatorioPredicado = (int) (Math.random()*quantidadePredicados);

        //agora construa uma frase
        String frase = sujeitos[aleatorioSujeito]+verbos[aleatorioVerbo]+predicados[aleatorioPredicado];
        System.out.println(frase);
    }
}
