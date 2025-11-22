class A{
  int a;
  A(int a)
  {
    this.a = a;
  }
  void show()
  {
    System.out.println(a);
  }
}

public class ThisKeyword {
  public static void main(String[] args) {
  A r = new A(1000);
  r.show();  
  }
}
                                   