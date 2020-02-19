package lista1;

public class Quadrado {
	private double tamanho_lado;
	
	public Quadrado(double tamanho_lado) {
		this.tamanho_lado = tamanho_lado;
	}
	
	public double Area() {
		return tamanho_lado * tamanho_lado;
	}
	
	public double retornaLado() {
		return this.tamanho_lado;
	}
	
	public double mudaLado(double tamanho_lado) {
		return tamanho_lado = tamanho_lado;
	}
}
