class Casa{
	String cor;
	int totalDePortas;
	boolean[] porta;
	porta = new Boolean[3];

	void pintarAPorta(String s){
		s = "Branco";
	}	
	int quantasPortasEstaoAbertas(){
		int x = 0;
		for (int n = 0; n < porta.length; n++) {
			if (porta[n] == true) {
				x += 1;
			}
		}
		return x;
	}

	void adicionaPorta (Porta p){

	} 

	int totalDePortas(){
		return porta.length;
	}

}