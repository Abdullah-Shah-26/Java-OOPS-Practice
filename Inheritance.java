class Shape{
 String color;  
 Shape()
 {
  System.out.println("I am Parent Constructor");
 }
 public void area()
 {
  System.out.println("Display Area");
 }
}

class Triangle extends Shape{
  Triangle()
  {
    System.out.println("I am Child Constructor");
  }
  public void area(int l, int h){
    System.out.println(1/2 * l * h );
  }
}

class EquilateralTriangle extends Triangle{
  EquilateralTriangle()
  {
    System.out.println("Multilevel Inheritance");

  }
  public void area(int l,int h)
  {
    System.out.println(1/2 * l * h);
  }
}

class Circle extends Shape{
  public void area(int r ) {
    System.out.println((3.14) * r * r);
    System.out.println("Hirarchial Inheritance");
  }
}

public class Inheritance {
  public static void main(String[] args) {
    Triangle t1 = new Triangle();
    t1.color = "Red";
  }
}
