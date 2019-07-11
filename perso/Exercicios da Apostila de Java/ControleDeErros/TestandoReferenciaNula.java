public class TestandoReferenciaNula {
	public static void main(String args[]) {
		Conta c = null;
		System.out.println("Saldo atual " + c.getSaldo());
	}
}