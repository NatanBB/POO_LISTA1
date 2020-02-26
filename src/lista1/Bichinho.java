package lista1;

public class Bichinho {
	private String nome;
	private boolean fome;
	private boolean saude;
	private int idade;

	
	public Bichinho(String nome, boolean fome, boolean saude, int idade) {
		this.nome = nome;
		this.fome = fome;
		this.saude = saude;
		this.idade = idade;
	}
	
	public void mostraNome() {
		System.out.println("O nome do seu bichinho é: " + this.nome);
	}
	
	public void mostraIdade() {
		System.out.println("A idade do seu bichinho é: " + this.idade);
	}
	
	public void mostraSaude() {
		if (this.saude == true) {
			System.out.println("A saude do seu bichinho está: boa");
		} else {
			System.out.println("A saude do seu bichinho está: ruim");
		}
		
	}
	
	public void mostraFome() {
		if (this.fome == true) {
			System.out.println("Seu bichinho esta com fome");
		} else {
			System.out.println("Seu bichinho nao esta com fome");
		}
		
	}
	
	public String humorBichinho() {
		String humor = " ";
		
		if (this.saude == false && this.fome == true) {
			humor = "Triste e com fome";
		} else if (this.saude == true && this.fome == false) {
			humor = "Feliz de bucho cheio";
		} else {
			humor = "Normal";
		}
		System.out.println("O humor do seu bichinho é: " + humor);
		return humor;
	}
	
	public void trocaNome(String novo_nome) {
		this.nome = novo_nome;
		System.out.println("O novo nome do seu bichinho é: " + this.nome);
	}
	
	public void trocaIdade(int nova_idade) {
		this.idade = nova_idade;
		System.out.println("A idade do seu bichinho agora é: " + this.idade);
	}
	
	public void trocaSaude(boolean saude) {
		this.saude = saude;
		mostraSaude();
	}
	
	public void trocaFome(boolean fome) {
		this.fome = fome;
		mostraFome();
	}
	
	//fazer_humor
}
