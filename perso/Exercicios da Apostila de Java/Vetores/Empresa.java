
class Empresa{
	String nome;
	String cnpj;
	Funcionario[] empregados = new Funcionario[10];

	void adicionaFuncionario(Funcionario x){
		for (int n = 0; n < this.empregados.length; n++) {
			if (this.empregados [n] == null) {
				this.empregados [n] = x;
				break;	
			}
		}
		
	}
	void mostraEmpregados (){
		for (int n = 0; n < this.empregados.length; n++) {
			if (this.empregados[n] == null)
				break;
			System.out.println("Funcionario na posicao: " + n);
			System.out.println(this.empregados[n].nome);
		}	
	}
	boolean contemFuncionario(Funcionario x){
		for (int n = 0; n < this.empregados.length ; n++) {
			if (x == empregados[n])
				return true;		
		}
		return false;
	}
	
}
