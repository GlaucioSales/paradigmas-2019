class TesteCarro {
	public static void main(String[] args) {
		TipoCarro meuCarro = new TipoCarro();
		meuCarro.cor = "preto";
		meuCarro.modelo = "Opala";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		//ligando meu carro
		meuCarro.ligar();
		//acelerando meu carro;
		meuCarro.acelera(100);
		System.out.println(meuCarro.velocidadeAtual);


	}
}