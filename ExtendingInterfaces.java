interface Gill{
  void add();
}
interface Raj extends Gill
{
  void sub();
}
class Ankit implements Raj{
  @Override
  public void add()
  {
    int a = 10, b = 20, c;
    c = a + b;
    System.out.println(c);
  }
  @Override
  public void sub()
  {
    int a = 20, b = 10, c;
    c = a - b;
    System.out.println(c);
  }
}

public class ExtendingInterfaces {
  public static void main(String[] args) {
    Ankit a = new Ankit();
    a.add();
    a.sub();    
  }
}
