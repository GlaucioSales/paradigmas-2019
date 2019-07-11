class Fibonacci {
	public static void main(String[] args) {
		long numeroUm = 0;
		long numeroDois = 1;
		long salvarNumero;
		System.out.println(numeroUm);
		System.out.println(numeroDois);
		for (int x = 1; x < 100; x++) {
			salvarNumero = numeroUm + numeroDois;
			numeroUm = numeroDois;
			numeroDois = salvarNumero;
			System.out.println(salvarNumero);

		}
	}
}