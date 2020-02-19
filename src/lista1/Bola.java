package lista1;

public class Bola {
	private String cor;
	private double circ;
	private String material;
	
	public Bola(String cor, double circ, String material) {
		this.cor = cor;
		this.circ = circ;
		this.material = material;
	}
	
	public void trocaCor(String nova_cor) {
		this.cor = nova_cor;
	}
	
	public String mostraCor() {
		return this.cor;
	}
}
