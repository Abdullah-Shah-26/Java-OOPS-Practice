
class A{
  int a;
  double b;
  String c;

  A()
  {
    a = 100;
    b = 4.000;
    c = "ankush";
  }
  A(int x)
  {
    a = x;
  }
  A(double y,String z)
  {
    b = y;
    c = z;
    System.out.println(y + " " + z);
  }
}
public class ConstructorOverloading {
  public static void main(String[] args) {
    A ref = new A();
    A ref2 = new A(10);
    A ref3 = new A(20.0000,"Damn It");
    System.out.println(ref.a + " " + ref.b + " " + ref.c);
    System.out.println(ref2.a);
    System.out.println(ref3.a + " " + ref3.b);
  }  
}
