class A {
  int a = 10;
  static int b = 20;

  A() {
    System.out.println("Default Constructor");
  }

  {
    // Instance Block - cannot execute without instantiating object
    System.out.println("Instance Block");
    // Can access both static & normal variable
    System.out.println(a + " " + b);
  }

  static {
    // Can be called without Object - can only access static variable
    System.out.println("Static Block");
    System.out.println("Static variable : " + b);
  }
}

public class InstanceVsStatic {
  public static void main(String[] args) {
    A r = new A();
  }  
}
