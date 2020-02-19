package lista1;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	
	public Pessoa(String nome, int idade, double peso, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public void envelhecer() {
		this.idade++;
	}
	
	public void crescer() {
		if (this.idade < 21) {
			this.altura += 0.05;
		}
	}
	
	public void engordar() {
		this.peso += 5;
	}
	
	public void emagrecer() {
		this.peso -= 0.5;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public double getAltura() {
		return this.altura;
	}
}
