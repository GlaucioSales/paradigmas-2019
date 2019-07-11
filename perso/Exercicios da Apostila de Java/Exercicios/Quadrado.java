class Quadrado{
	public static void main(String[] args) {
		teste:
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				System.out.print("*");
				break teste;
			}
			System.out.print("\n");
			System.out.println("testetesye");
		}
		System.out.println("teste");

		System.out.println(50/0.0);
		int x = 10;
		int y = 50;

		x -= y;
		System.out.println(x);



	}

}