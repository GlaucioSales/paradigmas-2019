class TestaIdade {
	public static void main(String[] args) {
		// imprime a idade
		int idade = 20;
		System.out.println(idade);
		// gera uma idade no ano seguinte
		int idadeNoAnoQueVem;
		idadeNoAnoQueVem = idade + 1;
		// imprime a idade
		System.out.println(idadeNoAnoQueVem);
		//imprime o tipo char
		char letra = 'a';
		System.out.println(letra);

		Circle umCirculo = new Circle();
		umCirculo.setRadius(1);
		System.out.println(umCirculo.area());
	}
}

