package br.com.lascencao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.com.lascencao.domain.PessoaParte2;

public class Parte2 {

    public static void main(String[] args) {
        List<PessoaParte2> pessoas = lerPessoa();
        Collections.sort(pessoas);
        System.out.println(pessoas);
    }

    private static List<PessoaParte2> lerPessoa() {
        Scanner s = new Scanner(System.in);
        List<PessoaParte2> pessoas = new ArrayList<>();
        
        System.out.println("Digite os itens da lista separando-os por vírgula da seguinte forma: Nome - Gênero");
        String nomes = s.nextLine();
        s.close();
        
        String[] pares = nomes.split(",");
        
        for (String par : pares) {
            String[] partes = par.trim().split("-");
            if (partes.length >= 2) {
                String nome = partes[0].trim();
                String genero = partes[1].trim();
                pessoas.add(new PessoaParte2(nome, genero));
            }
        }
        return pessoas;
    }
}
