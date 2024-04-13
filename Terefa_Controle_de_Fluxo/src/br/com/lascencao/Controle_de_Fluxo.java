package br.com.lascencao;

import java.util.Scanner;

public class Controle_de_Fluxo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double portugues, matematica, historia, geografia;
		
		System.out.print("Notas de avaliação do aluno.\n\n");
		
		System.out.print("Digite a nota de avaliação em português: \n");
		portugues = s.nextInt();
		
		System.out.print("Digite a nota de avaliação em matemática: \n");
		matematica = s.nextInt();
		
		System.out.print("Digite a nota de avaliação em história: \n");
		historia = s.nextInt();
		
		System.out.print("Digite a nota de avaliação em geografia: \n");
		geografia = s.nextInt();
		
		System.out.print(mediaAluno(portugues, matematica, historia, geografia));
	}
	
	public static String mediaAluno(double portugues, double matematica, double historia, double geografia) {
		double calc = (portugues + matematica + historia + geografia) / 4;
		
		if (calc > 10 || calc < 0) {
			return "Ops! As notas só podem ser de 0 a 10";
		} else if (calc >= 7) {
			return "Aprovado! a media total foi: " + calc;
		} else if (calc >= 5) {
			return "Em Recuperação, a media total foi: " + calc;
		} else {
			return "Reprovado, a media total foi: " + calc + "Nos vemos novamente no próximo semestre";	
		}
	}
}
