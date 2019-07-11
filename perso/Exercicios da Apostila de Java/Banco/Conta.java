abstract class Conta {
	protected double saldo;

	public double getSaldo(){
		return saldo;
	}

	public void deposita (double deposito){
		this.saldo += deposito;
	}

	public void saca (double valor){
		this.saldo -= valor;
	}

	public void atualiza(double taxa){
		this.saldo += saldo * taxa;
	}


}