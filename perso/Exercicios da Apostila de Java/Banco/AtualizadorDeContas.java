public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	AtualizadorDeContas (double selic){
		this.selic = selic;
	}

	public void roda (Conta c){
		this.saldoTotal += c.saldo * selic;
	}

	public double getSaldoTotal(){
		return saldoTotal;
	}
}