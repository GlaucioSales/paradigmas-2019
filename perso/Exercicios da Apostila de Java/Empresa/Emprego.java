class Emprego {
	public static void main(String[] args) {
		Funcionario manaus = new Funcionario("Manaus Gabriel Mota");
		Funcionario glaucio = new Funcionario("Glaucio Sales Santos");
		glaucio.setDataDeEntrada(25,05,2019);
		glaucio.getMostrar();
	}
}