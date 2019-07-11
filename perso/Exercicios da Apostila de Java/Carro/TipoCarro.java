class TipoCarro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	Motor meuMotor = new Motor();

	//ligar o carro

	void ligar() {
		System.out.println("O carro esta ligado");
	}
	void acelera(double quantidade){
		this.velocidadeAtual += quantidade;
	}
	int pegarMarcha(){
		if (this.velocidadeAtual < 0) {
			return -1;			
		}else if(this.velocidadeAtual > 0 && this.velocidadeAtual < 40){
			return 1;
		} else if (this.velocidadeAtual > 40 && this.velocidadeAtual < 80) {
			return 2;
		}
		return 3;
	}
}