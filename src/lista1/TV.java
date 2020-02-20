package lista1;

public class TV {
	private int canal;
	private int volume;
	
	public TV(int canal, int volume){
		this.canal = canal;
		this.volume = volume;
	}
	
	public void mostraCanal() {
		System.out.println("O canal atual �: " + this.canal);
	}
	
	public void mostraVolume() {
		System.out.println("O volume atual �: " + this.volume);
	}
	
	public void trocaCanal(int novo_canal) {
		if (novo_canal > 50 || novo_canal < 0) {
			System.out.println("Canal inv�lido! Escolha um canal de 1 a 50");
		} else {
			this.canal = novo_canal;
			System.out.println("O novo canal �: " + this.canal);
		}

	}
	
	public void trocaVolume(int novo_volume) {
		if (novo_volume > 100 || novo_volume < 0) {
			System.out.println("Volume inv�lido! MIN: 0 MAX: 100");
		} else {
			this.volume = novo_volume;
			System.out.println("O novo volume �: " + this.volume);			
		}

	}
}
