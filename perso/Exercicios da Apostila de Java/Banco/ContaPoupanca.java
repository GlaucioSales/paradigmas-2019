public class ContaPoupanca extends Conta {
	public void atualiza (double taxa){
		this.saldo += this.saldo * taxa * 3;
	}

	public void deposita (double deposito){
		super.deposita(deposito);
	}

}