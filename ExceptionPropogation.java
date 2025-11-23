public class ExceptionPropogation {
  public static void main(String[] args) {
    m1();
  }
  public static void m1()
  {
      try{
        m2();
      }
      catch(Exception e)
      {
        System.out.println("Exception Handled by main...!");
      }
  }
  public static void m2()
  {
    System.out.println(10/0);
  }
}
