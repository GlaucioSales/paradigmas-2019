class Aplicativo{
	public static void main(String[] args) {
		//minha Conta
		Conta minhaConta;
		minhaConta = new Conta();

		//meu cliente
		Cliente n1  = new Cliente();
		n1.getCliente("glaucio","sales","123456789");

		//Conta do Meu amigo
		Conta contaDoMeuAmigo;
		contaDoMeuAmigo = new Conta();

		//meu amigo
		Cliente n2 = new Cliente();
		n2.getCliente("Bruno","Gotiebli","789456123");

		System.out.println(minhaConta.getTitular());

		minhaConta.depositar(500);		

		//chamar o transfere quem perde o valor e a conta que chaou a função;
		minhaConta.transferePara(contaDoMeuAmigo, 100);
	}
}