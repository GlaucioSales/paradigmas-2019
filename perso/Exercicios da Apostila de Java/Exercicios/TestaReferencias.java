class TestaReferencias {
	public static void main(String args[]) {
		Conta c1 = new Conta();
		c1.depositar(100);
		Conta c2 = c1; // linha importante!
		c2.depositar(200);
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
	}
}