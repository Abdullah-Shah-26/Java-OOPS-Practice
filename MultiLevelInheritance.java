// Super Class
class A{
  int a, b, c;
  void add()
  {
    a = 10;
    b = 20;
    c = a + b;
    System.out.println("Sum of 2 No's : "+c);
  }
  void sub()
  {
    a = 200;
    b = 100;
    c = a - b;
    System.out.println("Sub of 2 No's : "+c);
  }
}
// Subclass 1
class B extends A
{
  void mul()
  {
    a = 10;
    b = 20;
    c = a*b;
    System.out.println("Multiplication : "+c);    
  }
  void div()
  {
    a = 10;
    b = 2;
    c = a/b;
    System.out.println("Division : "+c);
  }
}
//  Subclass 2
class C extends B{
  void mod()
  {
    a = 10;
    b = 4;
    c = a%b ;
    System.out.println("Modulo : "+c);
  }
}

public class MultiLevelInheritance {
  public static void main(String[] args) {
  C r = new C();
  r.add();
  r.mul();
  r.div();
  r.mod();
  }
}
