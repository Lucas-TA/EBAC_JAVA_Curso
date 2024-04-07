package br.com.lascencao;
/**
 * Calculadora para cálculos básicos entre dois números inteiros
 * @author Lucas Ascenção
 */
public class Calculadora {

	public static void main(String[] args) {
		Soma soma = new Soma();
		Subtracao subtracao = new Subtracao();
		Multiplicacao multiplicacao = new Multiplicacao();
		Divisao divisao = new Divisao();
		
		int resSum = soma.funcaoSoma(2, 8);
		int resSub = subtracao.funcaoSubtrair(38, 20);
		int resMult = multiplicacao.funcaoMultiplicar(50, 7);
		int resDivi = divisao.funcaoDividir(127, 3);
		
		System.out.print("O Resultado da soma é: " + resSum + "\n");
		System.out.print("O Resultado da subtração é: " + resSub + "\n");
		System.out.print("O Resultado da multiplicação é: " + resMult + "\n");
		System.out.print("O Resultado da Divisão é: " + resDivi + "\n");

	}

}
