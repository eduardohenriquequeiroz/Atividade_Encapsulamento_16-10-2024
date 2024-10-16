package Encapsulamento;

public class Casa {

	long id;
	String nome;
	double valorAluguel;
	String cor;

	public Casa(long id, String nome, double valorAluguel, String cor) {
		if (valorAluguel >= 0) {
			this.valorAluguel = valorAluguel;
		}
		else {
			this.valorAluguel = 0;
		}
		this.id = id;
		this.nome = nome;
		this.cor = cor;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}
