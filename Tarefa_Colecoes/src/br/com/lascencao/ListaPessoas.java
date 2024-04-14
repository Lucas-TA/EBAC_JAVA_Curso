package br.com.lascencao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import br.com.lascencao.domain.Pessoa;

public class ListaPessoas {

	public static void main(String[] args) {
		criarListaPessoas();
	}
	private static void criarListaPessoas() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite uma lista de nomes separados por vírgula: ");
		/**
		 * Ler a entrada de uma string
		 */
		String nomes = s.nextLine();
		
		/**
		 * Dividir a String que foi lida em partes separada por vírgula, dessa forma obtendo os nomes em um Array
		 */
		String[] partes = nomes.split(",");
		
		/**
		 * Criar uma lista de pessoas com base no split
		 */
		List<Pessoa> lista = new ArrayList<>();
		
		/**
		 * Preencher a lista de pessoas com instâncias de Pessoa
		 */
		for (String nome : partes) {
			lista.add(new Pessoa(nome.trim()));
		}
		/**
		 * Ordenar lista
		 */
		lista.sort(Comparator.comparing(Pessoa::getNome));
		
		/**
		 * Imprimir Lista no console
		 */
		System.out.println(lista);
	}

}
