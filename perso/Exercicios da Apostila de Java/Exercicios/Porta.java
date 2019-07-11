class Porta{
	boolean aberta = false;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;

	void abre(){
		this.aberta = true;
	}
	void fecha(){
		this.aberta = false;
	}
	void pinta(String s){
		this.cor = s;
	}
	boolean estaAberta(){
		if (this.aberta) {
			System.out.println("Sim");
			return true;
		}else{
			System.out.println("Nao");
			return false;
		}
	}

	public static void main(String[] args) {
		Porta escolhida = new Porta();

		escolhida.abre();
		escolhida.estaAberta();
		escolhida.fecha();
		escolhida.estaAberta();
		escolhida.pinta("preta");
		escolhida.dimensaoX = 1.70;
		escolhida.dimensaoY = 1.0;
		escolhida.dimensaoZ = 0.5;
	}

}