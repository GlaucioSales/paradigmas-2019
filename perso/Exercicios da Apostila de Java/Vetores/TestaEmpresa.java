class TestaEmpresa{
	public static void main(String[] args) {
		args = new String[1];
		System.out.println(args[0]);

		Empresa emp1 = new Empresa();

		for (int i = 0; i < 5; i++) {
			Funcionario f = new Funcionario();
			f.nome = "a";
			f.salario = 1000 + i * 100;
			emp1.adicionaFuncionario(f);
		}


		Funcionario f1 = new Funcionario();
		f1.nome = "Glaucio";
		emp1.nome = "CompAct";
		f1.rg = "123132131";
		emp1.adicionaFuncionario(f1);
		Funcionario f2 = new Funcionario();
		f2.nome = "Bruno";
		emp1.adicionaFuncionario(f2);
		emp1.mostraEmpregados();
		System.out.println(emp1.contemFuncionario(f1));
	}
}