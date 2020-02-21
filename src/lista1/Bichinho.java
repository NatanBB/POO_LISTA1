package lista1;

public class Bichinho {
	private String nome;
	private String fome;
	private String saude;
	private int idade;

	
	public Bichinho(String nome, String fome, String saude, int idade) {
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
		System.out.println("A saude do seu bichinho está: " + this.saude);
	}
	
	public void mostraFome() {
		System.out.println("Seu bichinho esta: " + this.fome);
	}
	
	public void trocaNome(String novo_nome) {
		this.nome = novo_nome;
		System.out.println("O novo nome do seu bichinho é: " + this.nome);
	}
	
	public void trocaIdade(int nova_idade) {
		this.idade = nova_idade;
		System.out.println("A idade do seu bichinho agora é: " + this.idade);
	}
	
	public void trocaSaude(String nova_saude) {
		this.saude = nova_saude;
		System.out.println("A saude do seu bichinho esta: " + this.saude);
	}
	
	public void trocaFome(String nova_fome) {
		this.fome = nova_fome;
		System.out.println("Seu bichinho esta: " + this.fome);
	}
	
	//fazer_humor
}
