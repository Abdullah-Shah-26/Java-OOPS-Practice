class A{
  int a  = 10;
  void disp()
  {
    System.out.println("Super Class");
  }
}
class B extends A{
  int a = 20;
  void show()
  {
    System.out.println(super.a);
  }
  void disp()
  {
    super.disp();
    System.out.println("sub class");
  }
}

public class SuperKeyword {
  public static void main(String[] args) {
    B r = new B();
    r.show();
    r.disp();    
  }
}
