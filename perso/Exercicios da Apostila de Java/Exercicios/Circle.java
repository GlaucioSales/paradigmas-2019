public class Circle {
   private double x;
   private double y;
   private double r;
   
   public Circle() {
      x = y = r = 0.0;
      System.out.println("New");
   }

   public double area() {
      return Math.PI * r * r;
   }
   public void setRadius(double radius){
      this.r = radius;
   }
   public void construtor(int x, int y, int r){
      this.x = x;
      this.y = y;
      this.r = r;
   }

   public static     void main(String[] args) {
      Circle c = new Circle();
      c.setRadius(10);
      System.out.println("Area do circulo: " + c.area());
      Circle c2 = new Circle();
      c2.setRadius(5.0);
      System.out.println("Area do novo circulo: " + c2.area());
      Circle c3 = new Circle();
      c3.construtor(5,5,1);
      System.out.println("Area do novo novo circulo: " + c3.area());
      c.r = 0.5;
      System.out.println("New Circle");
      
   }
}