class Exercicio1 {
	String cor;
	boolean porta1 = false;
	boolean porta2 = false;
	boolean porta3 = false;

	void pintar (String c){
		this.cor = c;
	}
	boolean abre() {
		return true;
	}

	void quantasPortasEstaoAbertas(){
		int x = 0;
		if (this.porta1)
			x += 1;
		if (this.porta2)
			x += 1;
		if (this.porta3)
			x += 1;
		System.out.println("Temos " + x +" Portas Abertas");
	}
	public static void main(String[] args) {
		Exercicio1 casa = new Exercicio1();

		casa.porta1 = casa.abre();
		System.out.println(casa.porta1);
		casa.quantasPortasEstaoAbertas();
	}

}