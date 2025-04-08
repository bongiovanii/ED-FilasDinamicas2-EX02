package model;

public class Cliente {
	private String nome;
	private int quantidadePecas;
	private float valorPecas;
	
	public Cliente() {
		this("", 0, 0);
	}
	
	public Cliente(String nome, int quantidadePecas, float valorPecas){
		this.nome = nome;
		this.quantidadePecas = quantidadePecas;
		this.valorPecas = valorPecas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadePecas() {
		return quantidadePecas;
	}

	public void setQuantidadePecas(int quantidadePecas) {
		this.quantidadePecas = quantidadePecas;
	}

	public float getValorPecas() {
		return valorPecas;
	}

	public void setValorPecas(float valorPecas) {
		this.valorPecas = valorPecas;
	}
	
	
}
