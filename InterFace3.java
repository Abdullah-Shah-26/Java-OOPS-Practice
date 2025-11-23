interface A{
  void a1();
  void a2();

  default void a3()
  {
    System.out.println("May or May Not Override in implemented classes");
  }
}
class B implements A{
  public void a1()
  {
    System.out.println("class b a1()");
  }
  public void a2()
  {
    System.out.println("class b a2()");
  }
  public void a3()
  {
    System.out.println("Overridden in class b");
  }
}

public class InterFace3 {
  public static void main(String[] args) {
   B b= new B();
   b.a1();
   b.a2();
   b.a3(); 
  }
}
