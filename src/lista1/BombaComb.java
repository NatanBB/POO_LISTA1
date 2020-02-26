package lista1;

public class BombaComb {
	private String tipoCombustivel;
	private double valorLitro;
	private double quantidadeCombustivel;
	private double quantidadeBomba;
	
	public BombaComb(String tipoCombustivel, double valorLitro, double quantidadeCombustivel, double quantidadeBomba) {
		this.tipoCombustivel = tipoCombustivel;
		this.valorLitro = valorLitro;
		this.quantidadeCombustivel = quantidadeCombustivel;
		this.quantidadeBomba = quantidadeBomba;
	}

	public void mostraQuantidade() {
		System.out.println("A quantidade de combustivel do veículo é: " + this.quantidadeCombustivel);
	}
	
	public void mostraBomba() {
		System.out.println("A quantidade de combustivel na bomba é: " + this.quantidadeBomba);
	}
	
	public void alteraQuantidadeCombustivel() {
		System.out.println("A quantidade de combustivel restante na bomba é: " + this.quantidadeBomba);
	}
	
	public void abastecerPorValor(double valor) {
		System.out.println("Quero abastecer R$: " + valor);
		double quantidade = valor / this.valorLitro;
		this.quantidadeCombustivel += quantidade;
		this.quantidadeBomba -= quantidade;
		System.out.println("Quantidade abastecida: " + quantidade + " litros");
		mostraQuantidade();
		alteraQuantidadeCombustivel();
	}
	
	public void abastecerPorLitro(double litro) {
		System.out.println("Quero " + litro + " litros");
		this.quantidadeCombustivel += litro;
		this.quantidadeBomba -= litro;
		mostraQuantidade();
		alteraQuantidadeCombustivel();
	}
	
	public void alterarValor(double valor) {
		
		this.valorLitro = valor;
		System.out.println("O valor por Litro agora é: " + this.valorLitro);
	}
	
	public void alterarCombustivel(String combustivel) {
		this.tipoCombustivel = combustivel;
		System.out.println("O tipo de combustivel é: " + this.tipoCombustivel);
	}
	
}
