class A{
  int a;
  int b;
  void show()
  {
    a = 40;
    b = 60;
    System.out.println("I am show method");
    System.out.println(a + " " + b);
  }
  static void method()
  {
    System.out.println("I am static method "
    );
  }
  A()
  {
    a = 30;
    b = 40;
    System.out.println("I am Constructor, called before Normal method");
    System.out.println(a + " " + b);
  
  }
  {
    System.out.println("I am instance block, I am called before Constructor");
    System.out.println(a + " " + b);
  }
}

public class InstanceBlock {
  public static void main(String[] args) { 
    A.method();
    A r = new A();
    r.show();
  }  
}
