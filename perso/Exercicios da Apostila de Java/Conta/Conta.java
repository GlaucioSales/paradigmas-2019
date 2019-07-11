class Conta{

	private String numero;
	private double saldo;
	private double limite;
	private Cliente titular;


	public double getSaldo (double quantidade){
		return this.saldo + this.limite;
	}

	public String getTitular() {
		
		String x;
		x = this.titular.getNome();
		return x;
	}

	public boolean sacar (double quantidade){
		if (this.saldo > quantidade) {
			this.saldo -= quantidade;
			return true;
		} else {
			return false;
		}

	}
	public void depositar(double quantidade){
		this.saldo += quantidade;
	}
	public boolean transferePara (Conta destino, double valor){
		if (this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

}