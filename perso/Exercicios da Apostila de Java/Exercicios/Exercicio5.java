class Exercicio5{
	String nome;
	int idade;

	void fazAniversario(){
		this.idade += 1;
	}

	public static void main(String[] args) {
		Exercicio5 pessoa = new Exercicio5();
		pessoa.idade = 22;
		pessoa.nome = "Glaucio";
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		System.out.println(pessoa.nome);
		System.out.println(pessoa.idade);
	}
}