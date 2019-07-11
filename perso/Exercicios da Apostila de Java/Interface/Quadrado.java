class Quadrado extends FormaGeometrica implements AreaCalculavel {

	public Quadrado (int lado){
		this.lado = lado;
	}

	public double calculaArea(){
		return this.lado * this.lado;
	}
}