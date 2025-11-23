class A {
  void Show()
  {
    System.out.println("Super Class");
  }
}

class B extends A {
  void Show()
  {
    System.out.println("Sub class");
  }
}

public class Override {
  public static void main(String[] args) {
   B r = new B();
   r.Show(); 
  }
}
