class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;

	public void getCliente(String nome, String sobrenome, String cpf){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public String getNome(){
		return this.nome;
	}
}