public class ContaCorrente extends Conta {
	public void deposita(double deposito) {
		super.deposita(deposito - 0.10);
	}
}