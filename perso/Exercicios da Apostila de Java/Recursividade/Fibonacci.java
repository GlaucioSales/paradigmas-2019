class Fibonacci {
	int calculaFibonacci(int x){
		return x == 0 ? 0 : x == 1 ? 1 : calculaFibonacci (x - 1) + calculaFibonacci (x - 2);
	}
}