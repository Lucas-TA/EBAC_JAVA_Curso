package br.com.lascencao;

public class PrimeiraClasse {

	public static void main(String[] args) {
		System.out.print("Olá Lucas\n");
		Cliente cliente = new Cliente();
		cliente.cadastrarEndereco("Rua 1");
		cliente.setCodigo(1);
		System.out.print(cliente.getCodigo() + "\n");
		cliente.imprimirEndereco();
	}

}
