package br.com.lascencao;

public class CalculaMedia {

	public static void main(String[] args) {
		
		int notaPort = 7;
		int notaMat = 8;
		int notaHist = 11;
		int notaGeo = 4;
		
		double media = calcularMedia(notaPort, notaMat, notaHist, notaGeo);
		
		System.out.print("A média final é: " + media);

	}
	
	public static double calcularMedia(int notaPort, int notaMat, int notaHist, int notaGeo) {
		double media = (notaPort + notaMat + notaHist + notaGeo) / 4;
		
		return media;
	}

}
