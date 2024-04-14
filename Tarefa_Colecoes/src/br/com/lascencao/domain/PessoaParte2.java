package br.com.lascencao.domain;

public class PessoaParte2 implements Comparable<PessoaParte2>{
	private String nome;
	private String genero;
	
	public PessoaParte2(String nome, String genero) {
		this.nome = nome;
		this.genero = genero;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getGenero() {
		return nome;
	}
	public void setGenero(String nome) {
		this.nome = nome;
	}
	
	@Override
    public String toString() {
        return "{nome: " + nome + ", genero: " + genero + "}";
    }
	@Override
    public int compareTo(PessoaParte2 outraPessoa) {
        // Comparar as pessoas pelo nome
        return this.nome.compareTo(outraPessoa.getNome());
    }
	
}
