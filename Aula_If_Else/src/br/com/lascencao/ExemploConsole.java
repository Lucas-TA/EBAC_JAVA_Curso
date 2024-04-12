package br.com.lascencao;

import java.util.Scanner;

public class ExemploConsole {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = s.nextInt();
		String idadeSt = getIdade(idade);
		System.out.println(idadeSt);
	}
	
	public static String getIdade(int idade) {
		if (idade >= 0 && idade <=5) {
			return "Você é um bebê";
		} else if (idade >= 6 && idade <= 10) {
			return "Você é uma criança";
		} else if (idade >= 11 && idade <= 17) {
			return "Você é um adolescente";
		} else {
			return "Você é um adulto";
		}
	}

}
