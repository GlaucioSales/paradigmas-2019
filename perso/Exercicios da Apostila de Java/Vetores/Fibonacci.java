class Fibonacci {
	int calculaFibonacci(int x){
		int [] g = new int [x + 1];
		g[0] = 0;
		g[1] = 1;
		for (int n = 2; n <= x; n++) {
			g[n] = g[n-1] + g[n-2];	
		}
		return g[x];
	}

	public static void main(String[] args) {
		Fibonacci teste = new Fibonacci();
		System.out.println(teste.calculaFibonacci(6));
	}
}

//0 1 1 2 3 5 8
//0 1 2 3 4 5 6
