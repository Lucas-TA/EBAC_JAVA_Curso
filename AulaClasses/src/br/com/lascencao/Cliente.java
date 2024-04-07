package br.com.lascencao;

public class Cliente {
	private int codigo;
	private String nome;
	private String endereco;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void cadastrarEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void imprimirEndereco() {
		System.out.print(this.endereco + "\n");
	}
	
	private String returnNomeCliente() {
		return "endereco do Lucas";
	}
}
