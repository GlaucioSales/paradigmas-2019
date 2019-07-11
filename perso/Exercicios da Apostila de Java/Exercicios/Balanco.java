class Balanco {

	public static void main(String[] args) {
		int janeiro = 15000;
		int fevereiro = 23000;
		int marco = 17000;
		int gastosTrimestrais;
		float teste0;
		float mediaMensal;
		int teste;
		byte nada = 127;
		gastosTrimestrais = janeiro + fevereiro + marco;
		System.out.println("Valor gasto total:" + gastosTrimestrais);
		mediaMensal = gastosTrimestrais / 3;
		System.out.println("Valor da Media Mensal:" + mediaMensal);
		teste = (int)mediaMensal;
		System.out.println("valor da media mensal inteiro:" + teste);
		teste0 = 0.0f;

		for (int i = 0; i < 100; i++) {
			if (i > 50 && i < 60) {
				System.out.println("vem aqui");
				continue;
			}
			System.out.println(i);
		}
	}
}