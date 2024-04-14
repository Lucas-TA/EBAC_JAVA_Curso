package br.com.lascencao.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.lascencao.domain.Aluno;
import br.com.lascencao.domain.ComparaNotaAluno;

public class ExemploArrayListAluno {

	public static void main(String[] args) {
		exemploListaSimplesOrdenadaComparatorAluno();
		exemploListaSimplesOrdenadaClasseExterna();
	}

	private static void exemploListaSimplesOrdenadaClasseExterna() {
		System.out.println("*****Exemplo Lista Simples Ordenada Classe Externa*****");
		
		List<Aluno> lista = new ArrayList<Aluno>();
		
		Aluno a = new Aluno("João da Silva", "Linux básico", 0);
		Aluno b = new Aluno("Vitor Araújo", "Open Office", 0);
		Aluno c = new Aluno("Amarildo Gonçalves", "Internet", 0);
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		System.out.println(lista);
		
		Collections.sort(lista);
		System.out.println(lista);
		
		System.out.println("");
		
	}

	private static void exemploListaSimplesOrdenadaComparatorAluno() {
		System.out.println("*****Explo Lista Simples Ordenada Comparator Aluno*****");
		
		List<Aluno> lista = new ArrayList<Aluno>();
		
		Aluno a = new Aluno("João da Silva", "Linux básico", 20);
		Aluno b = new Aluno("Vitor Araújo", "Open Office", 30);
		Aluno c = new Aluno("Amarildo Gonçalves", "Internet", 10);
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		
		System.out.println("Lista sem ordenação" + lista);
		Collections.sort(lista);
		System.out.println("Lista com ordenação" + lista);
		
		ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
		Collections.sort(lista, comparaNotaAluno);
		
		System.out.println("Lista com ordenação por nota" + lista);
		System.out.println("");
		
	}

}
