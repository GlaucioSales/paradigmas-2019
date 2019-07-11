class TesteIgualdade{
	public static void main(String[] args) {
		Conta c1;
		c1 = new Conta();
		c1.dono = "glaucio";
		c1.saldo = 1000;

		Conta c2;
		c2 = new Conta();
		c2.dono = "glaucio";
		c2.saldo = 1000;

		if (c1 == c2) {
			System.out.println("Os objetos sao iguais");
		} else {
			System.out.println("Os objetos nao sao iguais");
		}
	}
}