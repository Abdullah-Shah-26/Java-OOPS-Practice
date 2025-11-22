class A{
  void input()
  {
    System.out.println("Enter Your Name : ");
  }
}

class B extends A{
  void Show()
  {
    System.out.println("My Name is Abdullah  ");
  }
}

class C extends A{
  void Disp()
  {
    System.out.println("My name is Mary  ");
  }
}

public class HierarchialInheritance {
  public static void main(String[] args) {
    B r = new B();
    C r2 = new C();
    r.input();
    r.Show();
    r2.Disp();
  }
}
