package lista1;

public class testes {

	public static void main(String[] args) {
		// teste_bola
		Bola bolinha = new Bola("verde", (double)5.2, "borracha");
		System.out.println("A cor da bola é: " +bolinha.mostraCor());
		bolinha.trocaCor("vermelho");
		System.out.println("A nova cor da bola é: " + bolinha.mostraCor());
		
		// separacao_teste
		System.out.println("-------------------------");
		// separacao_teste
		
		// teste_quadrado
		Quadrado quadradinho = new Quadrado(6);
		System.out.println("O tamanho do lado é: " + quadradinho.retornaLado());
		System.out.println("Área total: " + quadradinho.Area());
		System.out.println("O novo tamanho do lado é: " + quadradinho.mudaLado(8));
		
		// separacao_teste
		System.out.println("-------------------------");
		// separacao_teste
		
		// teste_pessoa
		Pessoa pessoa = new Pessoa("Natan", (int)18, (double)70, (double)1.70);
		System.out.println("A idade de " + pessoa.getNome() + " é " + pessoa.getIdade());
		pessoa.envelhecer();
		System.out.println("A idade de " + pessoa.getNome() + " depois de um ano é " + pessoa.getIdade());
		System.out.println("O peso de " + pessoa.getNome() +" é " + pessoa.getPeso() + "kg");
		pessoa.engordar();
		System.out.println("O peso de " + pessoa.getNome() +" foi para " + pessoa.getPeso()  + "kg porque comeu demais!");
		pessoa.emagrecer();
		System.out.println("O peso de " + pessoa.getNome() +" depois fazer exercícios físicos é " + pessoa.getPeso()  + "kg");
		System.out.println("A altura de " + pessoa.getNome() + " é " + pessoa.getAltura() + " metros");
		
		// separacao_teste
		System.out.println("-------------------------");
		// separacao_teste
		
		// teste_tv
		TV tv = new TV((int)5, (int)25);
		tv.mostraCanal();
		tv.mostraVolume();
		tv.trocaCanal(90);
		tv.trocaCanal(45);
		tv.trocaVolume(10);
		
		// separacao_teste
		System.out.println("-------------------------");
		// separacao_teste
		
		// teste_bichinho
		Bichinho bichinho = new Bichinho("Cleyton", true, false , 5); // nome_fome_saude_idade
		bichinho.mostraNome();
		bichinho.mostraIdade();
		bichinho.mostraSaude();
		bichinho.mostraFome();
		bichinho.humorBichinho();
		bichinho.trocaNome("Natan");
		bichinho.trocaIdade(6);
		bichinho.trocaFome(false);
		bichinho.trocaSaude(true);
		bichinho.humorBichinho();
		
		// separacao_teste
		System.out.println("-------------------------");
		// separacao_teste
		
		// teste_bombaCombustivel
		
		BombaComb Bomba = new BombaComb("Diesel", 4, 85, 500);
		Bomba.mostraQuantidade();
		Bomba.abastecerPorValor(50);
		Bomba.abastecerPorLitro(50);
		Bomba.alterarValor(5);
		Bomba.alterarCombustivel("Gasolina");
		Bomba.abastecerPorValor(50);
		Bomba.alteraQuantidadeCombustivel(); // funcao_automatica
	}

}
