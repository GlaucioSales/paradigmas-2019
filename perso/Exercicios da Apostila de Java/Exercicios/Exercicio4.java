class Exercicio4{
	public static void main(String[] args) {
		long  salvarValor = 0;
		for(long  x = 0; x <= 40; x++){
			if (x == 0){
				salvarValor = 1;
				System.out.println("fatorial de: " + x + " = " + salvarValor);
			}else{
				salvarValor = salvarValor * x;
				System.out.println("fatorial de: " + x + " = " + salvarValor);
			}
		}
	}
}