package lista1;

public class testes {

	public static void main(String[] args) {
		// teste_bola
		Bola bolinha = new Bola("verde", (double)5.2, "borracha");
		System.out.println("A cor da bola �: " +bolinha.mostraCor());
		bolinha.trocaCor("vermelho");
		System.out.println("A nova cor da bola �: " + bolinha.mostraCor());
		
		// separacao_teste
		System.out.println("-------------------------");
		// separacao_teste
		
		// teste_quadrado
		Quadrado quadradinho = new Quadrado(6);
		System.out.println("O tamanho do lado �: " + quadradinho.retornaLado());
		System.out.println("�rea total: " + quadradinho.Area());
		System.out.println("O novo tamanho do lado �: " + quadradinho.mudaLado(8));
		
		// separacao_teste
		System.out.println("-------------------------");
		// separacao_teste
		
		// teste_pessoa
		Pessoa pessoa = new Pessoa("Natan", (int)18, (double)70, (double)1.70);
		System.out.println("A idade de " + pessoa.getNome() + " � " + pessoa.getIdade());
		pessoa.envelhecer();
		System.out.println("A idade de " + pessoa.getNome() + " depois de um ano � " + pessoa.getIdade());
		System.out.println("O peso de " + pessoa.getNome() +" � " + pessoa.getPeso() + "kg");
		pessoa.engordar();
		System.out.println("O peso de " + pessoa.getNome() +" foi para " + pessoa.getPeso()  + "kg porque comeu demais!");
		pessoa.emagrecer();
		System.out.println("O peso de " + pessoa.getNome() +" depois fazer exerc�cios f�sicos � " + pessoa.getPeso()  + "kg");
		System.out.println("A altura de " + pessoa.getNome() + " � " + pessoa.getAltura() + " metros");
		
		// separacao_teste
		System.out.println("-------------------------");
		// separacao_teste
	}

}
