class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private Data entrada;
	private String rg;
	private static int nFuncionarios;
	private int indentificador;

	Funcionario(){
		Funcionario.nFuncionarios +=1;
		this.indentificador = nFuncionarios;
	}

	Funcionario (String nome){
		this.nome = nome;
		this.Funcionario();
	}

	public int getIndentificador(){
		return this.indentificador;
	}


	public static int nFuncionarios (){
		return Funcionario.nFuncionarios;
	}

	public void setDataDeEntrada(int d, int m, int a){
		entrada = new Data(d, m, a);
	}

	public void getMostrar(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		this.entrada.getEntrada();
		System.out.println("RG: " + this.rg);
	}

	public void setDepartamento (String departamento){
		this.departamento = departamento;
	}
	public void setSalarioMensal(double x){
		this.salario = x;
	}

	public void setBonificacao(double x){
		this.salario += x;
	}
	public double getCalculaGanhoAnual(){
		return this.salario * 12; 
	}
	public void setDemite(){
		departamento = null;
	}
	public void setRG(String rg){
		this.rg = rg;
	}
}