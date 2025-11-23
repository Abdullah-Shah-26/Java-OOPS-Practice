class A{
  // Var Args Method
  void add(int ... a)
  { 
     int sum = 0;
     for(int x : a)
     {
      sum = sum + x;
     }
     System.out.println(sum);
  }
}

public class VarArg {
  public static void main(String[] args) {
    A r = new A();
    r.add();
    r.add(10);
    r.add(10,20);
    r.add(10,20,30);
  }
}
