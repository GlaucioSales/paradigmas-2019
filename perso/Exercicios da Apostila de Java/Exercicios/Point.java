public class Point {
	private double x;
	private double y;

	public void construtor (){
		x = 0.0;
		y = 0.0;
		System.out.println("Construido");
	}
	public void deslocamento (double dx, double dy ){
		this.x = x+dx;
		this.y = y+dy;
		System.out.println("Deslocado");	
	}
	public double distancia (double x1, double x2, double y1, double y2){
		double dx;
		double dy;
		double distancia;
		dx = x2 - x1;
		dy = y2 - y1;
		distancia = Math.sqrt(dx*dx + dy*dy);
		System.out.println(distancia);
		return distancia;
	}

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		p1.construtor();
		p2.construtor();
		p1.deslocamento(0,3);
		p2.deslocamento(4,0);
		p1.distancia(p1.x, p2.x, p1.y, p2.y);



	}
}