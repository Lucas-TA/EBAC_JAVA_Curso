package br.com.lascencao.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * É um Array cujo tamanho pode crescer.
 * A busca de um elemento é rápida, mas inserções e exclusões não são.
 * 
 * @author Lucas Ascenção
 */
public class ExemploArrayList {

	public static void main(String[] args) {
		exemploListaSimples();
		exemploListaSimplesOrdemAscendente();
	}
	private static void exemploListaSimples() {
		System.out.println("*****Exemplo de Lista Simples*****");
		
		List<String> lista = new ArrayList<String>();
		lista.add("João da Silva");
		lista.add("Lucas Ascenção");
		lista.add("Antonio Sousa");
		
		System.out.println(lista);
		System.out.println("");
	}
	private static void exemploListaSimplesOrdemAscendente() {
		System.out.println("*****Exemplo de Lista Simples em Ordem Ascendente*****");
		
		List<String> lista = new ArrayList<String>();
		lista.add("João da Silva");
		lista.add("Lucas Ascenção");
		lista.add("Antonio Sousa");
		
		Collections.sort(lista);
		
		System.out.println(lista);
		System.out.println("");
	}

}
