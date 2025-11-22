class A{
  int a;
  String b;
  A()
  {
    a = 10;
    b = "Learning JAVA";
    System.out.println(a + " " + b);
  }
  A(A ref)
  {
    a = ref.a;
    b = ref.b;
    System.out.println(a + " " + b);
  }
}

public class CopyConstructor {
  public static void main(String[] args) {
    A ref1 = new A();
    A ref2 = new A(ref1);
  }  
}
